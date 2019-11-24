/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercício4;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class ex40 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tl = tam_linha();
        int tc = tam_coluna();
        int[][] m = matriz(tl, tc);
        int[][] popula = popula(m);
        System.out.println("======");
        resultado(m);
        System.out.println("======");
        int e = elemento_verificar();
        verificaPosition(m, e);
    }

    public static int tam_linha() {
        System.out.print("Qual tamanho da Linha? ");
        int tam = input.nextInt();
        return tam;
    }

    public static int tam_coluna() {
        System.out.print("Qual tamanho da Coluna? ");
        int tam = input.nextInt();
        return tam;
    }

    public static int[][] matriz(int tl, int tc) {
        int[][] m = new int[tl][tc];
        return m;
    }

    public static int[][] popula(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "] = ");
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    public static int elemento_verificar() {
        System.out.print("Qual número verificar na matriz? ");
        int e = input.nextInt();
        return e;
    }

    public static void resultado(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void verificaPosition(int[][] m, int e) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (e == m[i][j]) {
                    System.out.println("O elemento " + m[i][j] + " está na linha " + i + " coluna " + j);
                }
            }
        }
    }
}
