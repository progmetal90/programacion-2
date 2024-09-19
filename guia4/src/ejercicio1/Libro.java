package ejercicio1;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int anioPublicacion;

    public Libro(String titulo, String autor, double precio, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
