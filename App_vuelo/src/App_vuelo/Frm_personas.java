
package App_vuelo;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Frm_personas extends javax.swing.JFrame {
    

     Stack<String> Pila_niño = new Stack<String>();
     
     Stack<String> Pila_adulto = new Stack<String>();
    
     Stack<String> Pila_anciano = new Stack<String>();
    
    public Frm_personas() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        btn_Joven = new javax.swing.JButton();
        btn_Adulto = new javax.swing.JButton();
        btn_Niño = new javax.swing.JButton();
        btn_Añadir = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(207, 241, 225));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 85, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Apellido:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("Edad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 40, 20));

        jPanel3.setBackground(new java.awt.Color(90, 198, 198));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App_vuelo/descarga__4___1_-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 30)); // NOI18N
        jLabel2.setText("Registro De Personas Abordo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, 30));
        jPanel2.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, 30));
        jPanel2.add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 230, 30));

        btn_Joven.setBackground(new java.awt.Color(204, 204, 204));
        btn_Joven.setText("Joven");
        btn_Joven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JovenActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Joven, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 185, 100, 30));

        btn_Adulto.setBackground(new java.awt.Color(204, 204, 204));
        btn_Adulto.setText("Adulto");
        btn_Adulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdultoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Adulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 235, 100, 30));

        btn_Niño.setBackground(new java.awt.Color(204, 204, 204));
        btn_Niño.setText("Niño");
        btn_Niño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NiñoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 100, 30));

        btn_Añadir.setText("Añadir");
        btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AñadirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, -1));

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
      
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AñadirActionPerformed
       Añadir(txt_Nombre.getText(),txt_Apellido.getText(), txt_Edad.getText());
    }//GEN-LAST:event_btn_AñadirActionPerformed
 private void Añadir(String Nombre, String Apellido, String Edad) {
        try {
            int edadInt = Integer.parseInt(Edad);

            if (edadInt >= 2 && edadInt <= 12) {
                Pila_niño.push(Nombre + " " + Apellido);
                 JOptionPane.showMessageDialog(null,"Niño: " + Nombre + Apellido + " añadido");
            } else if (edadInt >= 15 && edadInt <= 25) {
                Pila_adulto.push(Nombre + " " + Apellido);
              JOptionPane.showMessageDialog(null,"joven: " + Nombre +Apellido + " añadido");
            } else if (edadInt >= 60 && edadInt <= 80) {
                Pila_anciano.push(Nombre + " " + Apellido);
                JOptionPane.showMessageDialog(null,"Adulto Mayor: " +Nombre + Apellido + " añadido");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ingrese una edad válida.");
        }
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Edad.setText("");
      
       
      private void Mostrar () {
    JOptionPane.showMessageDialog(null, "Registros de Niños: " + Pila_niño.toString());
     JOptionPane.showMessageDialog(null, "Registros de Adultos: " + Pila_adulto.toString());
      JOptionPane.showMessageDialog(null, "Registros de Adultos Mayores: " + Pila_anciano.toString());
}
    private void btn_NiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NiñoActionPerformed
       Mostrar();
    }//GEN-LAST:event_btn_NiñoActionPerformed

    private void btn_JovenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JovenActionPerformed
      Mostrar();
    }//GEN-LAST:event_btn_JovenActionPerformed

    private void btn_AdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdultoActionPerformed
      Mostrar();
    }//GEN-LAST:event_btn_AdultoActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_personas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adulto;
    private javax.swing.JButton btn_Añadir;
    private javax.swing.JButton btn_Joven;
    private javax.swing.JButton btn_Niño;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

   
    

    
}
