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

        int option;
        do {
            p.menu();
            option = input.nextInt();
            switch (option) {
                case 0:
                    System.out.println("ALGORITMO FINALIZADO!");
                    break;
                case 1:
                    System.out.print("Elemento a ser adicionado: ");
                    int e = input.nextInt();
                    p.adicionaFinal(p, e);
                    p.impresso();
                    break;
                case 2:
                    System.out.print("Posição a ser adicionado: ");
                    int indice = input.nextInt();
                    System.out.print("Elemento a ser adicionado: ");
                    e = input.nextInt();
                    p.adicionaPosicao(p, indice, e);
                    p.impresso();
                    break;
                case 3:
                    System.out.print("Elemento a ser buscado: ");
                    int i = input.nextInt();
                    System.out.println("Posição do elemento é " + p.indice(i));
                    p.impresso();
                    break;
                case 4:
                    System.out.print("Posição que deseja remover: ");
                    indice = input.nextInt();
                    p.remove(indice);
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
                    int r = input.nextInt();
                    //p.circunferencia(p, r);
                    p.impressoCentroCirc(p, p.circunferencia(p, r));
                    p.impresso();
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA PARA O MENU!");
            }
        } while (option != 0);
    }
}
