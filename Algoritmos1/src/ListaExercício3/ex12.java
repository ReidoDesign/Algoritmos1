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
public class ex12 {
    public static void main(String[] args) {
        double p = peso(1.78, "homem");
        System.out.println(p);
    }

    public static double peso(double alt, String pe) {
        double h = (72.7 * alt) - 58;
        double f = (62.1 * alt) - 44.7;

        if ("homem".equals(pe)) {
            return h;
        } else if ("mulher".equals(pe)) {
            return f;
        }

        return -1;
    }
}
