
package proyecto1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import static proyecto1.Proyecto1.iDAutoincrementable;

public class Transfernecia extends javax.swing.JFrame {

    public Transfernecia() {
        initComponents();
        this.setTitle("Transferencias");
        this.setLocationRelativeTo(null);
        for (int i = 0; i < Proyecto1.TotClientes.length; i++) {
                for (int j = 0; j < 5; j++) {  // llenamos el jcombobox con los clientes creados sin cui pero con id
                    if (Proyecto1.TotClientes[i] != null && Proyecto1.TotClientes[i].getTotCuentas()[j] != null  ) { // los dos arreglos deben tener algo
             jComboBox1.addItem(String.valueOf(Proyecto1.TotClientes[i].getTotCuentas()[j].getId()));
             
             // +"-"+Proyecto1.TotClientes[i].getNombre()+" "+Proyecto1.TotClientes[i].getApellido() agregar despues
                    }
                }
        }
        
        for (int i = 0; i < Proyecto1.TotClientes.length; i++) {
                for (int j = 0; j < 5; j++) {  // llenamos el jcombobox con los clientes creados sin cui pero con id
                    if (Proyecto1.TotClientes[i] != null && Proyecto1.TotClientes[i].getTotCuentas()[j] != null  ) { // los dos arreglos deben tener algo
             jComboBox2.addItem(String.valueOf(Proyecto1.TotClientes[i].getTotCuentas()[j].getId()));
             
             // +"-"+Proyecto1.TotClientes[i].getNombre()+" "+Proyecto1.TotClientes[i].getApellido() agregar despues
                    }
                }
        }
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cuenta de origen");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cuenta de destino");

        jButton1.setText("Transferencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Monto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 180, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton1)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Administrador A = new Administrador();
       A.setVisible(true);
       this.dispose(); // método que evita la acumulación de la ventana anterior
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double transferencia = Double.parseDouble(jTextField1.getText());         
          iDAutoincrementable++;
      if (transferencia > 0) { // cuenta de origen
          for (int i = 0; i < Proyecto1.TotClientes.length; i++) {
              if (Proyecto1.TotClientes[i] != null) {
                  for (int j = 0; j < Proyecto1.TotClientes[i].getTotCuentas().length; j++) {
                      if (Proyecto1.TotClientes[i].getTotCuentas()[j] != null && Proyecto1.TotClientes[i].getTotCuentas()[j].getId() == Integer.parseInt((String) jComboBox1.getSelectedItem()) ) {
                        // cuenta de origen
                          if (transferencia <= Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo()) {
                          double saldoInicial = Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo();
                          Proyecto1.TotClientes[i].getTotCuentas()[j].setSaldo(saldoInicial-transferencia);
                          
               
                               String fecha2 = ZonedDateTime.now(ZoneId.of("America/Guatemala")).format(DateTimeFormatter.ofPattern("MM-dd-yyy, hh:mm:ss a"));
                          
                          Transacción tr1 = new Transacción( iDAutoincrementable, fecha2, "Transferencia "+ jComboBox2.getSelectedItem(),transferencia,0.0,-transferencia+saldoInicial);
                          
                          for (int m = 0; m < 20; m++) {
                              if (Proyecto1.TotClientes[i].getTotCuentas()[j].getaTransacciones()[m] == null) {
                                   Proyecto1.TotClientes[i].getTotCuentas()[j].getaTransacciones()[m] =tr1;
                                   break;
                                 }
                          }
                          
                       //cuenta destino
     for (int k = 0; k < Proyecto1.TotClientes.length; k++) {
              if (Proyecto1.TotClientes[k] != null ) {
                  for (int l = 0; l < Proyecto1.TotClientes[k].getTotCuentas().length; l++) {
                      
                     if ( Proyecto1.TotClientes[k].getTotCuentas()[l] != null ) {
                         if (Proyecto1.TotClientes[k].getTotCuentas()[l].getId() == Integer.parseInt((String) jComboBox2.getSelectedItem())) {
                      if (  Proyecto1.TotClientes[k].getTotCuentas()[l].getId() != Proyecto1.TotClientes[i].getTotCuentas()[j].getId() ) {
                         
                          double saldoInicial2 = Proyecto1.TotClientes[k].getTotCuentas()[l].getSaldo();
                          Proyecto1.TotClientes[k].getTotCuentas()[l].setSaldo(transferencia+saldoInicial2);
                      System.out.println("Saldo Cuenta destino: "+Proyecto1.TotClientes[k].getTotCuentas()[l].getSaldo()); // verificar
                      JOptionPane.showMessageDialog(null,"Transferencia hecha exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                      
                       String fecha = ZonedDateTime.now(ZoneId.of("America/Guatemala")).format(DateTimeFormatter.ofPattern("MM-dd-yyy, hh:mm:ss a"));
                          
                          Transacción tr = new Transacción(iDAutoincrementable, fecha, "Transferencia "+ jComboBox2.getSelectedItem(),0.0,transferencia,transferencia+saldoInicial2);
                          
                          for (int m = 0; m < 20; m++) {
                              if (Proyecto1.TotClientes[k].getTotCuentas()[l].getaTransacciones()[m] == null) {
                                   Proyecto1.TotClientes[k].getTotCuentas()[l].getaTransacciones()[m] =tr;
                                   break;
                                 }
                              
                              
                              
                          }
                      
                      }else {
           JOptionPane.showMessageDialog(null,"La cuenta de origen no puede ser la de destino","Advertencia",JOptionPane.WARNING_MESSAGE);
Proyecto1.TotClientes[i].getTotCuentas()[j].setSaldo(saldoInicial);
                      }         
                      }
                      } 
                      
                  }
              } 
              
          }
     System.out.println("saldo cuenta de origen: "+Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo()); // verificar
                      
       
                          } else {
                          JOptionPane.showMessageDialog(null,"Fondos insuficientes","Advertencia",JOptionPane.WARNING_MESSAGE);
                          }
                       
                      }
                      
                  }
              }  
          }

          
          
      } else {
         JOptionPane.showMessageDialog(null, "El monto del depósitos debe ser mayor a 0","Advertencia",JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfernecia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
