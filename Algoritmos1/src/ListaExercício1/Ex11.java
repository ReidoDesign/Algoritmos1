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
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número natural: ");
        int num = input.nextInt();
        
        if(num < 0){
            System.out.println("Número NEGATIVO!!!");
        }else{
            System.out.println("Número POSITIVO!!!");
        }
        
    }
}
