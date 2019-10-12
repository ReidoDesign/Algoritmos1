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
public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha = 2002;
        int s;
        
        do{
        System.out.print("Digite a Senha: ");
        s = input.nextInt();
        
        if(s == senha){
            System.out.println(s + " ACESSO PERMITIDO");
        }else{
            System.out.println(s + " SENHA INCORRETA");
        }
            
        }while(s != 2002);
    }
}
