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
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float l, r, quadrado, circulo;
        System.out.print("Digite num1: ");
        l = input.nextFloat();
        System.out.print("Digite num2: ");
        r = input.nextFloat();
        
        quadrado = (l * l) + (r * r);
        circulo = (float) ((l * l) * 3.14159);
        
        if(quadrado > circulo){
            System.out.println("Quadrado tem a maior área. " + quadrado);
        }else if(circulo > quadrado){
            System.out.println("Circulo tem a maior área. " + circulo);
        }else{
            System.out.println("ÁREA DE CIRCULO E QUADRADO SÃO IGUAIS.");
        }
        
    }
}
