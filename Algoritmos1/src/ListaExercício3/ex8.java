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
public class ex8 {

    public static void main(String[] args) {
        boolean p = primo(67);
        System.out.println(p);
    }

    public static boolean primo(int n) {
        int cont = 2;
        while (cont < 10) {
            if ((n % cont == 0)) {
                return false;
            }
            cont++;
        }
        return true;
    }
}
