package pe.egcc.app.service;

public class PedidoService {
    
    public double Impuesto(double monto){
        return (monto*.18);
    }
    public double Total(double monto){
        return (monto*(1+.18));
    }
}
