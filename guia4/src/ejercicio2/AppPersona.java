package ejercicio2;

import java.util.*;

public class AppPersona {
    private Scanner scanner;
    private Set<Persona> personas = new HashSet<>();

    public AppPersona(Scanner scanner) {
        this.scanner = scanner;
    }

    public void ejecutar() {
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese sexo (M / F): ");
        Sexo sexo = Sexo.HOMBRE;
        String sexoStr = scanner.nextLine();
        if (!sexoStr.isEmpty() && sexoStr.toLowerCase().charAt(0) == 'f') sexo = Sexo.MUJER;

        System.out.println("Ingrese peso: ");
        float peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese altura: ");
        float altura = scanner.nextFloat();
        scanner.nextLine();
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        
        p3.setNombre("Manual p3");
        p3.setEdad(22);
        p3.setSexo(Sexo.MUJER);
        p3.setPeso(45);
        p3.setAltura(1.65f);
        
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
