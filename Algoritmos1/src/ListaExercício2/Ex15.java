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
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Natural: ");
        int n = input.nextInt();
        int fat = 1;
        for (int i = 2; i <= n; i++) {
                fat = fat * i;
                System.out.println(fat);
            }
        System.out.println("Fatorial " + fat);
        }
    }
