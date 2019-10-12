package ListaExercício2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor
 */
public class Ex8 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;
        
        for (int i = 13; i < 73; i++) {
            if(i % 2 == 0){
                soma += i;
                contador ++;
            }
        }
        float media = soma / contador;
        System.out.println("Média Aritmética: " + media);
    }
}
