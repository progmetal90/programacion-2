package Clases;

import java.util.UUID;

public abstract class Material implements Comparable<Material> {
    private final UUID id = UUID.randomUUID();
    private String titulo;
    private String autor;
    private String anio;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Material m) {
        // Comparar por titulo
        return this.titulo.compareTo(m.getTitulo());
    }
}
