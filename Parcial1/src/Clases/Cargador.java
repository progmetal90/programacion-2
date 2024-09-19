package Clases;

import Enums.Categoria;
import Enums.Marca;

public class Cargador extends Accesorio {
    // Potencia de cargador
    private float amperes;
    private float watts;

    public Cargador(String nombre, Categoria categoria, double precio, Marca marca, float amperes, float watts) {
        super(nombre, categoria, precio, marca);
        this.amperes = amperes;
        this.watts = watts;
    }

    public float getAmperes() {
        return amperes;
    }

    public void setAmperes(float amperes) {
        this.amperes = amperes;
    }

    public float getWatts() {
        return watts;
    }

    public void setWatts(float watts) {
        this.watts = watts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "amperes=" + amperes +
                ", watts=" + watts +
                '}';
    }
}
