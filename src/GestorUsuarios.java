import usuarios.Cliente;
import usuarios.Usuario;

public class GestorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }


    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
}