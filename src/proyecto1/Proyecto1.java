package proyecto1;

public class Proyecto1 {
    
    //primordial
    
    public static Clientes TotClientes [] = new Clientes[5]; // lista de clientes global en funcion del metodo clientes
     public static int iDAutoincrementable = 1000;
    

    public static void main(String[] args) {
        Inicio I = new Inicio();  //declaramos el objeto en el main
        I.setVisible(true); // metodo que hace visible la ventana
    }
    
}
