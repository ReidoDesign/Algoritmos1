package BuscaBinária;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor
 */
public class teste {

    public static void main(String[] args) {
        int[] v = {1, 6, 7, 10, 20, 30, 40, 45, 60, 63, 67, 80};

        int indice = buscaCriticar(20, v);
        System.out.println("===");
        System.out.println(indice);
    }

    public static int buscaCriticar(int x, int v[]) {
        int m = 0;
        while (v[m] < x && m < v.length) {
            System.out.println(m);
            m++;
        }
        if (v[m] == x) {
            
            return x;
        } else {
            return -1;
        }
    }

}
