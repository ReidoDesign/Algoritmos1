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
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a, b, divisao; 
        System.out.print("Digite A: ");
        a = input.nextFloat();
        System.out.print("Digite B: ");
        b = input.nextFloat();
        
        if(a > b){
            divisao = a / b;
        }else{
            divisao = b / a;
        }
        
        System.out.println("Divisao do maior pelo menor: " + divisao);
        
    }
}
