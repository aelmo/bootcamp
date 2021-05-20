package exercicios.lista;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números primos desejada:");
        int n = sc.nextInt();
        int primos = 0;
        int i = 0;

        while (primos<n){
            if (isNumeroPrimo(i)) {
                primos++;
                System.out.println(i);
            }
            i++;
        }
        sc.close();

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
}
