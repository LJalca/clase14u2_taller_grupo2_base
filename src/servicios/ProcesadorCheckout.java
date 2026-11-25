package servicios;

import interfaces.Exportable;
import interfaces.MetodoPago;
import interfaces.Persistible;

public class ProcesadorCheckout {

    public void ejecutarCompra(MetodoPago metodo, double monto, Exportable comprobante, Persistible registro) {
        // TODO [Issue #3 - Integrante 3]: Invocar metodo.procesarPago(monto).
        // Si es exitoso, imprimir comprobante.exportar() y llamar a registro.guardar().
    }
}
