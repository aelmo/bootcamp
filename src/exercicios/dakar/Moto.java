package exercicios.dakar;

public class Moto extends Veiculo{

    public Moto(){}
    public Moto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300.0, 2);
    }
}
