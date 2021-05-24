package exercicios.lista07.segundoExercicio;

import java.util.Date;

public class Timer {

    public Date start() {
        return new Date();
    }

    public Date stop() {
        return new Date();
    }

    public Date elpsedTime(Date start, Date end) {
        System.out.println(start.getTime() - end.getTime());
        return start;
    }
}
