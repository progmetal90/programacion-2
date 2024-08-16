public class Libro {
    private static int ultimaId = 0;

    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Libro(String titulo, String autor, double precio, int stock) {
        id = ultimaId;
        ultimaId++;

        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int copias) {
        if(stock < copias) {
            System.out.println("No hay stock suficiente!");
        }
        else {
            stock -= copias;
        }
    }

    public void agregarStock(int cantidad) {
        stock += cantidad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
