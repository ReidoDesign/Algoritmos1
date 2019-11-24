/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto;

/**
 *
 * @author vitor.rsilva16
 */
public class Ponto {

    //Atributos
    private int x, y;

    //construtor
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    //Métodos
    public boolean igual(Ponto p) {
        return this.x == p.x && this.y == p.y;
    }

    public double distancia(Ponto p) {
        double distX = Math.pow(p.x - this.x, 2);
        double distY = Math.pow(p.y - this.y, 2);
        System.out.println(distX);
        System.out.println(distY);
        return Math.sqrt(distX + distY);
    }

}
