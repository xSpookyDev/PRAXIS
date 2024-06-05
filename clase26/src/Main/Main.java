package Main;

import cl.praxis.model.Estudiante;
import cl.praxis.model.Persona;
import cl.praxis.model.Profesor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //   List<Profesor> profesores = new ArrayList<Profesor>();
      // List<Estudiante> estudiantes = new ArrayList<Estudiante>();
       List<Persona> personas = new ArrayList<Persona>();

       personas.add(new Profesor("Maria", "1-1", true,32));
        personas.add(new Estudiante("Rojelio", "3-1", true, 32));
        personas.add(new Estudiante("Chris", "3312-1", true,3210));
        personas.add(new Estudiante("Jedi", "32-1", true, 2000));
   personas.add(new Profesor("Ricarod", "1232", true, 321));
       /* for (Estudiante estudiante :estudiantes){
            System.out.println(estudiante.toString());
        }

        for (Profesor profesor : profesores){
            System.out.println(profesor.toString());
        }*/

        for (Persona persona: personas){

         if (persona instanceof Estudiante)

             System.out.printf("La deuda es de : $%.2f \t",((Estudiante)persona).getDeuda());

            System.out.println(personas.toString());
        }

    }
}