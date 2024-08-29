package Ejercicio4;

public class Cilindro extends Circulo {
    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double calcularVolumen() {
        return super.calcularArea() * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * super.calcularArea() + 2 * Math.PI * altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int suma(int num1, int num2){
        return num1 + num2;
    }

    public double suma(double num1, double num2){
        return num1 + num2;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "radio=" + getRadio() +
                ", altura=" + altura +
                ", area base=" + super.calcularArea() +
                ", area=" + calcularArea() +
                ", volumen=" + calcularVolumen() +
                '}';
    }
}
