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
public class ex13 {

    public static void main(String[] args) {
        int div = divisores(9);
        System.out.println("Quantidade de divisores: " + div);
    }

    public static int divisores(int n) {
        int cont = 0;
        int d = 1;
        while (d < n) {
            d++;
            if (n % d == 0) {
                //System.out.println(d);
                cont++;
            }
        }
        return cont;
    }
}
