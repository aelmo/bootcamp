package exercicios.lista04.quartoExercicio;

public class Exercicio4 {
    public static void main(String[] args) {
        double somarPorStrings = Fracao.somar("1/2", "10/5");
        double somarPorDoubles = Fracao.somar(1/2, 10/5);
        double somarPorDoubleEInt = Fracao.somar(1/2,1);
        double somarPorDStirngEInt = Fracao.somar("1/2", 2);
    }
}
