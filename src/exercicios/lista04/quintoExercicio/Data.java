package exercicios.lista04.quintoExercicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private GregorianCalendar calendario = new GregorianCalendar();
    private final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private Date data;

    public Date getData(){
        return this.data;
    }

    public boolean dataInvalida(){
        return data == null;
    }

    public void adicionarDia(){
        if(dataInvalida()){
            System.out.println("Data inválida");
        } else
        calendario.add(Calendar.DAY_OF_MONTH, 1);
        data = calendario.getTime();
    }

    @Override
    public String toString() {
        return "Data{" +
                "calendario=" + calendario +
                ", formatoData=" + formatoData +
                ", data=" + data +
                '}';
    }
}
