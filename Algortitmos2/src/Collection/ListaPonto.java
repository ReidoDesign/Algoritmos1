package Collection;

/**
 *
 * @author Vitor
 */
public class ListaPonto {

    //Atributos
    private int elemento;
    private int posicao;
    private int indice;
    private int raio;
    private int[] vetor;
    private int tamVetor = 0;//Tamanho do vetor
    private int circunferencia;

    //construtor
    public ListaPonto() {
        this.elemento = elemento;
        this.posicao = posicao;
        this.indice = indice;
        this.raio = raio;
        this.vetor = new int[10];
        this.tamVetor++;
        this.circunferencia = 3;
    }

    //Getters e Setters
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    //Métodos
    public void menu() { //Método para criar MENU
        System.out.println("==== MENU =====");
        System.out.println("(1) - Adicionar um elemento no final da coleção;");
        System.out.println("(2) - Adicionar um elemento em uma posição da coleção;");
        System.out.println("(3) - Retornar o índice da primeira ocorrência de um elemento especificado na coleção;");
        System.out.println("(4) - Remover um elemento em uma posição na coleção;");
        System.out.println("(5) - Calcular a distância dos dois pontos mais distantes na coleção;");
        System.out.println("(6) - Retornar uma coleção de pontos contido em uma circunferência;");
        System.out.print("Digite: ");
    }

    //Adicionar elemento no final do vetor
    public void adicionaFinal(ListaPonto p) {
        for (int i = 0; i < vetor.length; i++) {
            if (this.vetor[i] == 0) { //Verifica a primeira posição vaga no vetor
                this.vetor[i] = p.elemento; //Coloca o elemento no vetor
                this.tamVetor++;  //Acrescenta 1 no tamanho do vetor;
                break;
            }
        }
    }

    //Adiciona elemento em uma determinada posição
    public void adicionaPosicao(ListaPonto p) {
        if (p.posicao < tamVetor) { //Verifica se á posição informada é válida;
            for (int i = this.tamVetor - 1; i >= posicao; i--) {//desloca os vetores a partir da posição para direita
                this.vetor[i + 1] = this.vetor[i]; //Passa os valores da próxima posição para a posição atual
            }
            this.vetor[p.posicao] = p.elemento; //Insere o elemento na posição
            this.tamVetor++; //Acrescenta 1 no tamanho do vetor;
        } else {
            System.out.println("POSIÇÃO INVÁLIDA!");
        }
    }
    
    //Retorna indice do elemento buscado
    public int indice(ListaPonto p) {
        for (int i = 0; i < vetor.length; i++) {
            if (p.indice == vetor[i]) { //Verifica se o elemennto está no vetor
                return i; // retorna o indice do elemento
            }
        }
        return -1; //retorna -1 se elemento não estiver no vetor
    }

    //Remove um elemento da lista
    public void remove(ListaPonto p) {
        if (p.posicao > this.vetor.length && p.posicao <= 0) { // verifica se a posição é válida sendo maior que 0 e menor que o tamanho do vetor;
            System.out.println("Posição Inválida!");
        }

        for (int i = p.posicao; i < this.tamVetor - 1; i++) {//Percorre o vetor a partir da posição que será removida
            this.vetor[i] = this.vetor[i + 1];//Passa o próximo elemento para posição removida
        }
        this.tamVetor--; //diminui em -1 o tamanho do vetor;
    }

    //Descobre o MAIOR PONTO do vetor
    public double maior(ListaPonto p) {
        double max = 0;
        for (int i = 0; i < this.tamVetor - 1; i++) {
            double x = Math.pow(vetor[i] - vetor[i + 1], 2); //Calcula o ponto usando dois elementos do vetor(elemento atual e o próximo);
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    //Descobre o MENOR PONTO do vetor
    public double menor(ListaPonto p) {
        double min = 100;
        for (int i = 0; i < this.tamVetor - 1; i++) {//O laço percorre até o ultimo elemento preenchido no vetor
            double x = Math.pow(vetor[i] - vetor[i + 1], 2); //Calcula o ponto usando dois elementos do vetor(elemento atual e o próximo);
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    //Calcula a distância entre os dois pontos mais distantes
    public double distancia(double maior, double menor) {
        return Math.sqrt(maior + menor); //Calcula a raiz quadrado dos dois pontos;
    }

    //Armazena os pontos dentro da circunferencia no vetor novo
    public double[] circunferencia(ListaPonto p) {
        double[] vc = new double[tamVetor - 1]; //cria novo vetor
        int k = 0; //contador auxiliar para contar posições do novo vetor
        for (int i = 0; i < this.tamVetor - 1; i++) {
            double pontos = Math.pow(vetor[i] - vetor[i + 1], 2); //Calcula o ponto usando dois elementos do vetor(elemento atual e o próximo);
            if ((pontos < p.raio) && (pontos > p.circunferencia)) { // Verifica se o ponto está dentro do raio;
                k++;
                vc[k] = pontos; //Insere o ponto dentro do novo vetor;
            }
        }
        return vc;
    }

    //Imprimi os pontos que estão dentro da circunferencia
    public void impressoCentroCirc(ListaPonto p, double[] vc) {
        System.out.println("===> Pontos que estão dentro do RAIO <===");
        for (int i = 0; i < vc.length; i++) {
            System.out.println("Pontos: " + vc[i]);
        }
    }

    //Método para imprimir vetor;
    public void impresso() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elementos => " + vetor[i]);
        }
    }

}
