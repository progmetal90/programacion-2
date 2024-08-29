package Ejercicio3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID id;
    private LocalDateTime fecha;
    private double monto;
    private double montoConDescuento;
    private final Cliente cliente;

    public Factura(double monto, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.monto = monto;
        this.montoConDescuento = monto * (1d - cliente.getDescuento() / 100d);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", montoConDescuento=" + montoConDescuento +
                ", cliente=" + cliente +
                '}';
    }
}
