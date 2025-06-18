package formaDePago;

public abstract class FormaDePago {
    protected double monto;

    public FormaDePago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();
}