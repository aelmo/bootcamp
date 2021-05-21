package exercicios.lista04.terceiroExercicio;

public class Counter {
    private Integer value;

    public Counter() {
    }

    public Counter(Integer value) {
        this.value = value;
    }

    public Counter(Counter counter) {
        this.value = counter.value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {
        this.value -= 1;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(2);
        counter.increase();
        System.out.println(counter);
        counter.decrease();
        System.out.println(counter);
    }
}

