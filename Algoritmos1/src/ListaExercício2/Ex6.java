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
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String n = "";
        String s = "";
        int max = 0;
        
        do{
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Sexo: ");
            String sexo = input.next();
            
            if(max < idade){
                max = idade;
                n = nome;
                s = sexo;
            }
            
            i++;
            
        }while(i < 3);
                System.out.println("\n");
                System.out.println("== DADOS ALUNO + VELHO ==");
                System.out.println("Nome: " + n);
                System.out.println("Idade: " + max);
                System.out.println("Sexo: " + s);
    }
}
