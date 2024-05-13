import java.util.Scanner;

public class DesafioGuiado {
    public static void main(String[] args) {

        //  CambiarWhile();

        //  mostrarPares();

        // mostrarParesSinCero();

        // calcularSumaImpar();

        // SumaImparMaxNeg();

         Fibonacci();
    }

    public static void CambiarWhile() {
        int i = 0;
        do {
            i += 1;
            System.out.printf("Iteración %d\n", i);
        } while (i < 50);
    }

    public static void mostrarPares() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números pares a mostrar: ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n * 2; i += 2) {
            System.out.println(i);
        }
    }

    public static void mostrarParesSinCero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números pares a mostrar: ");
        int n = scanner.nextInt();
        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i);
        }
    }

    public static void calcularSumaImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            suma += i;
        }

        System.out.println( suma);
    }

    public static void SumaImparMaxNeg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero inferior: ");
        int min = scanner.nextInt();
        System.out.print("Ingrese el nymero superior: ");
        int max = scanner.nextInt();

        int suma = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        System.out.println(suma);
    }

    public static void Fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea en Fibonacci  mostrar: ");
        int n = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;
        System.out.println("Los primeros " + n + " números de la secuencia Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.println(num1);
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
