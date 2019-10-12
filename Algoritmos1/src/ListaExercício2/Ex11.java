package ListaExercício2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Natural: ");
        int n = input.nextInt();

        double div = 0;
        double soma = 0;
        for (double i = 1; i <= n; i++) {

            div = 1 / i;
            if (i % 2 == 0) {
                soma = soma - div;
            } else {
                soma = soma + div;
            }
            System.out.println(div);
        }
        System.out.println("==========");
        System.out.println("Soma : " + soma);
    }
}
