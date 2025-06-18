import usuarios.Cliente;

public class GestorVehiculosYPedidos {
    private List<PedidoCompra> pedidos = new ArrayList<>();
    private CatalogoVehiculos catalogoVehiculos;
    private PedidoController pedidoController;

    public List<Vehiculo> verVehiculosDisponibles() {
        return null; //TODO: Implementar ver vehiculos disponibles
    }

    public PedidoCompra generarPedido(Cliente c) {
        return null; //TODO: Implementar generar pedido
    }

    public void avanzarEstadoPedido(PedidoCompra pedido, EstadoPedido nuevoEstado) {
        // Lógica para avanzar estado (ficticia por ahora)
    }

    public List<PedidoCompra> obtenerPedidosCliente(Cliente cliente) {
        return null; //TODO: Implementar obtener pedidos cliente
    }
}