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
public class ex20 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] popula = popula(v);
        int[] ordena = ordena(v, tam);
        System.out.println("======");
        resultado(ordena);
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

    public static int[] ordena(int[] v, int tam) {
        int[] m = new int[tam];
        int cont = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 3 == 0) {
                m[cont] = v[i];
                cont++;
            }
        }

        return m;
    }

    public static void resultado(int[] m) {
        for (int j = 0; j < m.length; j++) {
            System.out.println("Divisiveis por 3: " + m[j]);
        }
        System.out.println("=====================");
        for (int i = 0; i < m.length; i++) {
            if ((i % 2 == 0)) {
            } else {
                System.out.println("Posição Impar: " + m[i]);
            }
        }
    }

}
