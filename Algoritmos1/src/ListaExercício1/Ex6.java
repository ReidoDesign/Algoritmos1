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
public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, trianguloRetangulo, trapezio, quadrado, retangulo, perimetro;
        double areaCirculo;
        System.out.print("Digite num1: ");
        a = input.nextInt();
        System.out.print("Digite num2: ");
        b = input.nextInt();
        System.out.print("Digite num3: ");
        c = input.nextInt();
        System.out.println("==========================");
        
        trianguloRetangulo = (a * c) * 2;
        System.out.println("Área do triangulo retangulo: " + trianguloRetangulo);
        
        areaCirculo = (c * c) * 3.14159;
        System.out.println("Área do circulo: " + areaCirculo);
        
        trapezio = ((a + b) * c) / 2; 
        System.out.println("Área do trapézio: " + trapezio);
        
        quadrado = b * 4;
        System.out.println("Área do quadrado: " + quadrado);
        
        retangulo = a * b;
        System.out.println("Área do retangulo: " + retangulo);
        
        perimetro = (a + b) * 2;
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
