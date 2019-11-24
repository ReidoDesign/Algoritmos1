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
public class Ex3 {

    public static void main(String[] args) {
        int[] v = {2, 6, 7, 10, 20, 30, 40, 45, 60, 63, 67, 80};
        
        int diferenca = diferenca(v);
        System.out.println(diferenca);
        
        int indice = binario(20, v);
        //System.out.println(indice);
    }

    public static int binario(int x, int[] v) {
        int meio, i, f;
        i = 0;
        f = v.length - 1;

        while (i <= f) {
            meio = (i + f) / 2;
            if (v[meio] == x) {
                return meio;
            } else if (v[meio] < x) {
                i = meio + 1;
            } else if (v[meio] > x) {
                f = meio - 1;
            }
        }
        return -1;
    }
    
    public static int diferenca(int[] v){
        int maior = v[0];
        int menor = v[0];
        
        for (int i = 0; i < v.length; i++) {
            if(v[i] < menor){
                menor = v[i];
            }
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior - menor;
    }
}
