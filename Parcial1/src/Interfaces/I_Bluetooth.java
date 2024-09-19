package Interfaces;

public interface I_Bluetooth {
    default void emparejar() {
        System.out.println("Se ha emparejado el dispositivo");
    }
}
