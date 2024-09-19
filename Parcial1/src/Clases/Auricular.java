package Clases;

import Enums.Categoria;
import Enums.Marca;
import Interfaces.I_Bluetooth;

public class Auricular extends Accesorio implements I_Bluetooth {
    private int impedancia;

    public Auricular(String nombre, Categoria categoria, double precio, Marca marca, int impedancia) {
        super(nombre, categoria, precio, marca);
        this.impedancia = impedancia;
    }

    public int getImpedancia() {
        return impedancia;
    }

    public void setImpedancia(int impedancia) {
        this.impedancia = impedancia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "impedancia=" + impedancia +
                '}';
    }
}
