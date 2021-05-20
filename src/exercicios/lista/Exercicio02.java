package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print("Digite o primeiro numero");
        int n = sc.nextInt();

        print("Digite o numero segundo numerp");
        int m = sc.nextInt();

        for(int i=0;i<n;i++){
            print(i*m);
        }

        sc.close();
    }
}
