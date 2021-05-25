package exercicios.dakar;

public class Main {
    public static void main(String[] args) {
        Corrida corrida1 = new Corrida(100.0, 10000.0, "Corrida", 10);

        Veiculo carro1 = new Carro(100.0, 20.0,40.0, "abccd");
        Veiculo carro2 = new Carro(200.0, 20.0,40.0, "abced");
        Veiculo carro3 = new Carro(300.0, 20.0,40.0, "abcfd");

        Veiculo moto1 = new Moto(300.0, 20.0,40.0, "edesadeas");

        corrida1.registrarVeiculo(carro1);
        corrida1.registrarVeiculo(carro2);
        corrida1.registrarVeiculo(carro3);
        corrida1.registrarVeiculo(moto1);

        corrida1.socorrerCarro(carro1.getPlaca());
        corrida1.socorrerCarro(carro3.getPlaca());

        corrida1.calculaVencedor();
    }
}
