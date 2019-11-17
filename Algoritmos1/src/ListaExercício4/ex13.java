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
public class ex13 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Qual tamanho do vetor? ");
        int tam = tam_vetor();
        int[] v1 = vetor1(tam);
        int[] v2 = vetor2(tam);
        int[] vrecebe = vetor_recebe(v1, v2);
        System.out.println("==== Vetor 1 ====");
        int[] p1 = popula1(v1);
        System.out.println("==== Vetor 2 ====");
        int[] p2 = popula2(v2);
        int[] p3 = popula_vetor3(v1, v2, vrecebe);
        System.out.println("==== Vetor 3 ====");
        result(vrecebe);
    }

    public static int[] vetor1(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int[] vetor2(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int[] vetor_recebe(int[] v1, int[] v2) {
        int[] v = new int[v1.length + v2.length];
        return v;
    }

    public static int tam_vetor() {
        int tam = input.nextInt();
        return tam;
    }

    public static int[] popula1(int[] v1) {
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Elementos: ");
            v1[i] = input.nextInt();
        }
        return v1;
    }

    public static int[] popula2(int[] v2) {
        for (int i = 0; i < v2.length; i++) {
            System.out.print("Elementos: ");
            v2[i] = input.nextInt();
        }
        return v2;
    }

    public static int[] popula_vetor3(int[] v1, int[] v2, int[] vrecebe) {
        for (int i = 0; i < v1.length; i++) {
            vrecebe[i] = v1[i];
            vrecebe[i + v1.length] = v2[i];
        }
        return vrecebe;
    }

    public static void result(int[] vrecebe) {
        for (int i = 0; i < vrecebe.length; i++) {
            System.out.println("Terceiro vetor: " + vrecebe[i]);
        }
    }

}
