package Pagos;

import Interfaces.Pago;

public class PagoBitcoin implements Pago {
    private String moneredo;
    private String email;

    public PagoBitcoin(String moneredo, String email) {
        this.moneredo = moneredo;
        this.email = email;
    }

    public PagoBitcoin() {
    }

    public String getMoneredo() {
        return moneredo;
    }

    public void setMoneredo(String moneredo) {
        this.moneredo = moneredo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.printf("Se realiza pago por bitcoin por $%f\n", cantidad);
    }
}
