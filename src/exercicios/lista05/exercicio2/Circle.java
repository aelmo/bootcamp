package exercicios.lista05.exercicio2;

public class Circle extends GeometricFigure{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(radius,2));
    }

}
