package usuarios;

public class Cliente extends Usuario {

    private int dni;
    private int telefono;

    public Cliente(String nombre, String email, String contrasena, int dni, int telefono) {
        super(nombre, email, contrasena);
        this.dni = dni;
        this.telefono = telefono;

        if (!validarDatos()) {
            throw new IllegalArgumentException("Datos inválidos para el cliente.");
        }
    }

    public void realizarPedido() {
        // Lógica para generar un nuevo pedido (probablemente se delegue a GestorPedidos)
    }

    public String verEstadoPedido(PedidoCompra pedido) {
        return pedido.getEstado().toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return dni == cliente.dni;
    }

    public boolean validarDatos() {
        return dni > 0 && telefono > 0 && getEmail() != null && !getEmail().isEmpty();
    }

}