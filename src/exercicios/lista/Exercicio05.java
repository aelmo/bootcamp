package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("digite o primeiro numero");
        int n = scanner.nextInt();
        print("digite o segundo numero");
        int m = scanner.nextInt();
        print("digite o terceiro numero");
        int d = scanner.nextInt();

        scanner.close();

        int i = 0;
        int j = 0;

        while (i < n) {
            String[] numberTransformed = String.valueOf(j).split("");

            if (numberTransformed.length < m) {
                j++;
                continue;
            }

            if (getOcurrenciesOnArray(numberTransformed, d) < m) {
                j++;
                continue;
            }

            print(j);

            j++;
            i++;
        }
    }

    public static int getOcurrenciesOnArray(String[] arr, int valueToCompare) {
        int result = 0;

        for(String item: arr) {
            if (item.equals(String.valueOf(valueToCompare))) {
                result++;
            }
        }

        return result;
    }
}
