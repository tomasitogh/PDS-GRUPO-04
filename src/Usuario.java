public abstract class Usuario {
    private String nombre;   
    private String email;
    private String contrasena;

    public int calcularCosto(PedidoCompra pedido){
        return pedido.getCostoTotal;
    }