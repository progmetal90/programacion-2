package Ejercicio5;

public class Staff extends Persona {
    private double salario;
    private Turno turno;

    public Staff(String nombre, String apellido, String dni, String email, String direccion, double salario, Turno turno) {
        super(nombre, apellido, dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }
}
