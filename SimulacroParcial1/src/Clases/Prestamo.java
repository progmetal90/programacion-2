package Clases;

import Interfaces.I_Prestable;
import jdk.jfr.Timespan;

import java.util.Date;

public class Prestamo {
    private final I_Prestable prestado;
    private final String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(I_Prestable prestado, String fechaPrestamo, String fechaDevolucion) {
        this.prestado = prestado;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public I_Prestable getPrestado() {
        return prestado;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        // Usar en caso de renovar prestamo de libro
        this.fechaDevolucion = fechaDevolucion;
    }
}
