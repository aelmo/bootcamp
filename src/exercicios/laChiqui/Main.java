package exercicios.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Convidados convidado1 = new ConvidadosMeli("Maria");
        Convidados convidado2 = new ConvidadosStandard("Marcia");
        List<Convidados> listaDeConvidados = List.of(convidado1, convidado2);

        Fogos primeiroFogo = new Fogos("Bom");
        Fogos segundoFogo = new Fogos("Boom");
        PacoteFogos pacoteDeFogos = new PacoteFogos();
        PacoteFogos pacoteDeFogos2 = new PacoteFogos();
        pacoteDeFogos.addFogos(primeiroFogo);
        pacoteDeFogos.addFogos(segundoFogo);
        pacoteDeFogos2.addFogos(primeiroFogo);
        pacoteDeFogos2.addFogos(segundoFogo);
        pacoteDeFogos.addPacoteFogos(pacoteDeFogos2);

        List<PacoteFogos> listaDePacotesDeFogos = new ArrayList<>();

        Evento evento = new Evento("Marte Group S.A.",listaDeConvidados, listaDePacotesDeFogos);
        evento.addFogos(primeiroFogo);
        evento.addFogos(pacoteDeFogos);
        evento.distribuirBolo();
        evento.explodirFogos();
    }
}
