package cl.praxis.model;

public class Profesor extends Persona{

    protected int edad;



public void clasificarPrueba(){
    System.out.println("Nota 1");
}

    public Profesor(int edad) {
        this.edad = edad;
    }

    public Profesor(String nombre, String rut, boolean presente, int edad) {
        super(nombre, rut, presente);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
