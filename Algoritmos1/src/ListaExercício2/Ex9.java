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
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int alunos = input.nextInt();
        int i = 0;
        int soma = 0;
        
        while(i < alunos){
            System.out.print("Nota Aluno " + (i + 1) + ": ");
            int nota = input.nextInt();
            soma += nota;
            i++;
        }
        int media = soma / i;
        System.out.println("==================");
        System.out.println("Média Aritmética: " + media);
    }
}
