package ListaExercício3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class ex2 {

    public static void main(String[] args) {
        int soma = somatorio(4);
        System.out.println(soma);
    }

    public static int somatorio(int n) {
        int soma = 0;
        while (n > 0) {
            soma += n;
            n--;
        }
        return soma;
    }

}
