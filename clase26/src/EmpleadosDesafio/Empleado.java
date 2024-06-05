package EmpleadosDesafio;

public abstract class  Empleado {
    protected String nombre;
    protected String id;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", ID: " + id
                + ", Salario Base: " + salario);
    }

}
