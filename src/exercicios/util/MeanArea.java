package exercicios.util;

import exercicios.lista05.exercicio2.GeometricFigure;

import java.util.Arrays;

public class MeanArea {
    public static double calculateMeanArea(GeometricFigure[] arr){
        double sum = 0.0;
        for(GeometricFigure elem : arr){
            sum+= elem.area();
        }
        return sum/arr.length;
    }
}
