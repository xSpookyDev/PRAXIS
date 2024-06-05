package Pagos;

import Interfaces.Pago;

public class PagoTransferencia implements Pago {

    private double Cuenta;
    private String banco;

    public double getCuenta() {
        return Cuenta;
    }

    public void setCuenta(double cuenta) {
        Cuenta = cuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public PagoTransferencia(String banco, double cuenta) {
        this.banco = banco;
        Cuenta = cuenta;
    }

    public PagoTransferencia() {
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.printf("Se realiza pago por transferencia bancaria por $%f\n", cantidad);
    }
}
