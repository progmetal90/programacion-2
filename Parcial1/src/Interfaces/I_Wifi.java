package Interfaces;

public interface I_Wifi {
    default void conectarWifi(String nombreRed) {
        System.out.println("Se ha conectado a la red " + nombreRed);
    }

    default void desconectarWifi() {
        System.out.println("Se ha desconectado de la red WiFi");
    }
}
