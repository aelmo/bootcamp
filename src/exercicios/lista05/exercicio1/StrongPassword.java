package exercicios.lista05.exercicio1;

public class StrongPassword extends Password{
    public StrongPassword() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=.*)[a-zA-Z]{8,}$");
    }
}
