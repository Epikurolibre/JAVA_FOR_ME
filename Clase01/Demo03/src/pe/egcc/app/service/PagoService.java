package pe.egcc.app.service;

public class PagoService {
    
    public void PagoServicio(double horaxdia, int dias, double pagoxhora){
        double ingresos = horaxdia*dias*pagoxhora;
        double renta;
        
        if (ingresos > 1500) {
            renta = ingresos*.18;
        }else{
            renta = 0;
        }
        
        double neto = ingresos + renta;
    }
    
}
