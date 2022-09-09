package proyecto1;

public class Cuentas {
       private int id;
        private String Cliente;
      private double saldo;
      private Transacción aTransacciones [] = new Transacción[20];
      

  
      
      
    public Cuentas (int id, String Cliente, double saldo) {
        this.id = id;
        this.Cliente = Cliente;
        this.saldo = saldo;
    }
     
    
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      public Transacción[] getaTransacciones() {
        return aTransacciones;
    }

    public void setaTransacciones(Transacción[] aTransacciones) {
        this.aTransacciones = aTransacciones;
    }
  
    
    
     public void Imprimir2 () {
          System.out.println("id: "+this.id+" cliente: "+this.Cliente+" Saldo: "+this.saldo);
      }
   
}
