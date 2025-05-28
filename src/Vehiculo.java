public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int numeroChasis;
    private int numeroMotor;
    private int precioBase;
    private boolean equipamientoAdi;
    private boolean accesorios;

    public int calcularImpuestos(PedidoCompra pedido){
        return pedido.getImpuestosAplicados();
    }
    public void mostrarInfo(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
        System.out.println(numeroChasis);
        System.out.println(numeroMotor);
        System.out.println(precioBase);
        System.out.println(equipamientoAdi);
        System.out.println(accesorios);
    }

}