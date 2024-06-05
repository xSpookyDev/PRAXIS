package EmpleadosDesafio;

public class EmpleadoTiempoParcial extends Empleado {
    protected double salarioPorHora;
    protected double horasTrabajadas;

    public EmpleadoTiempoParcial() {}

    public EmpleadoTiempoParcial(double salarioPorHora, double horasTrabajadas) {
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoTiempoParcial(String nombre, String id, double salario, double salarioPorHora, double horasTrabajadas) {
        super(nombre, id, salario);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario por Hora: " + salarioPorHora + ", Horas Trabajadas: " + horasTrabajadas + ", Salario Total: " + calcularSalario());
    }
}
