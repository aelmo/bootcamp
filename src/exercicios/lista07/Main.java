package exercicios.lista07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Amedeo", "12345678918");
        Pessoa segundaPessoa = new Pessoa("Bruno", "12345678912");
        Pessoa terceiraPessoa = new Pessoa("Roberto", "12345678914");

        System.out.println(pessoa.precedeA(segundaPessoa));

        Precedente<Pessoa>[] pessoaArr = new Pessoa[3];
        pessoaArr[0] = pessoa;
        pessoaArr[1] = segundaPessoa;
        pessoaArr[2] = terceiraPessoa;

        System.out.println("Antes do sort: " + Arrays.toString(pessoaArr));

        BubbleSort.sort(pessoaArr);

        System.out.println("Depois do sort: " + Arrays.toString(pessoaArr));

        Celular celular = new Celular(123459, 123);
        Celular segundoCelular = new Celular(12345, 232);
        Celular terceiroCelular = new Celular(543435, 543);

        Precedente<Celular>[] celularArr = new Celular[3];
        celularArr[0] = celular;
        celularArr[1] = segundoCelular;
        celularArr[2] = terceiroCelular;

        System.out.println("Antes do sort: " + Arrays.toString(celularArr));

        BubbleSort.sort(celularArr);

        System.out.println("Depois do sort: " + Arrays.toString(celularArr));
    }
}
