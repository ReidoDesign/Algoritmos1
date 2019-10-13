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
public class ex15 {
    public static void main(String[] args) {
        int pot = potencia(5, 3);
        System.out.println(pot);
    }
    public static int potencia(int x, int z) {
        int pa = x;
        while (z > 1) {
            pa = pa * x;
            z--;
        }
        return pa;
    }
}
