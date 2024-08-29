package Ejercicio3;

import java.util.UUID;

public class Cliente {
    private final UUID id;
    private String nombre;
    private String email;
    private float descuento;

    public Cliente(String nombre, String email, float descuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }

    public float getDescuento() {
        return descuento;
    }
}
