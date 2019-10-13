package ListaExercício1;


import java.util.Scanner;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int base, expoente, potencia; 
        System.out.print("Digite base: ");
        base = input.nextInt();
        System.out.print("Digite expoente: ");
        expoente = input.nextInt();
        
        System.out.println("Potencia dos números: " + Math.pow(base, expoente));

        
    }
}
