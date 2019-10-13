/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercício3;

/**
 *
 * @author Vitor
 */
public class ex14 {

    public static void main(String[] args) {
        int soma = soma(10, 16);
        System.out.println(soma);
    }

    public static int soma(int a, int n) {
        int soma = 0;
        int aux = a + 1;
        while (aux <= n) {
            soma += aux;
            aux++;
        }
        if (n < 1) {
            return -1;
        }
        return soma;
    }
}
