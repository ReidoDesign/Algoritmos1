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
public class Ex4 {

    public static void main(String[] args) {
        int v[] = {5, 10, 3, 2, 4, 7, 9, 8, 5};
        int c = comprimento(v);
        System.out.println(c);
    }

    public static int comprimento(int[] v) {

        int aux = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < v[i + 1]) {
                aux += 1;
            }
        }

        return aux;
    }

}
