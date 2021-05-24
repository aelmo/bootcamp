package exercicios.lista07.segundoExercicio;//package exercicios.lista07.segundoExercicio;

import exercicios.lista07.segundoExercicio.MyFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            MyFactory.getInstance("QuickSorterImple");
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.toString());
        }
    }
}
