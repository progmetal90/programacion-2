package Ejercicio1;

import java.util.UUID;

public class Bicicleta implements I_Transporte {
    private final String numeroSerie = UUID.randomUUID().toString();
    @Override
    public void arrancar() {
        System.out.println("La bicicleta arrancó.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo.");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }
    
    public void ajustarAsiento(int altura) {
        System.out.println("Se ajustó el asiento a la altura" + 1);
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
}
