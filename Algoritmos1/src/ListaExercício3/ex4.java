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
public class ex4 {
    public static void main(String[] args) {
        int f = fatorial(5);
        int s = somatorio(5);
        int d = divisao(f, s);
        
        System.out.println("Fatorial: " + f);
        System.out.println("Somatório: " + s);
        System.out.println("=======");
        System.out.println("Divisão: " + d);
    }

    public static int fatorial(int n) {
        int fat = 1;
        while (n > 0) {
            fat *= n;
            n--;
        }
        return fat;
    }

    public static int somatorio(int n) {
        int soma = 0;
        while (n > 0) {
            soma += n;
            n--;
        }
        return soma;
    }
    
    public static int divisao(int a, int b){
        return a / b;
    }
}
