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
public class ex21 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        String[] no = nome(tam);
        String[] pNome = populaNome(no);
        System.out.println("==============");
        int[] n = nota(tam);
        int[] pNota = populaNota(no, n);
        int media = media(n);
        System.out.println("==============");
        resultado(n, no, media);
    }

    public static int[] nota(int tam) {
        int[] n = new int[tam];
        return n;
    }

    public static String[] nome(int tam) {
        String[] nome = new String[tam];
        return nome;
    }

    public static int tam_vetor() {
        System.out.print("Qual tamanho do vetor? ");
        int tam = input.nextInt();
        return tam;
    }

    public static String[] populaNome(String[] no) {
        for (int i = 0; i < no.length; i++) {
            System.out.print("Nome do Aluno: ");
            no[i] = input.next();
        }
        return no;
    }

    public static int[] populaNota(String[] no, int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print("Nota do aluno " + no[i] + ": ");
            n[i] = input.nextInt();
        }
        return n;
    }

    public static int media(int[] n) {
        int soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma = soma + n[i];
        }
        int media = soma / n.length;
        return media;
    }

    public static void resultado(int[] n, String[] no, int media) {
        System.out.println("Média da sala: " + media);
        System.out.println("==============");
        for (int i = 0; i < n.length; i++) {
            if (n[i] > media) {
                System.out.println("O aluno " + no[i] + " teve a nota acima da média: " + n[i]);
            }
        }
    }

}
