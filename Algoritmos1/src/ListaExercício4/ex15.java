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
public class ex15 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] popula = popula(v);
        int[] ordena = ordena(v);
        System.out.println("======");
        resultado(v);
    }

    public static int[] vetor(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int tam_vetor() {
        System.out.print("Qual tamanho do vetor? ");
        int tam = input.nextInt();
        return tam;
    }

    public static int[] popula(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Elementos: ");
            v[i] = input.nextInt();
        }
        return v;
    }

    public static int[] ordena(int[] v) {

        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < i; j++) {
                if (v[i] < v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        return v;
    }

    public static void resultado(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores: " + v[i]);
        }
    }

}
