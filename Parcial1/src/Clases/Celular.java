package Clases;

import Enums.Categoria;
import Enums.Marca;
import Interfaces.I_Bluetooth;
import Interfaces.I_Nfc;
import Interfaces.I_Wifi;

public class Celular extends Producto implements I_Wifi, I_Nfc, I_Bluetooth {
    private boolean liberado; // Lockeado a un proveedor o libre

    public Celular(String nombre, Categoria categoria, double precio, Marca marca, boolean liberado) {
        super(nombre, categoria, precio, marca);
        this.liberado = liberado;
    }

    public boolean isLiberado() {
        return liberado;
    }

    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "liberado=" + liberado +
                '}';
    }
}
