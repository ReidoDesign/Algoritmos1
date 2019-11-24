/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Binario {

    //Atributos
    private Object[] dados;
    private int topo;

    //Construtor - cria uma pilha vazia
    public Binario() {
        dados = new Object[50];
        topo = -1;
    }

    // métodos
    public boolean isFull() {
        return (topo == dados.length - 1);
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public void push(Object x) {
        if (!isFull()) {
            topo++;
            dados[topo] = x;
        } else {
            System.out.println("Pilha Cheia");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object x = dados[topo];
            topo--;
            return x;
        } else {
            System.out.println("Pilha Vazia!");
            return null;
        }
    }

    public Object top() {
        if (!isEmpty()) {
            return dados[topo];
        } else {
            System.out.println("Pilha Vazia!");
            return null;
        }
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        Scanner input = new Scanner(System.in);
        int n, r;
        System.out.print("Digite decimal: ");
        n = input.nextInt();

        do {
            r = n % 2;
            p.push(r);
            n = n / 2;
        } while (n != 0);
        System.out.print("Binário => ");

        while (!p.isEmpty()) {
            r = (int) p.pop();
            System.out.print(r);
        }
    }

}
