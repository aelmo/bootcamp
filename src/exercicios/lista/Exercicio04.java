package exercicios.lista;

import exercicios.lista.util.ValidationsUtil;

import java.util.Scanner;

import static exercicios.lista.util.PrintUtil.print;
import static exercicios.lista.util.ValidationsUtil.isNumeroPrimo;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Digite a quantidade de números primos desejada:");
        int n = sc.nextInt();
        int primos = 0;
        int i = 0;

        while (primos<n){
            if (isNumeroPrimo(i)) {
                primos++;
                print(i);
            }
            i++;
        }
        sc.close();

    }
}
