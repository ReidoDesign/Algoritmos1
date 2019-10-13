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
public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, c, delta, x1, x2; 
        System.out.print("Digite A: ");
        a = input.nextFloat();
        System.out.print("Digite B: ");
        b = input.nextFloat();
        System.out.print("Digite C: ");
        c = input.nextFloat();
        
        delta = (b * b) + (- 4 * (a * c));
        x1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);
        if(delta < 0){
            System.out.println("Impossível calcular!!");
        }
        System.out.println("Valor de x1: " + x1);
        System.out.println("Valor de x2: " + x2);
    }
}
