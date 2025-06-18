package usuarios;

public class Vendedor extends Usuario {
    private int cuit;
    private String direccion;

    public Vendedor(String nombre, String email, String contrasena, int cuit, String direccion) {
        super(nombre, email, contrasena);
        this.cuit = cuit;
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public String getDireccion() {
        return direccion;
    }
}
