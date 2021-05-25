package exercicios.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Convidados> listaDeConvidados = new ArrayList<>();
    private List<PacoteFogos> listaDePacotesDeFogos = new ArrayList<>();

    public void distribuirBolo(){
        System.out.println("Distribuindo bolos");
        for (Convidados convidado:this.listaDeConvidados){
            convidado.comerBolo();
        }
    }

    public void explodirFogos(){
        System.out.println("Explodindo fogos");
        for (PacoteFogos fogo:this.listaDePacotesDeFogos){
            fogo.explodirFogos();
        }
    }

    public void addFogos(Fogos fogo){
        PacoteFogos pacote = new PacoteFogos();
        pacote.addFogos(fogo);
        this.listaDePacotesDeFogos.add(pacote);
    }

    public void addFogos(PacoteFogos pacote){
        this.listaDePacotesDeFogos.add(pacote);
    }

    public Evento(List<Convidados> listaDeConvidados, List<PacoteFogos> listaDePacotesDeFogos) {
        this.listaDeConvidados = listaDeConvidados;
        this.listaDePacotesDeFogos = listaDePacotesDeFogos;
    }
}
