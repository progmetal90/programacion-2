package Ejercicio1;

public class Autobus implements I_Transporte {
    private int numeroLinea;
    private final int capacidad = 50;
    private final TipoTransporte tipo = TipoTransporte.AUTOBUS;
    
    public Autobus() {
        numeroLinea = (int)Math.floor(Math.random()); 
    }
    
    @Override
    public void arrancar() {
        System.out.println("El autobús arrancó.");
    }

    @Override
    public void detener() {
        System.out.println("El autobús se detuvo.");
    }
    
    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }
    
    public void anunciarParada(String parada) {
        System.out.println("Próxima parada: " + parada);
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }
}
