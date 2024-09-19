package Clases;

import Interfaces.I_LeibleOnline;

public class Ebook extends Material implements I_LeibleOnline {
    // Si esta leido, aparecera marcado como tal en la plataforma
    private boolean leido = false;
    
    @Override
    public void leerOnline() {
        System.out.println("Esta leyendo " + getTitulo() + " online!");
        leido = true;
    }
    
    public void descargar() {
        System.out.println("Ha descargado " + getTitulo());
    }
}
