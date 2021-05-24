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
            Integer[] array = {3,4,3,4,2,3,43,4,5434,1,2,2,2,2,2,3,343,24,1,1,1,1,1,1,1,1,1,12,3,4,4,4,4,4,4,2,2,2,1,3,4,6,2,7,8,3,0,4};

            Comparator<Integer> c = (i1, i2) -> i2 - i1;

            Timer timer = new Timer();

            timer.start();
            obj.sort(array, c);
            timer.stop();
            System.out.println("Tempo em ms:" + timer.elapsedTime());

            Arrays.stream(array).forEach(item -> System.out.println(item));

            Timer timer1 = new Timer();
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
