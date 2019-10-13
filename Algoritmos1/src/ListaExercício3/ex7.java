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
public class ex7 {

    public static void main(String[] args) {
        double r = resultado(5);
        System.out.println(r);
    }

    public static double resultado(double raio) {
        double vol, pi = 3.1416;
        vol = ((4 / 3) * pi * (raio * raio * raio));
        System.out.println(vol);
        return vol;
    }

}
