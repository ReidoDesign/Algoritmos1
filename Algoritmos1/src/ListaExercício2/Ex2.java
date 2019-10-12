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
public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite número: ");
        int n = input.nextInt();
        int i = 0;
        int soma = 0;
        
        while(i < n){
            i++;
            soma += i;
        }
        
        System.out.println("Soma: " + soma);
    }
}
