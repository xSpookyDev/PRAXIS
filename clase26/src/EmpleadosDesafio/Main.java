package EmpleadosDesafio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados2 = new ArrayList<>();


        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Laura Martinez", "B456", 0, 3000);
        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial("Luis Fernandez", "C789", 0, 15, 120);
        Contratista contratista = new Contratista("Carlos Ruiz", "A123", 0, 2000, 3);

        ProcesarEmpleados procesarEmpleados = new ProcesarEmpleados();
            /*
        System.out.println("Procesando Empleado Tiempo Completo:");
        procesarEmpleados.procesar(empleadoTiempoCompleto);

        System.out.println("\nProcesando Empleado Tiempo Parcial:");
        procesarEmpleados.procesar(empleadoTiempoParcial);

        System.out.println("\nProcesando Contratista:");
        procesarEmpleados.procesar(contratista);*/

        empleados2.add(contratista);
        empleados2.add(empleadoTiempoCompleto);
        empleados2.add(empleadoTiempoParcial);
        ProcesarEmpleados procesarEmpleadosa = new ProcesarEmpleados();

        for (Empleado empleado : empleados2) {
            System.out.println("\nProcesando " + empleado.getClass().getSimpleName() + ":");
            procesarEmpleados.procesar(empleado);
        }

        procesarEmpleadosa.procesar(contratista);
    }
}
