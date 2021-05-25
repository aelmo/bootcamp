package exercicios.saveTheRopa;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vestuario r1 = new Vestuario("Lacoste","Camisa");
        Vestuario r2 = new Vestuario("Lacoste","Calca");
        Vestuario r3 = new Vestuario("Oakley","Oculos");

        Vestuario r4 = new Vestuario("Calvin Klein","Camisa");
        Vestuario r5 = new Vestuario("Renner","Calca");
        Vestuario r6 = new Vestuario("CeA","Oculos");

        List<Vestuario> listaDeVestuarios = new ArrayList<>();
        listaDeVestuarios.add(r1);
        listaDeVestuarios.add(r2);
        listaDeVestuarios.add(r3);

        GuardaRoupa guardaRoupa = new GuardaRoupa();
        int codigoGuardaRoupa = guardaRoupa.guardarVestuarios(listaDeVestuarios);

        List<Vestuario> listaDeVestuarios2 = new ArrayList<>();
        listaDeVestuarios2.add(r4);
        listaDeVestuarios2.add(r5);
        listaDeVestuarios2.add(r6);

        int codigoGuardaRoupa2 = guardaRoupa.guardarVestuarios(listaDeVestuarios2);

        guardaRoupa.mostrarVestuarios();
        System.out.println();
        System.out.println(guardaRoupa.devolverVestuarios(codigoGuardaRoupa));

    }


}
