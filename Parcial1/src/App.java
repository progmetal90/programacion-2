import Clases.Catalogo;
import Enums.Categoria;
import Enums.Marca;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        char opcion;
        
        Catalogo catalogo = new Catalogo();
        
        catalogo.altaComputadora("Macbook Plus Ultra", Categoria.COMPUTADORA, 1000000d, Marca.APPLE, 14f, 8, 16);
        catalogo.altaCelular("Galaxy S55", Categoria.CELULAR, 500000d, Marca.SAMSUNG, true);
        catalogo.altaCargador("Cargador de notebook", Categoria.ACCESORIO, 10000d, Marca.DELL, 3.7f, 19.5f);
        catalogo.altaAuricular("AirPods", Categoria.ACCESORIO, 95000d, Marca.APPLE, 32);
        
        while(!salir) {
            mostrarOpciones();
            
            // LA ENTRADA DEL USUARIO NO ESTA SANITIZADA!
            // No le puse tanto cariño al switch como al resto del examen :)
            String entrada = scanner.nextLine();
            opcion = !entrada.isEmpty() ? entrada.charAt(0) : 0;

            switch(opcion) {
                case '0':
                    salir = true;
                    break;
                case '1':
                    mostrarLista(catalogo.getProductos());
                    break;
                case '2':
                    System.out.println("Ingrese precio minimo: ");
                    double min = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Ingrese precio maximo: ");
                    double max = scanner.nextInt();
                    scanner.nextLine();
                    
                    mostrarLista(catalogo.filtrarProductosPorPrecio(min, max));
                    
                    break;
                case '3':
                    System.out.println("Ingrese marca de celular a filtrar:");
                    String marcaInput = scanner.nextLine().toUpperCase();
                    Marca marcaMatch = null;
                    
                    // Comparar input de usuario con version en string del enum
                    for (Marca marca : Marca.values()) {
                        if (marca.toString().equals(marcaInput)) {
                            marcaMatch = marca;
                        }
                    }
                    
                    if(marcaMatch != null) mostrarLista(catalogo.filtrarCelularesPorMarca(marcaMatch)); 
                    else System.out.println("Marca " + marcaInput + " invalida!");
                    
                    break;
                case '4':
                    System.out.println("Ingrese categoria a filtrar:");
                    String categoriaInput = scanner.nextLine().toUpperCase();
                    Categoria categoriaMatch = null;
                    
                    // Tambien se puede filtrar con instanceof de cada tipo,
                    // pero como habia hecho ya el enum lo hice asi
                    for (Categoria categoria : Categoria.values()) {
                        if (categoria.toString().equals(categoriaInput)) {
                            categoriaMatch = categoria;
                        }
                    }

                    if(categoriaMatch != null) mostrarLista(catalogo.filtrarProductosPorCategoria(categoriaMatch));
                    else System.out.println("Marca " + categoriaInput + " invalida!");

                    break;
                case '5':
                    System.out.println("No hubo tiempo de hacer la carga manual :)");
                    break;
                default:
                    System.out.println("Opcion invalida!");
            }

            if (!salir) {
                System.out.println("\nPresione enter para continuar...");
                scanner.nextLine();
            }
        }
    }

    public static void mostrarOpciones() {
        System.out.println("Parcial - Tienda virtual de tecnologia");

        System.out.println("1. Mostrar catalogo completo");
        System.out.println("2. Filtrar por precio");
        System.out.println("3. Filtrar celulares por marca");
        System.out.println("4. Filtrar productos por categoria");
        System.out.println("5. Agregar producto (TODO)");

        System.out.println("Ingrese una opcion (0 para salir): ");
    }
    
    // Metodo generico para imprimir listas en consola
    public static <T> void mostrarLista(List<T> objetos) {
        for (T obj : objetos) {
            System.out.println(obj);
        }
    }
}
