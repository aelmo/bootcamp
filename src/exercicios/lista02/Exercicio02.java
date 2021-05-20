package exercicios.lista02;

import java.util.HashMap;
import java.util.Map;

public class Exercicio02 {
    public static void main(String[] args) {
        double empresaX = 1.13;
        double empresaY = 18.4;

        int ano = 2021;

        while(empresaX < empresaY) {
            System.out.println("Empresa X - 01/01/" + ano + " - Valor da Empresa: " + String.format("%,.2f",empresaX) + "m" );
            System.out.println("Empresa Y - 01/01/" + ano + " - Valor da Empresa: " + String.format("%,.2f",empresaY) + "m" );
            System.out.println();

            empresaX = empresaX + (empresaX * (1.48));
            empresaY = empresaY + (empresaY * (0.32));

            ano++;
        }

        System.out.println("Empresa X - 01/01/" + ano + " - Valor da Empresa: " + String.format("%,.2f",empresaX) + "m" );
        System.out.println("Empresa Y - 01/01/" + ano + " - Valor da Empresa: " + String.format("%,.2f",empresaY) + "m" );
        System.out.println();

    }
}
