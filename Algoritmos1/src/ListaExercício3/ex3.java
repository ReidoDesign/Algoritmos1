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
public class ex3 {

    public static void main(String[] args) {
        int fat = fatorial(5);
        System.out.println(fat);
    }

    public static int fatorial(int n) {
        int fat = 1;
        while (n > 0) {
            fat *= n;
            n--;
        }
        return fat;
    }
}
