package Ejercicio1;

public class Tranvia implements I_Transporte{
    private String ruta;
    private final int capacidad = 150;
    private final TipoTransporte tipo = TipoTransporte.TRANVIA;
    @Override
    public void arrancar() {
        System.out.println("El tranvía arrancó.");
    }

    @Override
    public void detener() {
        System.out.println("El tranvía se detuvo.");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }
    
    public void cambiarVia(int via){
        System.out.println("Se cambió a la via " + via);
    }

    public String getRuta() {
        return ruta;
    }
}
