package ListaExercício3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor
 */
public class ex1 {

    public static void main(String[] args) {
        int menor = menor(11, 9, 10);
        System.out.println(menor);
    }

    public static int menor(int a, int b, int c) {

        int menor;

        if ((a < b) && (a < c)) {
            menor = a;
        } else if ((b < a) && (b < c)) {
            menor = b;
        } else {
            menor = c;
        }
        return menor;
    }

}
