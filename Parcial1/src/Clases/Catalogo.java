package Clases;

import Enums.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogo {
    private final List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Producto> filtrarProductosPorCategoria(Categoria categoria) {
        List<Producto> productos = new ArrayList<>();
        
        for (Producto producto : this.productos) {
            if (producto.getCategoria() == categoria) {
                productos.add(producto);
            }
        }
        
        Collections.sort(productos);
        
        return productos;
    }

    public List<Producto> filtrarProductosPorPrecio(double precioMinimo, double precioMaximo) {
        List<Producto> productos = new ArrayList<>();

        for (Producto producto : this.productos) {
            double precio = producto.getPrecio();
            if (precio >= precioMinimo && precio <= precioMaximo) {
                productos.add(producto);
            }
        }
        
        Collections.sort(productos);
        
        return productos;
    }
    
    public List<Celular> filtrarCelularesPorMarca(Marca marca) {
        List<Celular> celulares = new ArrayList<>();
        
        for (Producto producto : this.productos) {
            if (producto instanceof Celular && producto.getMarca() == marca) {
                celulares.add((Celular)producto);
            }
        }

        Collections.sort(celulares);
        
        return celulares;
    }
    
    public void altaComputadora(String nombre, Categoria categoria, double precio, Marca marca, float tamanioPantalla, int nucleos, int ram) {
        Computadora c = new Computadora(nombre, categoria, precio, marca, tamanioPantalla, nucleos, ram);
        productos.add(c);
    }

    public void altaCelular(String nombre, Categoria categoria, double precio, Marca marca, boolean liberado) {
        Celular c = new Celular(nombre, categoria, precio, marca, liberado);
        productos.add(c);
    }

    public void altaAuricular(String nombre, Categoria categoria, double precio, Marca marca, int impedancia) {
        Auricular a = new Auricular(nombre, categoria, precio, marca, impedancia);
        productos.add(a);
    }

    public void altaCargador(String nombre, Categoria categoria, double precio, Marca marca, float amperes, float watts) {
        Cargador c = new Cargador(nombre, categoria, precio, marca, amperes, watts);
        productos.add(c);
    }
}
