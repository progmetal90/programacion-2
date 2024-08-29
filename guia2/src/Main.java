import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.*;
import Ejercicio4.*;
import Ejercicio5.*;

public class Main {
    public static void main(String[] args) {
        ejercicio5();
    }

    private static void ejercicio5() {
        Estudiante e1 = new Estudiante("Pepe", "Argento", "123456","pepeargento@gmail.com", "Calle falsa 123", 2023, 9000, "Programacion");
        Estudiante e2 = new Estudiante("Cacho", "Gomez", "234567","cachogomez@gmail.com", "Calle falsa 123", 2023, 9000, "Programacion");
        Staff s1 = new Staff("Maria", "Perez", "111222333", "mariaperez@hotmail.com", "Calle falsa 123", 35000, Turno.maniana);
        Staff s2 = new Staff("Pedro", "Gimenez", "7654231", "pedrogimenez@hotmail.com", "Calle falsa 123", 25000, Turno.noche);

        Persona[] personas = new Persona[] {e1, e2, s1, s2};

        int cantStaff = 0;
        int cantEstudiantes = 0;
        double ingresoPorCuotas = 0.0;

        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            if (p instanceof Estudiante){
                cantEstudiantes++;
                ingresoPorCuotas += ((Estudiante) p).getCuotaMensual();
            }
            else if (p instanceof Staff){
                cantStaff++;
            }
        }
    }

    private static void ejercicio4() {
        Cilindro c1 = new Cilindro();
        Cilindro c2 = new Cilindro(3.0, "verde", 2.0);

        System.out.println(c1);
        System.out.println(c2);
    }

    private static void ejercicio3() {
        Cliente cliente = new Cliente("Manuel", "email@test.com", 10f);
        Factura factura = new Factura(100, cliente);

        System.out.println(cliente);
        System.out.println(factura);
    }

    private static void ejercicio2() {
        Autor joshuaBloch = new Autor("Joshua", "Bloch", "joshua@email.com", Genero.m);
        System.out.println(joshuaBloch);

        Libro effectiveJava = new Libro("Effective Java", 450, 150, joshuaBloch);
        System.out.println(effectiveJava);

        effectiveJava.setPrecio(500);
        effectiveJava.setStock(effectiveJava.getStock() + 50);
        System.out.println(effectiveJava);

        System.out.println(effectiveJava.getAutor());
        effectiveJava.imprimir();
    }
}
