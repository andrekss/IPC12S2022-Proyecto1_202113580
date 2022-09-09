package proyecto1;

import javax.swing.JOptionPane;

public class Clientes {
    private int CUI;
     private String Nombre;
      private String Apellido;
       private Cuentas TotCuentas [] = new Cuentas[5]; // cuentas asociadas a cada cliente
    
       
      
      public Clientes( int CUI,String Nombre, String Apellido) { // método a utilizar
          this.CUI = CUI;
          this.Nombre = Nombre;
          this.Apellido= Apellido;
      }
      
      
      public void Imprimir () {
          System.out.println("CUI: "+this.CUI+"Nombre: "+this.Nombre+"Apellido: "+this.Apellido);
      }
      
      
      // getters y setters
      
       public int getCUI() {
        return CUI;
    }

    public void setCUI(int CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Cuentas[] getTotCuentas() {
        return TotCuentas;
    }

    public void setTotCuentas(Cuentas[] TotCuentas) {
        this.TotCuentas = TotCuentas;
    }
    
    
    
    public void agregar (Cuentas cuenta) {  
        
        if (TotCuentas[4] == null) {  // si esta llena llego al limite
        for (int i = 0; i < TotCuentas.length; i++) {
           if (TotCuentas[i] == null){
              TotCuentas[i] = cuenta;
               JOptionPane.showMessageDialog(null,"Cuenta "+(i+1)+" creada exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
              break;
           }
            
        }
      } else  {
       JOptionPane.showMessageDialog(null,"No es posible crear mas de 5 cuentas","Advertencia",JOptionPane.WARNING_MESSAGE);
      }
        
    }
    

    
}
