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
public class ex7 {
   
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] popula = popula(v);
        int e = elemento();
        System.out.println("======");
        resultado(v);
        System.out.println("======");
        mult(v, e);
    }
    
    public static int elemento(){
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

    public static void resultado(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Valores: " + v[i]);
        }
    }
    
    public static void mult(int[] v, int e){
        for (int i = 0; i < v.length; i++) {
             int m = v[i] * e;
            System.out.println(v[i] + "*" + e + " = " + m);
        }
    }

}

