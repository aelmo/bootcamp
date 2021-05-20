package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Digite a quantidade de números que deseja: ");
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++) {
            print(i * 2);
        }

        scanner.close();
    }
}