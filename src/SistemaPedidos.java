import usuarios.Cliente;
import usuarios.Usuario;

public class SistemaPedidos {
    private GestorUsuarios gestorUsuarios = new GestorUsuarios();
    private GestorVehiculosYPedidos gestorVehiculosYPedidos = new GestorVehiculosYPedidos();
    private GestorInformes gestorInformes = new GestorInformes();

    public void registrarUsuario(Usuario usuario) {
        gestorUsuarios.registrarUsuario(usuario);
    }

    public void registrarCliente(Cliente cliente) {
        gestorUsuarios.registrarCliente(cliente);
    }

    public List<Vehiculo> verVehiculosDisponibles() {
        return gestorVehiculosYPedidos.verVehiculosDisponibles();
    }

    public PedidoCompra generarPedido(Cliente cliente) {
        return gestorVehiculosYPedidos.generatePedido(cliente);
    }

    public void emitirInforme(PedidoCompra pedido) {
        gestorInformes.emitirInforme(pedido);
    }

    public List<PedidoCompra> obtenerPedidosCliente(Cliente cliente) {
        return gestorVehiculosYPedidos.obtenerPedidosCliente(cliente);
    }
}