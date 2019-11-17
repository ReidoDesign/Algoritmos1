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
public class ex5 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] popula = popula(v);
        int s = soma_elementos(v);
        int m = media(s, tam);
        System.out.println("==========");
        resultado(v, s, m);
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

    public static int soma_elementos(int[] v) {
        int s = 0;
        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        return s;
    }
    
    public static int media(int soma, int tam){
        int media = soma / tam;
        return media;
    }

    public static void resultado(int[] v, int s, int m) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores: " + v[i]);
        }
        System.out.println("======\n" + "Média dos vetores: " + m);
        System.out.println("======\n" + "Soma dos vetores: " + s);
    }

}