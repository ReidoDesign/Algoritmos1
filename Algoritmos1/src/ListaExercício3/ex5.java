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
public class ex5 {

    public static void main(String[] args) {
        float b = bhaskara(12, 13, 0);
        System.out.println(b);
    }

    public static float bhaskara(int a, int b, int c) {
        float maior;

        float delta = (b * b) + (- 4 * (a * c));
        float x1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
        float x2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);
        if (delta < 0) {
            System.out.println("Impossível calcular!!");
        }
        if (x1 < x2) {
            System.out.println("x1 " + x1);
            return x1;
        } else if (x2 < x1) {
            System.out.println("x2 " + x2);
            return x2;
        }
        return -1;
    }
}
