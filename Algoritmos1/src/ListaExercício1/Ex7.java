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
public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, hipotenusa; 
        System.out.print("Digite num1: ");
        a = input.nextInt();
        System.out.print("Digite num2: ");
        b = input.nextInt();
        
        hipotenusa = (a * a) + (b * b);
        System.out.println("Hipotenusa: " + Math.sqrt(hipotenusa));
        
    }
}
