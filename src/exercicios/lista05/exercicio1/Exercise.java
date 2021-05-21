package exercicios.lista05.exercicio1;

public class Exercise {
    public static void main(String[] args) {
        try {
            LowPassword lPassword = new LowPassword();
            MidPassword mPassword = new MidPassword();
            StrongPassword sPassword = new StrongPassword();

            lPassword.setPwd("jjbatwews4");
            mPassword.setPwd("jjbatwews4");
            sPassword.setPwd("jjbatwews4");
        } catch(SecurityException e) {
            System.out.println("A senha não condiz com a segurança adequada");
        }

    }
}
