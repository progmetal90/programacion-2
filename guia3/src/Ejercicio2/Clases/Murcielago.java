package Ejercicio2.Clases;

import Ejercicio2.Interfaces.I_Volar;

public class Murcielago extends Animal implements I_Volar {
    @Override
    public void comer() {
        System.out.println("El murciélago está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El murciélago está durmiendo.");
    }

    @Override
    public void volar() {
        System.out.println("El murciélago está volando.");
    }
}
