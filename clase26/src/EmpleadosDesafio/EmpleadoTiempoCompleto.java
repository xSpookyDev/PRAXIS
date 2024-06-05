package EmpleadosDesafio;

public class EmpleadoTiempoCompleto extends Empleado {
    protected double salarioFijoMensual;

    public EmpleadoTiempoCompleto() {}

    public EmpleadoTiempoCompleto(double salarioFijoMensual) {
        this.salarioFijoMensual = salarioFijoMensual;
    }

    public EmpleadoTiempoCompleto(String nombre, String id, double salario, double salarioFijoMensual) {
        super(nombre, id, salario);
        this.salarioFijoMensual = salarioFijoMensual;
    }

    public double getSalarioFijoMensual() {
        return salarioFijoMensual;
    }

    public void setSalarioFijoMensual(double salarioFijoMensual) {
        this.salarioFijoMensual = salarioFijoMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioFijoMensual;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario Fijo Mensual: " + salarioFijoMensual + ", Salario Total: " + calcularSalario());
    }
}
