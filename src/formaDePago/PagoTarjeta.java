package formaDePago;
import java.time.YearMonth;

public class PagoTarjeta extends FormaDePago {
    private String numeroTarjeta; // Es un String por los 0 iniciales que puede no almacenar en formato int
    private YearMonth fechaVencimiento; // Tipo de dato mes/año especifico para este tipo de aplicaciones

    PagoTarjeta(double monto, String numeroTarjeta, YearMonth fechaVencimiento){
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencida() {
        return YearMonth.now().isAfter(fechaVencimiento);
    }

    @Override
    public void procesarPago() {
        if (!estaVencida()){
            System.out.println("Procesando pago con tarjeta " + numeroTarjeta +
                    " de $" + monto);
        }
    }
}