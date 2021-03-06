/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import java.awt.event.ItemEvent;
import lab01.Handlers.Fabrica;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author joaquin
 */
public class SeleccionarCatReg extends javax.swing.JInternalFrame {
    private ICtrlUsuario ICU;

    /**
     * Creates new form SeleccionarCat
     */
    public SeleccionarCatReg() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
        this.cargarCBbox();
        model = new DefaultListModel();
    }
    DefaultListModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbSelect = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList();
        jbListo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Seleccione las Categorias del Restaurante");

        jcbSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select..." }));
        jcbSelect.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jcbSelectMouseDragged(evt);
            }
        });
        jcbSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSelectItemStateChanged(evt);
            }
        });
        jcbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelectActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jLista);

        jbListo.setText("Listo");
        jbListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListoActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione las Categorias del Restaurante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbListo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbListo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSelectItemStateChanged
        if(evt.getStateChange()==ItemEvent.SELECTED)
            model.addElement(evt.getItem().toString());
            //jcbSelect.removeItem(evt.getItem());
        jLista.setModel(model);
        

//String s = (String) jcbSelect.getSelectedItem();
// TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectItemStateChanged

    private void jcbSelectMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbSelectMouseDragged




// TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectMouseDragged

    private void jbListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListoActionPerformed
          if (model.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos una categoria.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Map ret = new HashMap();
            int i = 0;
            while (i < model.size()) {
                ret.put(model.getElementAt(i), model.getElementAt(i));
                i++;
            }
            ICU.setCat(ret);
            
        }
        this.dispose();
        


// TODO add your handling code here:
    }//GEN-LAST:event_jbListoActionPerformed

    private void jcbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSelectActionPerformed
    public void cargarCBbox(){
        Map cats; 
        cats=ICU.retColCat();
        Iterator it = cats.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            jcbSelect.addItem(map.getKey().toString());
        }
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListo;
    private javax.swing.JComboBox jcbSelect;
    // End of variables declaration//GEN-END:variables
}
