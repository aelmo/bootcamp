package exercicios.lista07.segundoExercicio;

import java.util.Comparator;

public interface Sorter<T> {
    void sort(T arr[], Comparator<T> c);
}
