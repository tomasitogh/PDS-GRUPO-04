public class PedidoController {
    private PedidoValidador validador;
    private CalcularCostoFinal costoFinal;
    private GestorHistorialEstado gestorHistorial;
    private Informe informe;
    private CatalogoVehiculo catalogoVehiculo;
    public PedidoCompra crearPedido(Cliente cliente, Vehiculo vehiculo, FormaDePago formaDePago, Vendedor vendedor, List<EstadoPedido> estados){
        
    }
    public void avanzarEstado(PedidoCompra pedido, EstadoPedido nuevoEstado){
        
    }
    public void generarInforme(PedidoCompra pedido){
        
    }
    public List<Vehiculo> buscarVehiculoDisponible(){
        return null; //TODO: Implementar busqueda de vehiculos disponibles
    }
}