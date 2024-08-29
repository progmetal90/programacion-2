package Ejercicio5;

public class Estudiante extends Persona {
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String nombre, String apellido, String dni, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(nombre, apellido, dni, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }
}
