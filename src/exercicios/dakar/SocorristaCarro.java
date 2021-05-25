package exercicios.dakar;

public class SocorristaCarro implements Socorrista<Carro>{

    @Override
    public void socorrer(Carro carro, String documento) {
        System.out.println("socorrendo carro " + documento);
    }
}
