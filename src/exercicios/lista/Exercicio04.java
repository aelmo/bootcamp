package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;
import static exercicios.util.ValidationsUtil.isNumeroPrimo;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Digite a quantidade de números primos desejada: ");
        int n = scanner.nextInt();
        int primos = 0;
        int i = 0;

        while (primos < n) {
            if (isNumeroPrimo(i)) {
                primos++;
                print(i);
            }
            i++;
        }

        scanner.close();
    }
}
