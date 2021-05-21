package exercicios.lista04.quartoExercicio;

public class Fracao {
    public static double somar(String frac1, String frac2) {
        double num1 = transformInNumber(frac1);
        double num2 = transformInNumber(frac2);
        return num1 + num2;
    }

    public static double multiplicar(String frac1, String frac2) {
        double num1 = transformInNumber(frac1);
        double num2 = transformInNumber(frac2);
        return num1 * num2;
    }
    public static double subtrair(String frac1, String frac2) {
        double num1 = transformInNumber(frac1);
        double num2 = transformInNumber(frac2);
        return num1 - num2;
    }

    public static double dividir(String frac1, String frac2) {
        double num1 = transformInNumber(frac1);
        double num2 = transformInNumber(frac2);
        return num1 / num2;
    }

    public static double somar(String frac1, int num2) {
        double num1 = transformInNumber(frac1);
         return num1 + num2;
    }

    public static double subtrair(String frac1, int num2) {
        double num1 = transformInNumber(frac1);
        return num1 - num2;
    }

    public static double multiplicar(String frac1, int num2) {
        double num1 = transformInNumber(frac1);
        return num1 * num2;
    }

    public static double dividir(String frac1, int num2) {
        double num1 = transformInNumber(frac1);
        return num1 / num2;
    }

    public static double somar(double num1, int num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, int num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, int num2) {
        return num1 / num2;
    }

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }



    private static double transformInNumber(String frac) {
        String[] numArr = frac.split("/");
        return Double.valueOf(numArr[0]) / Double.valueOf(numArr[1]);
    }
}
