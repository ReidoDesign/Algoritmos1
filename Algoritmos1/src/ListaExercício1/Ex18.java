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
public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, n1, n2, n3; 
        System.out.print("Digite A: ");
        n1 = input.nextInt();
        System.out.print("Digite B: ");
        n2 = input.nextInt();
        System.out.print("Digite C: ");
        n3 = input.nextInt();
        
        if(n1 > n2 && n1 > n3 && n2 > n3){
            a = n1;
            b = n2;
            c = n3;
            System.out.println(a + "" + b + "" + c + "");
        }else if(n2 > n1 && n2 > n3 && n1 > n3){
           a = n2;
           b = n1;
           c = n3;
           System.out.println(a + "" + b + "" + c + "");
        }else if(n3 > n1 && n3 > n2 && n1 > n2){
           a = n3;
           b = n1;
           c = n2;
           System.out.println(a + "" + b + "" + c + "");
    }
        
    }
}
