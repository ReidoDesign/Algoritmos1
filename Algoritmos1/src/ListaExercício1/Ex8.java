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
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, c, d, media; 
        System.out.print("Digite num1: ");
        a = input.nextFloat();
        System.out.print("Digite num2: ");
        b = input.nextFloat();
        System.out.print("Digite num3: ");
        c = input.nextFloat();
        System.out.print("Digite num3: ");
        d = input.nextFloat();
        
        media = (a + b + c + d) / 4;
        System.out.println("Média Aritmética: " + media);
        
    }
}
