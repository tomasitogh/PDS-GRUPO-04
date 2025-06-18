package formaDePago;

public class PagoContado extends FormaDePago {
    public PagoContado(double monto){
        super(monto);
    }
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo de $ " + monto);
    }
}