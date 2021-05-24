package exercicios.lista07.segundoExercicio;//package exercicios.lista07.segundoExercicio;

import exercicios.lista07.segundoExercicio.MyFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Sorter obj = MyFactory.getInstance("QuickSorterImple");
            QuickSortImple<Integer> sort = new QuickSortImple<Integer>();
            Integer[] array = {3,4,3,4,5};

            Comparator<Integer> c = (i1, i2) -> i2 - i1;

            obj.sort(array, c);

            Arrays.stream(array).forEach(item -> System.out.println(item));

            Timer timer = new Timer();

        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.toString());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
