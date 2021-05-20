package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Digite o primeiro numero");
        int n = scanner.nextInt();

        print("Digite o numero segundo numerp");
        int m = scanner.nextInt();

        for(int i=0;i<n;i++){
            print(i*m);
        }

        scanner.close();
    }
}
