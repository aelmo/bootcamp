package exercicios.lista05.exercicio2;

import exercicios.util.MeanArea;

public class Main {
    public static void main(String[] args) {
        GeometricFigure[] arr = new GeometricFigure[3];

        arr[0] = new Rectangle(2.0,1.0);
        arr[1] = new Triangle(2.0,4.0);
        arr[2] = new Circle(2.0);

        System.out.println(MeanArea.calculateMeanArea(arr));
    }
}
