package exercicios.lista02;

import java.util.Arrays;
import java.util.Collections;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer[] array =  {52, 10, 85, 1324, 1, 13, 62, 30, 12,127};
        Arrays.sort(array);
        System.out.println("Ordem crescente");
        for(Integer elem : array){
            System.out.println(elem);
        }

        System.out.println();
        System.out.println("Ordem decrescente");

        Arrays.sort(array, Collections.reverseOrder());
        for(Integer elem : array){
            System.out.println(elem);
        }
    }
}
