package exercicios.lista02;

import java.util.Arrays;
import java.util.Collections;

import static exercicios.util.PrintUtil.print;

public class Exercicio01 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        orderByAsc(array);
        orderByDesc(array);
    }

    private static void orderByAsc(Integer[] arr) {
        Arrays.sort(arr);
        print("Ordem crescente");
        for (Integer elem : arr) {
            System.out.println(elem);
        }
    }

    private static void orderByDesc(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        print("Ordem decrescente");
        for (Integer elem : arr) {
            System.out.println(elem);
        }
    }
}
