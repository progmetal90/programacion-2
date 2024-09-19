package ejercicio1;

import java.util.Scanner;

public class AppLibros {
    private Scanner scanner;
    private Inventario inventario;
    
    public AppLibros(Scanner scanner) {
        this.scanner = scanner;
        inventario = new Inventario();
    }

    public void ejecutar() {
        boolean salir = false;
        char opcion = 0;
        
        while(!salir) {
            System.out.println("EJERCICIO 1 - APP LIBROS");

            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar libros");
            System.out.println("4. Buscar por titulo");
            System.out.println("5. Actualizar precio");
            System.out.println("6. Calcular precio total");
            System.out.println("7. Calcular total de libros en el inventario");
            System.out.println("8. Encontrar el libro mas barato");
            System.out.println("9. Encontrar el libro mas caro");

            System.out.println("Ingrese una opcion (o ESC para salir): ");
            
            String entrada = scanner.nextLine(); 
            opcion = !entrada.isEmpty() ? entrada.charAt(0) : 0;
            
            if (opcion == 27) {
                salir = true;
            }
            else {
                buscarComando(opcion);
            }

            System.out.println("\nPresione enter para continuar...");
            scanner.nextLine();
        }
    }
    
    public void buscarComando(char opcion) {
        Libro l;
        
        switch (opcion) {
            case '1':
                System.out.println("Agregar libro");
                
                System.out.println("Ingrese el titulo: ");
                String titulo = scanner.nextLine();

                System.out.println("Ingrese el autor: ");
                String autor = scanner.nextLine();

                System.out.println("Ingrese el precio: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Ingrese el anio de publicacion");
                int anioPublicacion = scanner.nextInt();
                scanner.nextLine();
                
                inventario.agregarLibro(new Libro(titulo, autor, precio, anioPublicacion));
                break;
            case '2':
                System.out.println("Ingrese el titulo del libro a eliminar: ");
                l = inventario.buscarPorTitulo(scanner.nextLine());

                if (l == null) {
                    System.out.println("No se encontró el libro!");
                }
                else {
                    inventario.eliminarLibro(l);
                    System.out.println("Libro eliminado con exito!");
                }
                
                break;
            case '3':
                inventario.mostrarLibros();
                break;
            case '4':
                System.out.println("Ingrese el titulo del libro a buscar: ");
                
                l = inventario.buscarPorTitulo(scanner.nextLine());

                if (l == null) {
                    System.out.println("No se encontro el libro!");
                }
                else {
                    System.out.println(l);
                }
                
                break;
            case '5':
                System.out.println("Ingrese el titulo del libro para modificar el precio: ");

                l = inventario.buscarPorTitulo(scanner.nextLine());

                if (l == null) {
                    System.out.println("No se encontro el libro!");
                }
                else {
                    System.out.println("Ingrese el nuevo precio: ");
                    l.setPrecio(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.println("Precio modificado con exito!");
                }
                
                break;
            case '6':
                System.out.println("El precio total de todos los libros es de $" + inventario.calcularPrecioTotal());
                break;
            case '7':
                System.out.println("Hay " + inventario.getTotalLibros() + " libros en el inventario");
                break;
            case '8':
                System.out.println("El libro mas barato es " + inventario.getLibroMasBarato().getTitulo());
                break;
            case '9':
                System.out.println("El libro mas caro es " + inventario.getLibroMasCaro().getTitulo());
                break;
            default:
                System.out.println("Opcion invalida!");
        }
    }
}
