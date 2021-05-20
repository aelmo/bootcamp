package exercicios.lista;

import exercicios.lista.util.ValidationsUtil;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números primos desejada:");
        int n = sc.nextInt();
        int primos = 0;
        int i = 0;

        while (primos<n){
            if (ValidationsUtil.isNumeroPrimo(i)) {
                primos++;
                System.out.println(i);
            }
            i++;
        }
        sc.close();

    }
}
