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
public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,area; 
        System.out.print("Digite num1: ");
        num1 = input.nextInt();
        
        area = num1 * num1;
        System.out.println("valor: " + area);
    }
}
