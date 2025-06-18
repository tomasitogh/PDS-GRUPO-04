package formaDePago;

public class PagoTransferencia extends FormaDePago {
    private String cbu;

    public PagoTransferencia(double monto, String cbu){
        super(monto);
        this.cbu = cbu;
    }
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago por transferencia a CBU: " + cbu + " de $ " + monto);
    }
}