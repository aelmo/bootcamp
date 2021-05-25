package exercicios.dakar;

public interface Socorrista<T extends Veiculo> {
    void socorrer(T t, String d);
}
