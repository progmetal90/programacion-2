package Clases;

import Enums.Categoria;
import Enums.Marca;
import Interfaces.I_Wifi;

public class Computadora extends Producto implements I_Wifi {
    private float tamanioPantalla; // Ancho en pulgadas
    private int nucleos;
    private int ram; // Cantidad de memoria expresada en GB

    public Computadora(String nombre, Categoria categoria, double precio, Marca marca, float tamanioPantalla, int nucleos, int ram) {
        super(nombre, categoria, precio, marca);
        this.tamanioPantalla = tamanioPantalla;
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tamanioPantalla=" + tamanioPantalla +
                ", nucleos=" + nucleos +
                ", ram=" + ram +
                '}';
    }
}
