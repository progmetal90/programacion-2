package Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(double salarioMensual){
        setSalario(salarioMensual);
    }

    @Override
    public void calcularPago() {
        System.out.printf("El salario mensual del empleado %s es %.2f\n", getNombre(), getSalario());
    }
}
