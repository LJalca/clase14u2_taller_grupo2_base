package app;

import modelos.FacturaCompra;
import modelos.PagoTarjeta;
import modelos.PagoTransferencia;
import servicios.ProcesadorCheckout;

public class Main {
    public static void main(String[] args) {
        ProcesadorCheckout checkout = new ProcesadorCheckout();
        PagoTarjeta tarjeta = new PagoTarjeta("Cliente 1", "4821");
        PagoTransferencia transferencia = new PagoTransferencia("Banco Pacifico", "2201948");
        FacturaCompra f1 = new FacturaCompra("FAC-001", "Cliente 1", 120.50);
        FacturaCompra f2 = new FacturaCompra("FAC-002", "Cliente 2", 85.00);

        // TODO [Issue #3 - Integrante 3]: Ejecutar dos compras cambiando el MetodoPago sin modificar ProcesadorCheckout.
        checkout.ejecutarCompra(tarjeta, 120.50, f1, f1);
        checkout.ejecutarCompra(transferencia, 85.00, f2, f2);
    }
}
