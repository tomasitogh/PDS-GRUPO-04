package usuarios;

public class Comprador extends Usuario {
    public Comprador(String nombre, String email, String contrasena) {
        super(nombre, email, contrasena);
    }

    public int calcularCosto(PedidoCompra pedido) {
        // Lógica real del cálculo delegada a otra clase (p. ej. CalcularCostoFinal)
        return pedido.calcularCosto();
    }
}
