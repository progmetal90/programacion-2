package Ejercicio1;

public abstract class Empleado {
    private String nombre;
    private double salario;

    public abstract void calcularPago();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
