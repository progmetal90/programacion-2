package Ejercicio1;

public class EmpleadoContratista extends EmpleadoPorHoras{
    private final double tarifaPorProyecto;

    public EmpleadoContratista(double salarioPorHora, int horasTrabajadas, double tarifaPorProyecto) {
        super(salarioPorHora, horasTrabajadas);

        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    @Override
    public void calcularPago() {
        setSalario(getSalarioPorHora() * getHorasTrabajadas() + tarifaPorProyecto);
        System.out.printf("El salario mensual del empleado contratista %s es %.2f\n", getNombre(), getSalario());
    }
}
