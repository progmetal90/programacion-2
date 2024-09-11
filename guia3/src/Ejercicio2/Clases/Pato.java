package Ejercicio2.Clases;

import Ejercicio2.Interfaces.I_Caminar;
import Ejercicio2.Interfaces.I_Volar;

public class Pato extends Animal implements I_Volar, I_Caminar {
    @Override
    public void comer() {
        System.out.println("El pato está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El pato está durmiendo.");
    }

    @Override
    public void caminar() {
        System.out.println("El pato está caminando.");
    }

    @Override
    public void volar() {
        System.out.println("El pato está volando.");
    }
}
