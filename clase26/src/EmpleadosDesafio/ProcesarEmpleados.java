package EmpleadosDesafio;

public class ProcesarEmpleados {

    public void procesar(Empleado empleado) {
        empleado.mostrarDetalles();
        double salario = empleado.calcularSalario();
        System.out.println("Salario Calculado: " + salario);
    }
}
