public class Informe implements GeneradorInforme{
    private int fechaDesde;
    private int fechaHasta;
    private EstadoPedido filtroEstado;
    private List<PedidoCompra> listaPedido = new ArrayList<>();
    
    public void exportarAFormato(){
        
    }
    public void generarTotalesConSinImporte(){
        
    }
    @Override
    public void generarInforme(PedidoCompra pedido) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarInforme'");
    }
    @Override
    public void generarFormaDePago(PedidoCompra pedido) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generarFormaDePago'");
    }
}