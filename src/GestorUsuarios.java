import usuarios.Usuario;

public class GestorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
}