/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;
import javax.swing.JOptionPane;
import lab01.Handlers.Fabrica;

/**
 *
 * @author joaquin
 */
public class GenerarPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form GenerarPedido
     */
    public GenerarPedido() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        //ListarUsuariosGP listar = new ListarUsuariosGP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbSeleccionarCliente = new javax.swing.JButton();

        jLabel1.setText("Seleccione un Cliente");

        jbSeleccionarCliente.setText("Seleccionar");
        jbSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jbSeleccionarCliente)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbSeleccionarCliente))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarClienteActionPerformed
        ListarUsuariosGP listar = new ListarUsuariosGP();
        Console.EscritorioMenu.add(listar);
        listar.toFront();
        listar.show();
        

// TODO add your handling code here:
    }//GEN-LAST:event_jbSeleccionarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbSeleccionarCliente;
    // End of variables declaration//GEN-END:variables
}
