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
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite: ");
            int n = input.nextInt();
            if(max < n){
                max = n;
            }
        }
        System.out.println("MAIOR: " + max);
        
    }
}
