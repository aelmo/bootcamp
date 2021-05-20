package exercicios.lista;

import java.util.Scanner;

import static exercicios.util.PrintUtil.print;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Digite a quantidade de numeros que deseja");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            print(i*2);
        }
        sc.close();
    }
}