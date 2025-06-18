import formaDePago.FormaDePago;

import java.util.ArrayList;
import java.util.List;
public class PedidoCompra implements IFacturable{
    private int numeroPedido;
    private int fechaCreacion;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private FormaDePago formaDePago;
    private int impuestosAplicados;
    private int costoTotal;
    private Vendedor vendedor;
    private EstadoPedido areaResponsableActual;
    private int garantiaExtendida;
    private List<HistorialEstado> historialEstados = new ArrayList<>();

    @Override
    public int calcularTotal() {
        return 0; //TODO: Implementar calculo de total
    }

    public void cambiarEstado(){

    }
    public void registrarHistorial(HistorialEstado estado){
        historialEstados.add(estado);
    }
    public void crearEstadoPedido(){

    }
}