import java.util.Scanner;

public class Patrones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int exit;
        System.out.println("Bienvenido al programa de patrones!\n Por favor ingrese el patrón que desea ejecutar\n" +
                "1. Patrón 1\n2. Patrón 2\n" +
                "3. Patrón 3\n0. Salir");


        String patron = "";

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

                    for (int i = 0; i < cantidadCaracteres; i++) {
                        if (i % 2 == 0) {
                            System.out.print("*");
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println("\nHasta luego!");
                    break;
                case 2:
                    System.out.println("Bienvenido al patrón 2");
                    System.out.println("Ingrese el número de caracteres que desee visualizar:");
                    int cantidadCaracteres2 = sc.nextInt();

                    patron = "1234";
                    for (int i = 0; i < cantidadCaracteres2; i++) {
                        System.out.print(patron);
                    }

                    System.out.println("\nHasta luego!");
                    break;

                case 3:
                    System.out.println("Bienvenido al patrón 3");
                    System.out.println("Ingrese el número de veces que desea repetir el patrón:");
                    int cantidadRepeticiones = sc.nextInt();

                    patron = "||*";
                    for (int i = 0; i < cantidadRepeticiones; i++) {
                        System.out.print(patron);
                    }
                    System.out.println("\nHasta luego!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (exit < 0 || exit > 3);
    }
}
