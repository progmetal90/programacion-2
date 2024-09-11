import Ejercicio1.*;
import Ejercicio2.Clases.Pez;
import Ejercicio3.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ejercicio2();
        ArrayList<Pez> test = new ArrayList<>();
    }

    private static void ejercicio2() {
        Pez pez = new Pez();
        
        pez.comer();
    }

    private static void ejercicio1() {
        Autobus autobus = new Autobus();
        Tranvia tranvia = new Tranvia();
        Bicicleta bicicleta = new Bicicleta();
        
        autobus.arrancar();
        autobus.detener();
        System.out.println("La capacidad del autobus es de " + autobus.obtenerCapacidad() + " pasajeros.");

        tranvia.arrancar();
        tranvia.detener();
        System.out.println("La capacidad del tranvia es de " + tranvia.obtenerCapacidad() + " pasajeros.");

        bicicleta.arrancar();
        bicicleta.detener();
        System.out.println("La capacidad de la bicicleta es de " + bicicleta.obtenerCapacidad() + " pasajeros.");
    }
}
