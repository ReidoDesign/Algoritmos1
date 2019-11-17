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
public class ex16 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tam = tam_vetor();
        int[] v = vetor(tam);
        int[] vo = vetorOrdenado(tam);
        int[] popula = popula(v);
        int[] ordena = ordena(v, vo);
        System.out.println("======");
        resultado(vo);
    }

    public static int[] vetor(int tam) {
        int[] v = new int[tam];
        return v;
    }

    public static int[] vetorOrdenado(int tam) {
        int[] vo = new int[tam];
        return vo;
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

    public static int[] ordena(int[] v, int[] vo) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                vo[cont] = v[i];
                cont++;
            }
        }

        for (int j = 0; j < v.length; j++) {
            if (v[j] % 2 == 0) {
            } else {
                vo[cont] = v[j];
                cont++;
            }
        }
        return vo;
    }

    public static void resultado(int[] vo) {
        for (int i = 0; i < vo.length; i++) {
            System.out.println("Valores: " + vo[i]);
        }
    }

}
