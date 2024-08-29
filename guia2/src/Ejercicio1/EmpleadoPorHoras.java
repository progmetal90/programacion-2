package Ejercicio1;

public class EmpleadoPorHoras extends Empleado {
    private final double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(double salarioPorHora, int horasTrabajadas){
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularPago() {
        setSalario(salarioPorHora * horasTrabajadas);
        System.out.printf("El salario mensual del empleado por hora %s es %.2f\n", getNombre(), getSalario());
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }
}
