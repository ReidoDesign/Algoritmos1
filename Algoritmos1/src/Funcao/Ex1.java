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
public class Ex1 {

    public static void main(String[] args) {
        String nota = imprimirNota(6.7);
        System.out.println(nota);
    }

    public static String imprimirNota(double nota) {
        String status;
        if (nota >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        return status;
    }

}
