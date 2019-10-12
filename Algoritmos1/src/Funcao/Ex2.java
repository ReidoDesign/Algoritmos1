/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcao;

/**
 *
 * @author Vitor
 */
public class Ex2 {

    public static void main(String[] args) {
        int m = maior(9, 11);
        System.out.println(m);
    }

    public static int maior(int a, int b) {
        int maior;
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        return maior;
    }
}
