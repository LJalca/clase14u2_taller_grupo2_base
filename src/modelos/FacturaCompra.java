package modelos;

import interfaces.Exportable;
import interfaces.Persistible;

public class FacturaCompra implements Exportable, Persistible {
    private String numero;
    private String cliente;
    private double total;

    public FacturaCompra(String numero, String cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String exportar() {
        // TODO [Issue #2 - Integrante 2]: Retornar la factura en formato JSON o texto estructurado.
        return "PENDIENTE_FACTURA";
    }

    @Override
    public boolean guardar() {
        // TODO [Issue #2 - Integrante 2]: Imprimir aviso de respaldo de la factura y retornar true.
        return false;
    }
}
