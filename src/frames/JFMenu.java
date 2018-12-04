
package frames;

import clases.RegistroDocumento;


public class JFMenu extends javax.swing.JFrame {

    RegistroDocumento registro;

    
    public JFMenu() {
        initComponents();
        registro = new RegistroDocumento();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniListar = new javax.swing.JMenuItem();
        mniAgregar = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenuItem();
        mniModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Procesos");

        mniListar.setText("Listar");
        mniListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniListarActionPerformed(evt);
            }
        });
        jMenu2.add(mniListar);

        mniAgregar.setText("Agregar");
        mniAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarActionPerformed(evt);
            }
        });
        jMenu2.add(mniAgregar);

        mniEliminar.setText("Eliminar");
        mniEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminarActionPerformed(evt);
            }
        });
        jMenu2.add(mniEliminar);

        mniModificar.setText("Modificar");
        mniModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniModificarActionPerformed(evt);
            }
        });
        jMenu2.add(mniModificar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarActionPerformed

        JFAgregar agregar = new JFAgregar();
        agregar.setVisible(true);
    }//GEN-LAST:event_mniAgregarActionPerformed

    private void mniEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminarActionPerformed
        
        JFEliminar eliminar = new JFEliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_mniEliminarActionPerformed

    private void mniListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniListarActionPerformed
        
        JFListar listar = new JFListar();
        listar.setVisible(true);
    }//GEN-LAST:event_mniListarActionPerformed

    private void mniModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniModificarActionPerformed
        
        JFModificar modificar = new JFModificar();
        modificar.setVisible(true);
    }//GEN-LAST:event_mniModificarActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mniAgregar;
    private javax.swing.JMenuItem mniEliminar;
    private javax.swing.JMenuItem mniListar;
    private javax.swing.JMenuItem mniModificar;
    // End of variables declaration//GEN-END:variables
}
