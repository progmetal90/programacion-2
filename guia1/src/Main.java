import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
        ejercicio4();
    }

    private static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        ItemVenta item = new ItemVenta();
        boolean quiereSalir = false;

        int opcion;

        while(!quiereSalir) {
            do {
                System.out.println("** MENU DE OPCIONES **");
                System.out.println("1. Inicializar item");
                System.out.println("2. Imprimir item");
                System.out.println("3. Modificar stock");
                System.out.println("4. Modificar precio unitario");
                System.out.println("5. Imprimir precio total");
                System.out.println("6. Salir del programa");

                opcion = scanner.nextInt();
                scanner.nextLine();
            }while(opcion < 1 || opcion > 6);

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el ID: ");
                    item.setId(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Ingrese la descripcion: ");
                    item.setDescripcion(scanner.nextLine());

                    System.out.println("Ingrese el stock inicial: ");
                    item.setStock(scanner.nextInt());
                    scanner.nextLine();

                    System.out.println("Ingrese el precio unitario: ");
                    item.setPrecioUnitario(scanner.nextDouble());
                    scanner.nextLine();

                    break;
                case 2:
                    System.out.println(item);
                    break;
                case 3:
                    System.out.println("Ingrese el stock a agregar: ");
                    item.setStock(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese nuevo precio unitario: ");
                    item.setPrecioUnitario(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.printf("El precio total es de $%.2f\n", item.calcularPrecioTotal());
                    break;
                case 6:
                    quiereSalir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
        }

        scanner.close();
    }

    private static void ejercicio3() {
        Libro quijote = new Libro("El quijote", "Miguel de Cervantes", 500, 10);
        Libro cienAnios = new Libro("100 años de soledad", "Gabriel García Márquez", 700, 5);

        System.out.println(quijote);
        System.out.println(cienAnios);
        quijote.vender(3);
        System.out.println(quijote);
        cienAnios.vender(8);
        cienAnios.agregarStock(5);
        System.out.println(cienAnios);
    }

    private static void ejercicio2() {
        CuentaBancaria cuenta = new CuentaBancaria("Manuel Acevedo", 15000);

        cuenta.depositar(2500);
        cuenta.debitar(1500);
        cuenta.debitar(30000);

        cuenta.mostrar();
    }

    private static void ejercicio1() {
        Empleado carlos = new Empleado("Carlos", "Gutierrez", 23456345, 25000);
        Empleado ana = new Empleado("Ana", "Sanchez", 34234123, 27500);

        carlos.mostrar();
        ana.mostrar();

        carlos.aumentarSalario(15);
        carlos.calcularSalarioAnual();
    }
}
