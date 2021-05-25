package exercicios.dakar;

public class SocorristaMoto implements Socorrista<Moto>{
    @Override
    public void socorrer(Moto moto, String documento) {
        System.out.println("socorrendo moto " + documento);
    }
}
