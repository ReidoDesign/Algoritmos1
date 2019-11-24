package Collection;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaPonto p = new ListaPonto();

        int e;
        int option;
        int indice;
        do {
            p.menu();
            option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("ALGORITMO FINALIZADO!");
                    break;
                case 1:
                    System.out.print("Elemento a ser adicionado: ");
                    p.setElemento(input.nextInt());
                    p.adicionaFinal(p);
                    p.impresso();
                    break;
                case 2:
                    System.out.print("Posição a ser adicionado: ");
                    p.setPosicao(input.nextInt());
                    System.out.print("Elemento a ser adicionado: ");
                    p.setElemento(input.nextInt());
                    p.adicionaPosicao(p);
                    p.impresso();
                    break;
                case 3:
                    System.out.print("Elemento a ser buscado: ");
                    p.setIndice(input.nextInt());
                    System.out.println("Posição do elemento é " + p.indice(p));
                    p.impresso();
                    break;
                case 4:
                    System.out.print("Posição que deseja remover: ");
                    p.setPosicao(input.nextInt());
                    p.remove(p);
                    p.impresso();
                    break;
                case 5:
                    System.out.println("Menor Ponto: " + p.menor(p));
                    System.out.println("Maior Ponto: " + p.maior(p));
                    System.out.println("Distância do maior e menor ponto: " + p.distancia(p.maior(p), p.menor(p)));
                    p.impresso();
                    break;
                case 6:
                    System.out.print("Informe o valor do RAIO: ");
                    p.setRaio(input.nextInt());
                    p.impressoCentroCirc(p, p.circunferencia(p));
                    p.impresso();
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA PARA O MENU!");
            }
        } while (option != 0);
    }
}
