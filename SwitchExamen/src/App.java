import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean salir = false;
        char opcion = 0;

        while(!salir) {
            mostrarOpciones();

            String entrada = scanner.nextLine();
            opcion = !entrada.isEmpty() ? entrada.charAt(0) : 0;

            switch(opcion) {
                case '0':
                    salir = true;
                    break;
                case '1':
                    System.out.println("Test");
                    break;
                case '2':
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
        System.out.println("Parcial");

        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");

        System.out.println("Ingrese una opcion (0 para salir): ");
    }
}
