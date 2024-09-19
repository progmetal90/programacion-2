package Interfaces;

public interface I_Nfc {
    default void pagoContactless() {
        System.out.println("Se ha efectuado un pago contactless");
    }
}
