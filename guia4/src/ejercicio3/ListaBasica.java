package ejercicio3;

import java.util.Stack;

public class ListaBasica implements I_Reproduccion {
    private String nombre;
    private Stack<Cancion> lista;
    private Cancion cancionActual;

    public ListaBasica(String nombre) {
        this.nombre = nombre;
        this.lista = new Stack<>();
    }

    @Override
    public void reproducir() {
        cancionActual = lista.pop();
    }
    
    public void cambiarCancion() {
        mostrarMensajePremium();
    }

    private void mostrarMensajePremium() {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM");
    }

    @Override
    public void addCancion(Cancion cancion) {

    }

    @Override
    public void removeCancion() {
        mostrarMensajePremium();
    }

    @Override
    public void verMiLista() {

    }
}
