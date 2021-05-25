package exercicios.laChiqui;

public class ConvidadosMeli extends Convidados{

    public ConvidadosMeli(String nome) {
        super(nome);
    }

    @Override
    public void comerBolo(){
        System.out.println("Viva La Chiqui!!");
    }
}
