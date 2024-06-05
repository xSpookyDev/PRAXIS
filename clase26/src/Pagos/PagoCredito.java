package Pagos;

import Interfaces.Pago;

public class PagoCredito implements Pago {

    private double numeroTarjeta;
    private String nombreTitular;
    private String fechaCaducidad;

    public PagoCredito() {
    }

    public PagoCredito(double numeroTarjeta, String fechaCaducidad, String nombreTitular) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.nombreTitular = nombreTitular;
    }

    public double getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(double numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.printf("Se realiza pago por Tarjeta de credito por $%f\n", cantidad);
    }
}
