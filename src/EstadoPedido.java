public class EstadoPedido {
    private String nombre;
    private List<ObservadorEstado> observaciones = new ArrayList<>();
    public void notificarAreas(){
        
    }
    public void avanzarEstado(){
        
    }
    public void agregarObservador(ObservadorEstado estado){
        observaciones.add(estado);
    }

    public String getNombre() {
        return nombre;
    }
}
