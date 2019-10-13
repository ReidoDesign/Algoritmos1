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
public class Ex17 {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        
        int a, b, c, d; 
        System.out.print("Digite A: ");
        a = input.nextInt();
        System.out.print("Digite B: ");
        b = input.nextInt();
        System.out.print("Digite C: ");
        c = input.nextInt();
        System.out.print("Digite D: ");
        d = input.nextInt();
        
        if((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > 0) && (d > 0)) && (a % 2 == 0)){
            System.out.println("Valores ACEITOS");
        }else{
            System.out.println("Valores NÃO ACEITOS");
        }
        
    }
    
}
