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
public class ex17 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        float n = num();
        float[] v = vetor(tam);
        float[] popula = popula(v);
        float[] mult = multiplique(v, n);
        System.out.println("======");
        resultado(v);
    }

    public static float[] vetor(int tam) {
        float[] v = new float[tam];
        return v;
    }

    public static float num() {
        System.out.print("Digite o número real: ");
        float num = input.nextFloat();
        return num;
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

    public static float[] multiplique(float[] v, float num) {
        for (int i = 0; i < v.length; i++) {
            v[i] = v[i] * num;
        }
        return v;
    }

    public static void resultado(float[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores: " + v[i]);
        }
    }

}
