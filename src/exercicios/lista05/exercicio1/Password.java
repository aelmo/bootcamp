package exercicios.lista05.exercicio1;

public class Password {
    private String pwd;
    private String regex;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setPwd(String pwd) {
        try {
            pwd.matches(this.regex);
        } catch(SecurityException e) {
            throw e;
        }
    }
}
