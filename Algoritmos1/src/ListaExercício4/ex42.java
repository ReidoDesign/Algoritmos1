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
public class ex42 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tl = tam_linha();
        int tc = tam_coluna();
        int[][] m = matriz(tl, tc);
        int[][] m2 = matriz2(tl, tc);
        System.out.println("=== MATRIZ 1 ===");
        int[][] popula = popula(m);
        System.out.println("=== MATRIZ 2 ===");
        int[][] popula2 = popula2(m2);
        System.out.println("=== RESULTADO 1 ===");
        resultado(m);
        System.out.println("=== RESULTADO 2 ===");
        resultado(m2);
        System.out.println("======");
        int ma1 = maior_m(m);
        int ma2 = maior_m2(m2);
        produtoMaior(ma1, ma2);
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

    public static int[][] matriz2(int tl, int tc) {
        int[][] m2 = new int[tl][tc];
        return m2;
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

    public static int[][] popula2(int[][] m2) {
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("Matriz2[" + (i + 1) + "][" + (j + 1) + "] = ");
                m2[i][j] = input.nextInt();
            }
        }
        return m2;
    }

    public static void resultado(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void resultado2(int[][] m2) {
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int maior_m(int[][] m) {
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        System.out.println("Maior elemento da Matriz 1: " + max);
        return max;
    }
    
    public static int maior_m2(int[][] m2) {
        int max = 0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                if (m2[i][j] > max) {
                    max = m2[i][j];
                }
            }
        }
        System.out.println("Maior elemento da Matriz 2: " + max);
        return max;
    }

    public static void produtoMaior(int max1, int max2) {
        int produto = max1 * max2;
        System.out.println("Produto dos maiores elementos: " + produto);
    }
}
