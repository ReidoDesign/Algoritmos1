/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcao;

/**
 *
 * @author Vitor
 */
public class Ex4 {

    public static void main(String[] args) {
        int mat = mat(1);
        System.out.println(mat);
    }

    public static int mat(int x) {
        int f = 0;
        if (x < -1) {
            f = x + 2;
        } else if ((-1 <= x) && (x <= 2)) {
            f = (x * x) - 4;
        } else if (x > 2) {
            f = (2 * x) - 1;
        }
        return f;
    }
}
