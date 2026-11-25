package modelos;

import interfaces.MetodoPago;

public class PagoTransferencia implements MetodoPago {
    private String banco;
    private String cuenta;

    public PagoTransferencia(String banco, String cuenta) {
        this.banco = banco;
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) {
        // TODO [Issue #2 - Integrante 2]: Validar monto > 0, imprimir aviso de transferencia y retornar true.
        return false;
    }

    @Override
    public String obtenerNombreMetodo() {
        // TODO [Issue #2 - Integrante 2]: Retornar un texto con banco y cuenta.
        return "PENDIENTE_TRANSFERENCIA";
    }
}
