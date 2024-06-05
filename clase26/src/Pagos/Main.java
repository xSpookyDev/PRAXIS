package Pagos;

import Interfaces.Pago;

public class Main {
    public static void main(String[] args) {

        Pago pagoTarjeta = new PagoCredito(21312, "junio","Juan torres");
        Pago pagoPaypal = new PagoPaypal("312321", "32131");
        Pago pagoTransferencia= new PagoTransferencia("Banco Estado", 21321);
        Pago pagoBitcoin = new PagoBitcoin("bitcoin","sadsa@dsadsa.cl");

        ProcesadorPagos procesador = new ProcesadorPagos();
        procesador.procesar(pagoTarjeta, 100.0);
        procesador.procesar(pagoPaypal, 2000);
        procesador.procesar(pagoTransferencia, 3000);
        procesador.procesar(pagoBitcoin, 12312);

    }


}
