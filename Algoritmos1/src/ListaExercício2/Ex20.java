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
public class Ex20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorBanco = 0;
        double deposito, saque;
        int n;

        do {
            System.out.print("Digite 1 para Depósito \n"
                    + "Digite 2 para Saque \n"
                    + "Digite 3 para finalizar sessão \n"
                    + "-> ");
            n = input.nextInt();

            if (n == 1) {
                System.out.print("Valora a ser Depositado: ");
                deposito = input.nextDouble();
                valorBanco += deposito;
            } else if (n == 2) {
                System.out.print("Valor a ser Sacado: ");
                saque = input.nextDouble();
                valorBanco -= saque;
            } else if (n == 3) {
                System.out.println("Sessão encerrada!");
                if (valorBanco == 0) {
                    System.out.println("CONTA ZERRADA");
                } else if (valorBanco < 0) {
                    System.out.println("-> CONTA ESTOURADA: " + valorBanco);
                } else {
                    System.out.println("-> CONTA PREFERENCIAL: " + valorBanco);
                }
            }

        } while (n != 3);
    }
}
