package exercicios.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogos {
    private List<Fogos> listaDeFogos = new ArrayList<>();
    private List<PacoteFogos> listaDePacotesDeFogos = new ArrayList<>();

    public void addFogos(Fogos fogos){
        listaDeFogos.add(fogos);
    }

    public void addPacoteFogos(PacoteFogos pacoteFogos){
        listaDePacotesDeFogos.add(pacoteFogos);
    }

    public void explodirFogos(){
        for (Fogos fogo: listaDeFogos){
            fogo.explodir();
        }

        for (PacoteFogos fogo: listaDePacotesDeFogos){
            fogo.explodirFogos();
        }
    }
}
