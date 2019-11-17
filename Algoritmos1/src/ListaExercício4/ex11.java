/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercício4;

import static ListaExercício4.ex10.input;

/**
 *
 * @author Vitor
 */
public class ex11 {

    public static void main(String[] args) {
        int tam = tam_vetor();
        float[] v = vetor(tam);
        float[] popula = popula(v);
        int m = media(v, tam);
        System.out.println("======");
        System.out.println("Média = " + m);
        System.out.println("======");
        mult(v, m);
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

    public static int media(float[] v, int tam) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma / tam;
    }

    public static void mult(float[] v, int m) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > m) {
                if (v[i] % 2 == 0) {
                    System.out.println("Maior doque a média e PAR =  " + v[i]);
                }
            }
        }
    }

}
