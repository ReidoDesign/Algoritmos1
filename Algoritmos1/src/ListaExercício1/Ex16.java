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
public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hInicial, hFinal; 
        System.out.print("Digite a Hora Inicial: ");
        hInicial = input.nextInt();
        System.out.print("Digite a Hora Final: ");
        hFinal = input.nextInt();
        
        if(hInicial > hFinal){
            hInicial = (24 - hInicial) + hFinal;
            System.out.println("Duração do jogo: " + hInicial);
        }else if(hInicial < hFinal){
            hFinal = hFinal - hInicial;
            System.out.println("Duração do jogo: " + hFinal);
        }else{
            System.out.println("Duração do jogo 24 HORAS !!!!");
        }       
    }
}
