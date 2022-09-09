
package proyecto1;

public class Transacción {
    private int ID;
    private String fecha;
    private String detalle;
    private double debito;
    private double credito;
    private double saldoI;
    
    public Transacción(int ID,String fecha,String detalle, double debito, double credito, double saldoI ) {
    this.ID = ID;
        this.fecha = fecha;
        this.detalle = detalle;
        this.debito = debito;
        this.credito = credito;
        this.saldoI = saldoI;
        
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getSaldoI() {
        return saldoI;
    }

    public void setSaldoI(double saldoI) {
        this.saldoI = saldoI;
    }
    
    
    
    
}
