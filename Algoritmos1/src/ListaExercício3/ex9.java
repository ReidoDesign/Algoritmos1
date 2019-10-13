/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercício3;

/**
 *
 * @author Vitor
 */
public class ex9 {
    
    public static void main(String[] args) {
        int idade = idade(20, 8, 5);
        System.out.println("Idade em dias: " + idade);
    }
    
    public static int idade (int a, int m, int d){
        return (a * 365) + (m * 30) + d;
    }
    
}
