/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author Vitor
 */
public class Implementa_pilha {

    int elementos[];
    int topo;

    public Implementa_pilha() {
        elementos = new int[10];
        topo = -1; // Posição inválida do vetor;
    }

    public void push(int e) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elementos[topo] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return (topo == elementos.length - 1);
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }

    public static void main(String[] args) {
        Implementa_pilha p = new Implementa_pilha();
        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        while (!p.isEmpty()) {
            int elemento = p.pop();
            System.out.println("Desempilhei " + elemento);
        }

        //int e = p.pop();
    }
}
