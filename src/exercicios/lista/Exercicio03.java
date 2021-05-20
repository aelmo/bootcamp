package exercicios.lista;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a verificação: ");
        int numero = scanner.nextInt();

        if (isNumeroPrimo(numero))
            System.out.println("Número é primo!");

        scanner.close();
    }

    private static boolean isNumeroPrimo(final int numero) {
        if (numero <= 1)
            return false;

        else if (numero == 2)
            return true;

        else if (numero % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2)
            if (numero % i == 0)
                return false;

        return true;
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
