public class Cliente {
    private String nombre;
    private String apellido;
    private int documento;
    private String email;
    private int telefono;

    public void realizarPedido(){

    }
    public String verEstadoPedido(PedidoCompra pedido){
        return "1"; //TODO: Implementar ver estado de pedido
    }
    public boolean equals(Object obj){
        return true; //TODO: Implementar comparacion de datos

    }
    public boolean validarDatos(){
        return true; //TODO: Implementar validacion de datos
    }
}