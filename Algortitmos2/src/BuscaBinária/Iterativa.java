package BuscaBinária;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class Iterativa {

    public static void main(String[] args) {
        int[] s = {1, 6, 7, 10, 20, 30, 40, 45, 60, 63, 67, 80};

        int indice = binaria(s, 20);
        System.out.println(indice);
    }

    private static int binaria(int[] s, int x) {

        int meio;
        int inicio = 0, fim = s.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (s[meio] == x) {
                return meio;
            } else if (s[meio] < x) {
                inicio = meio + 1;
            } else if (s[meio] > x) {
                fim = meio - 1;
            }
        }
        return -1;
    }

}
