package exercicios.lista03.primeiroExercicio;

public class Estudante {

    private String nome;

    private Integer idade;

    private String matricula;

    private String serie;

    public Estudante(String nome, Integer idade, String matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
