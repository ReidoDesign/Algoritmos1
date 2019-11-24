/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenação;

/**
 *
 * @author Vitor
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] v = {3, 5, 5, 7, 9, 1, 2, 4, 6};
        //int [] v= { 8, 7, 6, 5, 4, 3, 2, 1 };
        mergeSort(0, v.length, v);
        imprimeVetor(v);
    }

    // A funcao recebe vetores crescentes v[p..q-1] e 
    // v[q..n-1] e rearranja v[p..n-1] em ordem crescente.
    public static void intercala(int p, int q, int n, int v[]) {
        int i, j, k, w[];
        w = new int[n - p];
        i = p;
        j = q; // preciso guardar o inicio e o meio dos vetores
        k = 0;

        while (i < q && j < n) {
            if (v[i] <= v[j]) {
                w[k++] = v[i++];
            } else {
                w[k++] = v[j++];
            }
        }
        // testa caso resta algum elemento no vetores
        while (i < q) {
            w[k++] = v[i++];
        }
        while (j < n) {
            w[k++] = v[j++];
        }

        for (i = p, j = 0; i < n; i++, j++) {
            v[i] = w[j];
        }
    }

    // A funcao mergesort rearranja o vetor v[p..n-1]
    // em ordem crescente
    public static void mergeSort(int p, int n, int v[]) {
        if (p < n - 1) {
            int q = (p + n) / 2;
            mergeSort(p, q, v);
            mergeSort(q, n, v);
            intercala(p, q, n, v);
        }
    }

    public static void imprimeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]:" + v[i]);
        }
    }
}
