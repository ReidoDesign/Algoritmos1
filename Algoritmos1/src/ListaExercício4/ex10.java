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
public class ex10 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        float[] v = vetor(tam);
        float[] popula = popula(v);
        int e = elemento();
        System.out.println("======");
        mult(v, e);
    }

    public static int elemento() {
        System.out.print("Digite o elemento: ");
        int e = input.nextInt();
        return e;
    }

    public static float[] vetor(int tam) {
        float[] v = new float[tam];
        return v;
    }

    public static int tam_vetor() {
        System.out.print("Qual tamanho do vetor? ");
        int tam = input.nextInt();
        return tam;
    }

    public static float[] popula(float[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Elementos: ");
            v[i] = input.nextInt();
        }
        return v;
    }

    public static void mult(float[] v, int e) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
            } else {
                float m = v[i] * e;
                System.out.println(v[i] + "*" + e + " = " + m);
            }

        }
    }

}
