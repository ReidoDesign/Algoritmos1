package ListaExercício1;


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
public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2; 
        System.out.print("Digite num1: ");
        num1 = input.nextInt();
        System.out.print("Digite num2: ");
        num2 = input.nextInt();
        
        num1 += 1;
        num2 += 1;
        
        System.out.println("Consecutivos Num1: " + num1
        + "\nConsecutivos Num2: " + num2);
    }
}
