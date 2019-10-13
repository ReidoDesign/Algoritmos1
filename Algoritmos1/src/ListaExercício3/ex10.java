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
public class ex10 {
    public static void main(String[] args) {
        String nad = nadador(12);
        System.out.println(nad);
    }

    public static String nadador(int n) {
        String status;
        if ((n > 5) && (n < 7)) {
            return status = "Infantil A";
        } else if ((n > 8) && (n < 10)) {
            return status = "Infatil B";
        } else if ((n > 11) && (n < 13)) {
            return status = "Juvenil A";
        } else if ((n > 14) && (n < 17)) {
            return status = "Juvenil B";
        } else if (n > 18) {
            return status = "Adulto";
        }
        return status = "Não está na categoria";
    }
}
