package Ejercicio2.Clases;

import Ejercicio2.Interfaces.I_Nadar;

public class Pez extends Animal implements I_Nadar {
    @Override
    public void comer() {
        System.out.println("El pez está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El pez está durmiendo.");
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}
