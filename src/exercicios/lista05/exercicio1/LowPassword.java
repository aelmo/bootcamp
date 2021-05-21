package exercicios.lista05.exercicio1;

public class LowPassword extends Password{

    public LowPassword() {
        super("^(?=.*[A-Za-z])(?=.*)[A-Za-z]{8,}$");
    }
}
