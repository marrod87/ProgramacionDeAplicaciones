/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01.Interfaces;
import java.util.Vector;
import java.awt.event.ItemEvent;
import java.util.Iterator;
import lab01.Clases.Restaurante;
import lab01.Clases.Cliente;
import lab01.Handlers.Fabrica;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab01.Clases.DataCliente;

/**
 *
 * @author admin123
 */
public class ListarClientesVer extends javax.swing.JInternalFrame {
    private ICtrlUsuario ICU; 
    /**
     * Creates new form VerCliente
     */
    public ListarClientesVer() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
        modelo = (DefaultTableModel)jtabla.getModel();

        this.cargarTabla();
      
    }
     DefaultTableModel modelo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeleccione = new javax.swing.JLabel();
        jbListo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Seleccione el Cliente que desea ver");
        setPreferredSize(new java.awt.Dimension(500, 500));

        jSeleccione.setText("Seleccione un cliente:");

        jbListo.setText("Listo");
        jbListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListoActionPerformed(evt);
            }
        });

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Nickname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeleccione)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbListo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbListo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListoActionPerformed
        String nick=String.valueOf(modelo.getValueAt(jtabla.getSelectedRow(),1));
        ICU.setNickname(nick);
        this.dispose();
        //nueva pantalla seleccionar Categoria
        VerCliente ver = new VerCliente();
        Console.EscritorioMenu.add(ver);
        ver.show();
    }//GEN-LAST:event_jbListoActionPerformed

    private void cargarTabla(){
    Map Datas; 
        Datas=ICU.devListaDC();
        Iterator it = Datas.entrySet().iterator();
        String lista[]=new String[2];
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            DataCliente dc = (DataCliente) map.getValue();
            //lista[0]=model.getSize()-1;
            lista[0]=dc.getMail();
            lista[1]=dc.getNickname();
            modelo.insertRow((int)jtabla.getRowCount(), lista);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSeleccione;
    private javax.swing.JButton jbListo;
    private javax.swing.JTable jtabla;
    // End of variables declaration//GEN-END:variables

 
}
