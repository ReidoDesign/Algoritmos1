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
public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Natural: ");
        int n = input.nextInt();
        int fibo = 0;
        int ant = 0;
        
        for (int i = 0; i < n; i++) {
            if(i == 1){
                fibo = 1;
                ant = 0;
            }else{
                fibo += ant;
                ant = fibo - ant;
            }
            if(fibo < 46){
            System.out.println(fibo);
            }
        }
    }
}
