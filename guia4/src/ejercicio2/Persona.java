package ejercicio2;

import java.util.Objects;

public class Persona {
    private static final int imcBajo = -1;
    private static final int imcNormal = 0;
    private static final int imcAlto = 1;
    
    private String nombre;
    private int edad;
    private int dni;
    private Sexo sexo = Sexo.HOMBRE;
    
    private float peso; // Kilos
    private float altura; // Metros

    public Persona() {
        dni = generarDni();
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = generarDni();
    }

    public Persona(String nombre, int edad, Sexo sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        dni = generarDni();
    }
    
    public int calcularIMC() {
        
        float imc = (float) (peso/Math.pow(altura, 2));
        
        if (imc < 20) return imcBajo;
        else if (imc > 20) return imcAlto;
        else return imcNormal;
    }
    
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private int generarDni() {
        return (int) (Math.random() * 10000000);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
