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
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c; 
        System.out.print("Digite A: ");
        a = input.nextInt();
        System.out.print("Digite B: ");
        b = input.nextInt();
        System.out.print("Digite B: ");
        c = input.nextInt();
        
        if(a > b && a > c){
            System.out.println("Valor A é o MAIOR > " + a);
        }else if(b > a && b > c){
           System.out.println("Valor B é o MAIOR > " + b); 
        }else{
            System.out.println("Valor C é o MAIOR > " + c); 
        }
    }
}
