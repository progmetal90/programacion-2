package Ejercicio4;

public class Circulo {
    private double radio = 1.0;
    private String color = "rojo";

    public Circulo() {}

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
