package exercicios.lista07.segundoExercicio;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<BubbleSortSorterImple> {

    @Override
    public void sort(BubbleSortSorterImple[] arr, Comparator<BubbleSortSorterImple> c) {
        int num = arr.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (FALTA LOGICA DO IF) {
                    BubbleSortSorterImple temporaria = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaria;
                }
            }
        }
    }
}
