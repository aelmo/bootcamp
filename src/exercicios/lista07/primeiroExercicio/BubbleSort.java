package exercicios.lista07.primeiroExercicio;

public class BubbleSort {
    public static <T> void sort(Precedente<T>[] arr) {
        int num = arr.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (arr[j].precedeA((T)arr[j + 1]) > 0) {
                    Precedente<T> temporaria = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaria;
                }
            }
        }
    }
}
