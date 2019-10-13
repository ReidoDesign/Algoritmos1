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
public class ex11 {
    public static void main(String[] args) {
        String m = media(7.3);
        System.out.println("Sua média é " + m);
    }
    public static String media(double n) {
        String status;
        if ((n > 0) && (n < 4.9)) {
            return status = "D";
        } else if ((n > 5) && (n < 6.9)) {
            return status = "C";
        } else if ((n > 7) && (n < 8.9)) {
            return status = "B";
        } else if ((n > 9) && (n < 10)) {
            return status = "A";
        }
        return status = "Inválida";
    }
}
