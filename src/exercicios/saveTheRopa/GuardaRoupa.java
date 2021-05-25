package exercicios.saveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {
    private HashMap<Integer, List<Vestuario>> vestuarioMap = new HashMap<>();
    private int id = 0;

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        id++;
        vestuarioMap.put(id,listaDeVestuario);
        return id;
    }

    public void mostrarVestuarios(){
        System.out.println(vestuarioMap.toString());
    }

    public List<Vestuario> devolverVestuarios(Integer id){
        return this.vestuarioMap.get(id);
    }

}
