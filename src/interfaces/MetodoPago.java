package interfaces;

public interface MetodoPago {
    boolean procesarPago(double monto);
    String getNombreMetodo();
}
