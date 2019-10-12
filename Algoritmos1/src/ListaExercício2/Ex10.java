package ListaExercício2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor
 */
public class Ex10 {
    public static void main(String[] args) {
        double div = 0;
        double soma = 0;
        for (double i = 1; i <= 20; i++) {
            div = 1 / i;
            soma = soma + div;
            System.out.println(div);
        }
        System.out.println("==========");
        System.out.println("Soma : " + soma);
    }
}
