package exercicios.lista03.primeiroExercicio;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String serie;

    private String codigoIdentificador;

    private List<Disciplina> disciplinas = new ArrayList<>();

    private List<Estudante> estudantes = new ArrayList<>();

    public Turma(String serie, String codigoIdentificador) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                ", disciplinas=" + disciplinas +
                ", estudantes=" + estudantes +
                '}';
    }
}
