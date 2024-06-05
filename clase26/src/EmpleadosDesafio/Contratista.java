package EmpleadosDesafio;

public class Contratista extends Empleado {
    protected double salarioProyecto;
    protected double proyectos;

    public Contratista() {}

    public Contratista(double salarioProyecto, double proyectos) {
        this.salarioProyecto = salarioProyecto;
        this.proyectos = proyectos;
    }

    public Contratista(String nombre, String id, double salario, double salarioProyecto, double proyectos) {
        super(nombre, id, salario);
        this.salarioProyecto = salarioProyecto;
        this.proyectos = proyectos;
    }

    public double getSalarioProyecto() {
        return salarioProyecto;
    }

    public void setSalarioProyecto(double salarioProyecto) {
        this.salarioProyecto = salarioProyecto;
    }

    public double getProyectos() {
        return proyectos;
    }

    public void setProyectos(double proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public double calcularSalario() {
        return salarioProyecto * proyectos;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Salario por Proyecto: " + salarioProyecto + ", Proyectos: " + proyectos + ", Salario Total: " + calcularSalario());
    }
}
