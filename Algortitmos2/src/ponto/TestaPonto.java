/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto;

/**
 *
 * @author vitor.rsilva16
 */
public class TestaPonto {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(10, 2);
        Ponto p2 = new Ponto(12, 4);
        System.out.println(p1); // Métodos
        System.out.println(p2);
        boolean igual = p1.igual(p2);
        System.out.println("Iguais? " + igual);
        double d = p1.distancia(p2);
        System.out.println("Distância = " + d);
    }
}
