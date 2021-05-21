package exercicios.lista03.primeiroExercicio;

public class ManipulaClasse {
    public static void main(String[] args) {
        Estudante primeiroEstudante = new Estudante("João", 18, "333", "8");
        Estudante segundoEstudante = new Estudante("Maria", 20, "444", "8");
        Estudante terceiroEstudante = new Estudante("Bruno", 22, "888", "8");

        Disciplina primeiraDisciplina = new Disciplina("Matemática", 40);
        Disciplina segundaDisciplina = new Disciplina("Química", 5);
        Disciplina terceiraDisciplina = new Disciplina("História", 10);

        Turma primeiraTurma = new Turma("8", "B");
        Turma segundaTurma = new Turma("7", "B");

        primeiraTurma.addEstudante(primeiroEstudante);
        primeiraTurma.addDisciplina(primeiraDisciplina);

        segundaTurma.addEstudante(segundoEstudante);
        segundaTurma.addEstudante(terceiroEstudante);
        segundaTurma.addDisciplina(segundaDisciplina);
        segundaTurma.addDisciplina(terceiraDisciplina);

        System.out.println("Primeira turma: " + primeiraTurma);
        System.out.println("Segunda turma: " + segundaTurma);
    }
}
