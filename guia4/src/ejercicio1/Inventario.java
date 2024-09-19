package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventario {
    private final List<Libro> inventario = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        inventario.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        inventario.remove(libro);
    }

    public void eliminarLibro(String titulo) {
        for (Libro l : inventario) {
            if (Objects.equals(l.getTitulo(), titulo)) {
                eliminarLibro(l);
                return;
            }
        }
    }

    public Libro getLibroMasCaro() {
        double max = Double.MIN_VALUE;
        Libro libroMasCaro = null;
        
        for (Libro l : inventario) {
            double precio = l.getPrecio();
            if (precio > max) {
                max = precio;
                libroMasCaro = l;
            }
        }
        
        return libroMasCaro;
    }

    public Libro getLibroMasBarato() {
        double min = Double.MAX_VALUE;
        Libro libroMasBarato = null;

        for (Libro l : inventario) {
            double precio = l.getPrecio();
            if (precio < min) {
                min = precio;
                libroMasBarato = l;
            }
        }
        
        return libroMasBarato;
    }
    
    public int getTotalLibros() {
        return inventario.size();
    }
    
    public void mostrarLibros() {
        for (Libro l : inventario) {
            System.out.println(l);
        }
    }
    
    public double calcularPrecioTotal() {
        double total = 0d;
        
        for (Libro l : inventario) {
            total += l.getPrecio();
        }
        
        return total;
    }
    
    public Libro buscarPorTitulo(String titulo) {
        Libro resultado = null;
        
        for (Libro l : inventario) {
            if (Objects.equals(l.getTitulo(), titulo)) {
                resultado = l;
                break;
            }
        }
        
        return resultado;
    }
}
