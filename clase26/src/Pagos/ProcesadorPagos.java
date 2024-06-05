package Pagos;

import Interfaces.Pago;

public class ProcesadorPagos {

    public void procesar(Pago metodoPago, double cantidad){
        metodoPago.realizarPago(cantidad);
    }
}
