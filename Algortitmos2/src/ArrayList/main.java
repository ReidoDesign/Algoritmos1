/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Vitor
 */
public class main {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Vitor");
        nome.add("Pedro");
        nome.add("Thiago");

        System.out.println(nome.contains("Thiago"));

        nome.remove("Pedro");

        System.out.println(nome.contains("Pedro"));
        System.out.println("Tamanho array nome " + nome.size());

        Object[] obj = nome.toArray();
        String[] nomeArray = nome.toArray(new String[nome.size()]);
        Object[] nomeArray2 = nome.toArray(new String[0]);

        ArrayList<String> paises = new ArrayList<>();
        paises.add("Japão");
        paises.add("China");
        paises.add("Brasil");
        paises.add("Australia");

        ArrayList<String> todos = new ArrayList<>();
        todos.addAll(nome);
        todos.addAll(paises);
        System.out.println("Soma todos os arrays " + todos.size());
        System.out.println(todos.get(0));
        todos.add(0, "Mark");
        System.out.println(todos.size());
        System.out.println(todos.get(0));
        todos.set(0, "Murillo");
        System.out.println(todos.get(0));
        System.out.println(todos.size());
        
        System.out.println(todos.indexOf("Vitor"));
        System.out.println(todos.lastIndexOf("Vitor"));
        
        System.out.println("Valores array " + todos);
        
        for(String atual: todos){
        //   System.out.println(atual);
        }
        
        Iterator<String> lista = todos.iterator();
        
        while(lista.hasNext()){
           String novaLista = lista.next();
            System.out.println("hasNext: " + novaLista);
            lista.remove();
        }
        
        System.out.println(todos.size());
        
    }
}
