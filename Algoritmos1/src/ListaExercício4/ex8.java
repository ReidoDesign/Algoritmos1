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
public class ex8 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] popula = popula(v);
        int e = elemento();
        System.out.println("======");
        String busca = busca(v, e);
        System.out.println(busca);
        System.out.println("======");
        resultado(v);
    }

    public static int elemento() {
        System.out.print("Digite o elemento: ");
        int e = input.nextInt();
        return e;
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

    public static String busca(int[] v, int e) {
        for (int i = 0; i < v.length; i++) {
            if (e == v[i]) {
                return "Elemento " + e + " encontrado na posição " + i;
            }
        }
        return "Elemento não encontrado!";
    }

    public static void resultado(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores: " + v[i]);
        }    
    }

}
