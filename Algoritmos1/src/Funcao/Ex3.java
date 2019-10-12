/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcao;

/**
 *
 * @author Vitor
 */
public class Ex3 {

    public static void main(String[] args) {
        String v = verificar(11);
        System.out.println(v);
    }

    public static String verificar(int n) {
        String status;
        if (n % 2 == 0) {
            status = "PAR";
        } else {
            status = "IMPAR";
        }
        return status;
    }
}
