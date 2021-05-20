package exercicios.lista;

import java.util.Scanner;

import static exercicios.lista.util.PrintUtil.print;
import static exercicios.lista.util.ValidationsUtil.isNumeroPrimo;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Digite um número para a verificação: ");
        int numero = scanner.nextInt();

        if (isNumeroPrimo(numero)) {
            print("Número é primo!");
        } else {
            print("Número não é primo!");
        }

        scanner.close();
    }

    // Maneira mais "custosa", só que + simples p/ leitura
    private static boolean isNumeroPrimoOutroApproach(final int numero) {
        if (numero <= 1)
            return false;

        for (int i = 2; i < numero; i++)
            if (numero % i == 0)
                return false;

        return true;
    }
}
