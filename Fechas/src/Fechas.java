import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la fecha de nacimiento de la persona 1 en formato DD/MM/AAAA:");
        String fecha1 =  sc.nextLine();

        System.out.println("Ingrese la fecha de nacimiento de la persona 2 en formato DD/MM/AAAA:");
        String fecha2 = sc.nextLine();

        int F1dia = Integer.parseInt(fecha1.substring(0, 2));
        int F1mes = Integer.parseInt(fecha1.substring(3, 5));
        int F1año = Integer.parseInt(fecha1.substring(6, 8));

        int F2dia = Integer.parseInt(fecha2.substring(0, 2));
        int F2mes = Integer.parseInt(fecha2.substring(3, 5));
        int F2año = Integer.parseInt(fecha2.substring(6, 8));

        if (F1año > F2año || (F1año == F2año && F1mes > F2mes) || (F1año == F2año && F1mes == F2mes && F1dia > F2dia)) {
            System.out.println("Persona 1 es mayor.");
        } else if (F2año > F1año || (F2año == F1año && F2mes > F1mes) || (F2año == F1año && F2mes == F1mes && F2dia > F1dia)) {
            System.out.println("Persona 2 es mayor.");
        } else {
            System.out.println("Tienen la misma edad.");
        }
    }
}

