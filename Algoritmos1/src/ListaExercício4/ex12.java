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
public class ex12 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v1 = vetor1(tam);
        int[] v2 = vetor2(tam);
        System.out.println("==== Vetor 1 ====");
        int[] p1 = popula1(v1);
        System.out.println("==== Vetor 2 ====");
        int[] p2 = popula2(v2);
        int s1 = soma1(v1);
        int s2 = soma2(v2);
        System.out.println("==== Resultado ====");
        result(v1, v2, s1, s2, tam);
    }

    public static int[] vetor1(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int[] vetor2(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int tam_vetor() {
        System.out.print("Qual tamanho do vetor? ");
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

    public static int soma1(int[] v1) {
        int s1 = 0;
        for (int i = 0; i < v1.length; i++) {
            s1 = s1 + v1[i];
        }
        return s1;
    }

    public static int soma2(int[] v2) {
        int s2 = 0;
        for (int i = 0; i < v2.length; i++) {
            s2 = s2 + v2[i];
        }
        return s2;
    }

    public static void result(int[] v1, int[] v2, int s1, int s2, int tam) {
        int media1 = s1 / tam;
        int media2 = s2 / tam;
        System.out.println("Soma Vetor 1: " + s1);
        System.out.println("Média Vetor 1: " + media1);
        System.out.println("=========");
        System.out.println("Soma Vetor 2: " + s2);
        System.out.println("Média Vetor 2: " + media2);
         System.out.println("=========");

        if (s1 > s2) {
            System.out.println("Maior soma = " + s1);
        } else {
            System.out.println("Maior soma = " + s2);
        }

        if (media1 < media2) {
            System.out.println("Menor média = " + media1);
        } else {
            System.out.println("Menor média = " + media2);
        }

    }

}
