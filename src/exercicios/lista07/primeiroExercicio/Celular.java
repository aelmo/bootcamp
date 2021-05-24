package exercicios.lista07.primeiroExercicio;

public class Celular implements Precedente<Celular> {

    private int numero;

    private int holder;

    public Celular(int numero, int holder) {
        this.numero = numero;
        this.holder = holder;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }

    @Override
    public int precedeA(Celular celular) {
        if (this.numero == celular.getNumero())
            return 0;
        else if (this.numero < celular.getNumero())
            return -1;
        return 1;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", holder=" + holder +
                '}';
    }
}
