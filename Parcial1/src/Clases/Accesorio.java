package Clases;

import Enums.Categoria;
import Enums.Marca;

// Clase base para accesorios tales como parlantes, auriculares, cargadores, etc.
// Se podría extender esta clase para cada accesorio en particular o implementar interfaces.
// (ver ejemplo clases Cargador y Auricular)
public abstract class Accesorio extends Producto {
    protected Accesorio(String nombre, Categoria categoria, double precio, Marca marca) {
        super(nombre, categoria, precio, marca);
    }
}
