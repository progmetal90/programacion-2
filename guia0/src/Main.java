import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ejercicio1();
//        ejercicio2();
//        ejercicio3(scanner);
//        ejercicio4();
//        ejercicio5(scanner);
//        ejercicio6(scanner);
//        ejercicio7(scanner);
//        ejercicio8(scanner);
//        ejercicio9(scanner);
//        ejercicio10(scanner);
//        ejercicio11(scanner);
//        ejercicio12(scanner);
//        ejercicio13(scanner);
//        ejercicio14(scanner);
//        ejercicio19(scanner);
//        ejercicio21(scanner);

        scanner.close();
    }

    private static void ejercicio21(Scanner scanner) {
        int cantTemperaturas = 20;
        double[] temperaturas = new double[cantTemperaturas];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double suma = 0d;

        for (int i = 0; i < cantTemperaturas; i++) {
            temperaturas[i] = Math.random() * 20d;
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            suma += temperaturas[i];

        }
        System.out.println("El minimo es " + min);
        System.out.println("El maximo es " + max);

        System.out.println("El promedio es " + suma / cantTemperaturas);

    }

    private static void ejercicio19(Scanner scanner) {
        int tamArreglo = 3;
        int suma = 0;
        int[] arreglo = new int[tamArreglo];

        for (int i = 0; i < tamArreglo; i++) {
            System.out.println("Ingrese el dato " + i);
            arreglo[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < tamArreglo; i++) {
            suma += arreglo[i];
        }

        System.out.println("El promedio de los datos ingresados es de " + suma / tamArreglo);
    }

    private static void ejercicio14(Scanner scanner) {
        System.out.println("Ingrese un numero de 3 cifras: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        if (numero >= 1000 || numero <= -1000) {
            System.out.println("El numero tiene mas de 3 cifras.");
        }
        else{
            String numeroString = Integer.toString(numero);
            for (int i = 0; i < numeroString.length(); i++) {
                System.out.println(numeroString.charAt(i));
            }
        }
    }

    private static void ejercicio13(Scanner scanner) {
        System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        scanner.nextLine();

        double volumen = 4d / 3d * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera es de " + volumen);
    }

    private static void ejercicio12(Scanner scanner) {
        System.out.println("Ingrese el largo del primer cateto: ");
        double cat1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el largo del segundo cateto: ");
        double cat2 = scanner.nextDouble();
        scanner.nextLine();

        double hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("El largo de la hipotenusa es de " + hipotenusa);
    }

    private static void ejercicio11(Scanner scanner) {
        System.out.println("Ingrese una velocidad en km/h: ");
        int v = scanner.nextInt();
        scanner.nextLine();

        System.out.println("La velocidad en m/s es de " + (v * 1000 / 3600) + "m/s");
    }

    private static void ejercicio10(Scanner scanner) {
        System.out.println("Ingrese el valor del radio de una circunferencia: ");
        int radio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("La longitud es de " + (2 * Math.PI * radio));
        System.out.println("La superficie es de " + (Math.PI * Math.pow(radio, 2)));
    }

    private static void ejercicio9(Scanner scanner) {
        System.out.print("Ingrese un nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Buenos dias, " + nombre);
    }

    private static void ejercicio8(Scanner scanner) {
        System.out.print("Ingrese un numero: ");

        int c = scanner.nextInt();
        scanner.nextLine();

        if (c < 0) {
            System.out.println("C es negativo");
        }
        else {
            System.out.println("C es positivo");
        }

        if (c % 2 == 0) {
            System.out.println("C es par");
        }
        else {
            System.out.println("C es impar");
        }

        if (c % 5 == 0) {
            System.out.println("C es multiplo de 5");
        }

        if (c % 10 == 0) {
            System.out.println("C es multiplo de 10");
        }

        if (c < 100) {
            System.out.println("C es menor a 100");
        }
        else if (c > 100) {
            System.out.println("C es mayor a 100");
        }
    }
    
    private static void ejercicio7(Scanner scanner) {
        System.out.print("Ingrese texto: ");
        char caracter = scanner.next().charAt(0);

        System.out.println("El valor ascii del caracter " + caracter + " es " + (int)caracter);
    }

    private static void ejercicio6(Scanner scanner) {
        System.out.print("Ingrese un numero: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (b < 0) {
            System.out.println("El numero ingresado es negativo.");
        }
        else {
            System.out.println("El numero ingresado es positivo.");
        }
    }

    private static void ejercicio5(Scanner scanner) {
        System.out.print("Ingrese un numero a evaluar: ");

        int a = scanner.nextInt();
        scanner.nextLine();

        boolean esPar = a % 2 == 0;

        if(esPar) {
            System.out.println("A es par.");
        }
        else{
            System.out.println("A es impar.");
        }
    }

    private static void ejercicio4() {
        int a,b,c,d;
        a = 1;
        b = 2;
        c = 3;
        d = 4;

        b = c;
        c = a;
        a = d;
        d = b;
    }

    private static void ejercicio3(Scanner scanner) {
        int n;

        n = scanner.nextInt();
        scanner.nextLine();

        n += 77;
        n -= 3;
        n *= 2;

        System.out.println(n);
    }

    private static void ejercicio2() {
        int numX = 10;
        int numY = 7;

        double numN = 4.5d;
        double numM = 3.7d;

        System.out.println(numX * numY);
        System.out.println(numM / numN);
    }

    private static void ejercicio1(){
        int numN = 3;
        double numA = 2.5d;
        char numC = 'c';

        System.out.println(numN);
        System.out.println(numA);
        System.out.println(numC);

        System.out.println(numN + numA);
        System.out.println(numA - numN);
        System.out.println((int)numC);
    }
}
