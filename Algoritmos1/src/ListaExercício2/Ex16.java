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
public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite Natural: ");
        int n = input.nextInt();
        int i = 0;
        do{
            System.out.print("Digite o Valor: ");
            int valor = input.nextInt();
            
            if(valor == 0){
                System.out.println(valor + " é um valor NULO");
            }
            if(valor % 2 == 0 && valor != 0){
                System.out.println(valor + " é um valor PAR");
            }
            
            if(valor % 2 == 0){
            }else{
                System.out.println(valor + " é um valor IMPAR");
            }
            
            if(valor > 0){
                System.out.println(valor + " é um valor POSITIVO");
            }else if(valor < 0){
                System.out.println(valor + " é um valor NEGATIVO");
            }
            
            System.out.println("===============");
            i++;
        }while(i < n);
        
    }
}
