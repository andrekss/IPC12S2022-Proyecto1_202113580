
package proyecto1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import static proyecto1.Proyecto1.iDAutoincrementable;

public class PagoServicios extends javax.swing.JFrame {


    public PagoServicios() {
        initComponents();
        this.setTitle("Pagar servicios");
        this.setLocationRelativeTo(null);
        
        for (int i = 0; i < Proyecto1.TotClientes.length; i++) {
                for (int j = 0; j < 5; j++) {  // llenamos el jcombobox con los clientes creados sin cui pero con id
                    if (Proyecto1.TotClientes[i] != null && Proyecto1.TotClientes[i].getTotCuentas()[j] != null  ) { // los dos arreglos deben tener algo
             jComboBox1.addItem(String.valueOf(Proyecto1.TotClientes[i].getTotCuentas()[j].getId()));
             
             // +"-"+Proyecto1.TotClientes[i].getNombre()+" "+Proyecto1.TotClientes[i].getApellido() agregar despues
                    }
                }
        }
        
        jComboBox2.addItem("Luz electrica");
        jComboBox2.addItem("Agua");
        jComboBox2.addItem("Servicio telefónico");
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cuenta a debitar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de servicio");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Monto");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Pagar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox2, 0, 203, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
      
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Administrador P = new Administrador();
       P.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       double debito = Double.parseDouble(jTextField1.getText());         
          iDAutoincrementable++;
      if (debito > 0) {
          for (int i = 0; i < Proyecto1.TotClientes.length; i++) {
              if (Proyecto1.TotClientes[i] != null) {
                  for (int j = 0; j < Proyecto1.TotClientes[i].getTotCuentas().length; j++) {
                      if (Proyecto1.TotClientes[i].getTotCuentas()[j] != null && Proyecto1.TotClientes[i].getTotCuentas()[j].getId() == Integer.parseInt((String) jComboBox1.getSelectedItem()) ) {
                        
                          if (debito <= Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo()) {
                          double saldoInicial = Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo();
                          Proyecto1.TotClientes[i].getTotCuentas()[j].setSaldo(saldoInicial-debito);
                          JOptionPane.showMessageDialog(null,"Pago hecho exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
                      System.out.println(Proyecto1.TotClientes[i].getTotCuentas()[j].getSaldo()); // verificar
                      
                      String fecha = ZonedDateTime.now(ZoneId.of("America/Guatemala")).format(DateTimeFormatter.ofPattern("MM-dd-yyy, hh:mm:ss a"));
                          
                          Transacción tr = new Transacción( iDAutoincrementable, fecha, "Pago servicio "+ jComboBox2.getSelectedItem(),debito,0.0,-debito+saldoInicial);
                          
                          for (int k = 0; k < 20; k++) {
                              if (Proyecto1.TotClientes[i].getTotCuentas()[j].getaTransacciones()[k] == null) {
                                   Proyecto1.TotClientes[i].getTotCuentas()[j].getaTransacciones()[k] =tr;
                                   break;
                                 }
                          }
                      
                      
                      
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
                new PagoServicios().setVisible(true);
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
