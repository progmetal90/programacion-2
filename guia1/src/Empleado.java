public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    private int dni;

    public Empleado(String nombre, String apellido, int dni, int salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public void calcularSalarioAnual() {
        System.out.printf("El salario anual de %s %s es $%.2f", nombre, apellido, salario);
    }

    public void aumentarSalario(double porcentaje) {
        this.salario *= (1 + porcentaje / 100);
    }

    public void mostrar() {
        System.out.printf("Empleado %s %s - DNI %d - Salario: $%.2f\n", nombre, apellido, dni, salario);
    }
}
