/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcao;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Desafio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu = menu();

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        switch (menu) {
            case 1:
                double s = soma(a, b);
                System.out.println("Soma: " + s);
                break;
            case 2:
                double m = multiplicacao(a, b);
                System.out.println("Multiplicacao: " + m);
                break;
            case 3:
                double sub = subtracao(a, b);
                System.out.println("Subtração: " + sub);
                break;
            case 4:
                double d = divisao(a, b);
                System.out.println("Divisão: " + d);
                break;
            case 5:
                double p = potencia(a, b);
                System.out.println("Potenciação: " + p);
                break;
            case 6:
                double r = raiz(a);
                System.out.println("Raiz quadrada: " + r);
                break;
            default:
                System.out.println("MENU INVÁLIDO");
        }
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENU ===");
        System.out.println("(1) = Soma");
        System.out.println("(2) = Multiplicação");
        System.out.println("(3) = Subtração");
        System.out.println("(4) = Divisão");
        System.out.println("(5) = Potenciação");
        System.out.println("(6) = Raiz Quadrada");
        System.out.print("=> ");
        int a = input.nextInt();
        return a;
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static double raiz(int a) {
        int n = 0;
        int qua = 0;
        while (n <= a) {
            n++;
            if (n * n == a) {
                qua = n;
                a = 0;
            }
        }
        return qua;
    }

    public static double potencia(double a, double b) {
        double pa = a;
        while (b > 1) {
            pa = pa * a;
            b--;
        }
        return pa;
    }
}
