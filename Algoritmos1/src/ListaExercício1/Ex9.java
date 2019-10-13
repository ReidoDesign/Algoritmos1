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
public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numCadastro, horasTrab;
        float valorHora, valorTotal; 
        System.out.print("Digite número do Cadastro: ");
        numCadastro = input.nextInt();
        System.out.print("Digite quantidade de Horas Trabalhadas: ");
        horasTrab = input.nextInt();
        System.out.print("Digite valor recebido por Horas Trabalhadas: ");
        valorHora = input.nextFloat();
        
        valorTotal = horasTrab * valorHora;
        System.out.println("=====================");
        System.out.println("Número Funcionário: " + numCadastro);
        System.out.println("Salário: R$ " + valorTotal);
        
    }
}
