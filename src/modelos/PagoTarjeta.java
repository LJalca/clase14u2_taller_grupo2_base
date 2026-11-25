package modelos;

import interfaces.MetodoPago;

public class PagoTarjeta implements MetodoPago {
    private String titular;
    private String ultimosCuatro;

    public PagoTarjeta(String titular, String ultimosCuatro) {
        this.titular = titular;
        this.ultimosCuatro = ultimosCuatro;
    }

    @Override
    public boolean procesarPago(double monto) {
        // TODO [Issue #1 - Integrante 1]: Validar que monto > 0, imprimir un mensaje corto de cobro y retornar true.
        return false;
    }

    @Override
    public String obtenerNombreMetodo() {
        // TODO [Issue #1 - Integrante 1]: Retornar el nombre del metodo incluyendo ultimosCuatro.
        return "PENDIENTE_TARJETA";
    }
}
