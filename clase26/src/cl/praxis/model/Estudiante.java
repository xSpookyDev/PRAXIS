package cl.praxis.model;

public class Estudiante extends Persona{

    private double deuda;

    public Estudiante(double deuda) {
        this.deuda = deuda;
    }

    public Estudiante(String nombre, String rut, boolean presente, double deuda) {
        super(nombre, rut, presente);
        this.deuda = deuda;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public Estudiante() {
    }




}
