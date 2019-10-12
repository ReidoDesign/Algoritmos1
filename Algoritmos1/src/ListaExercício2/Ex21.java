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
public class Ex21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Natural: ");
        int n = input.nextInt();
        int soma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println("Soma dos números: " + soma);
        if (soma == n) {
            System.out.println("## NÚMERO PERFEITO");
        } else {
            System.out.println("## NÚMERO NÃO PERFEITO");
        }
    }
}
