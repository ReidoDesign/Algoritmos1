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
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        float salario, totalVendas, comissao; 
        System.out.print("Digite o nome do vendedor: ");
        nome = input.nextLine();
        System.out.print("Digite o Salario: ");
        salario = input.nextFloat();
        System.out.print("Digite o total de vendas: ");
        totalVendas = input.nextFloat();
        
        comissao = ((15 * totalVendas) / 100) + salario;
        System.out.println("==================");
        System.out.println("O vendedor " + nome + " tem o salário final de: R$ " + comissao);
    }
}
