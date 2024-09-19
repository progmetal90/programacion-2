package Clases;

import Enums.Categoria;
import Enums.Marca;

import java.util.UUID;

public abstract class Producto implements Comparable<Producto> {
    private final UUID id = UUID.randomUUID();
    private String nombre;
    private Categoria categoria;
    private double precio;
    private Marca marca;
    private boolean baja = false; // Soft delete, marcar como true para que no aparezca en filtros

    protected Producto(String nombre, Categoria categoria, double precio, Marca marca) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public UUID getId() {
        return id;
    }

    public boolean isBaja() {
        return baja;
    }

    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                ", marca=" + marca +
                ", baja=" + baja + ", ";
    }
}
