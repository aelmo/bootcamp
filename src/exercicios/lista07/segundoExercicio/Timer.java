package exercicios.lista07.segundoExercicio;

import java.util.Date;

public class Timer {
    long start;
    long end;

    public void start() {
        this.start = new Date().getTime();
    }

    public void stop() {
        this.end = new Date().getTime();
    }

    public long elapsedTime() {
        return this.end - this.start;
    }
}
