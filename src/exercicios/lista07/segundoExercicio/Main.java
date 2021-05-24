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
            Integer[] array = new Integer[5000];

            for(int i = 4999; i>=0; i--) {
                array[i] = 2 + (int)(Math.random() * ((100 - 2) + 1));
            }

            Comparator<Integer> c = (i1, i2) -> i2 - i1;

            Timer timer = new Timer();

            timer.start();
            obj.sort(array, c);
            timer.stop();
            System.out.println("Tempo em ms:" + timer.elapsedTime());

            Arrays.stream(array).forEach(item -> System.out.println(item));
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
