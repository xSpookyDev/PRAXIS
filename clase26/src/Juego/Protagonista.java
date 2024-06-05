package Juego;

import Interfaces.Jugador;
import Interfaces.Personaje;

public class Protagonista implements Personaje, Jugador {

    private int yActual =1;

    @Override
    public void mover(int x) {
        xActual = xActual + x;
    }
    private int xActual;

    @Override
    public void saltar() {
        while (yActual <5){
            yActual++;
        }
        while (yActual>1){
            yActual--;
        }
    }

    @Override
    public void ejecutarAccion(String accion) {
    if (accion.equals("saltar") && yActual ==1){
        System.out.println("voy a saltar ! " + yActual);
        saltar();
    } else if (accion.equals("Avanzar")) {
        mover(1);
    }
    }
}
