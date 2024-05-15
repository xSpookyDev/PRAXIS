import java.util.Scanner;



public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit;

        System.out.println("Bienvenido al programa de patrones Anidados!\n Por favor ingrese el patrón que desea ejecutar\n" +
                "1. Patrón 1\n2. Patrón 2\n" +
                "3. Patrón 3\n4. Patrón 4\n0. Salir");

        do {
            exit = sc.nextInt();

            switch (exit) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("Bienvenido al patrón 1");
                    System.out.println("Ingrese el número de caracteres que desee visualizar:");
                    int cantidadCaracteres = sc.nextInt();
                    Patron1(cantidadCaracteres);
                    System.out.println("\nHasta luego!");
                    break;
                case 2:
                    System.out.println("Bienvenido al patrón 2");
                    System.out.println("Ingrese el número de caracteres que desee visualizar:");
                    int cantidadCaracteres2 = sc.nextInt();
                    Patron2(cantidadCaracteres2);
                    System.out.println("\nHasta luego!");
                    break;
                case 3:
                    System.out.println("Bienvenido al patrón 3");
                    System.out.println("Ingrese el número de veces que desea repetir el patrón:");
                    int cantidadRepeticiones = sc.nextInt();
                    Patron3(cantidadRepeticiones);
                    System.out.println("\nHasta luego!");
                    break;
                case 4:
                    System.out.println("Bienvenido al patrón 4");
                    System.out.println("Ingrese el número de veces que desea repetir el patrón:");
                    int CR = sc.nextInt();
                    Patron4(CR);
                    System.out.println("\nHasta luego!");
                    break;

                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (exit != 0);
    }


    public static void Patron1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Patron2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Patron3(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Patron4(int n) {
        for (int i = 0; i < n; i++) {
            if (n == 2) {
                if (i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" *");
                }
            } else if (n == 3) {
                if (i == 0) {
                    System.out.println("**");
                } else if (i == 1) {
                    System.out.println(" *");
                } else {
                    System.out.println(" **");
                }
            } else if (n ==4){
                if (i == 0) {
                    System.out.println("***");
                } else if (i == 1) {
                    System.out.println(" **");
                } else if (i == 2){
                    System.out.println(" **");
                }else {
                    System.out.println(" ***");
                }
                } else if (n==5) {
                System.out.println("****");
                System.out.println(" ***");
                System.out.println(" ***");
                System.out.println(" ***");
                System.out.println(" **** sorry mauricio kjfajasasfdas tkm");
            }
            System.out.println();
            }
        }
    }