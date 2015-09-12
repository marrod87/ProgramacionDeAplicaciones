/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import java.util.Iterator;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import lab01.Clases.DataCarrito;
import lab01.Clases.DataPedido;
import lab01.Clases.Restaurante;
import lab01.Handlers.Fabrica;

/**
 *
 * @author gera
 */
public class AltaPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form AltaPedido
     */
    ICtrlPedido ICP;
    int fila = 0;
 
    public AltaPedido() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICP = fabrica.getICtrlPedido();
        lblnomUsuario.setText(ICP.getDp().getNickUsr());
        lblMailCliente.setText(ICP.getDp().getMailUsr());
        long l =ICP.getDp().getId();
        String id = Long.toString(l);
        lblIdPedido.setText(id);
        lblEstadoPedido.setText("Preparacion");
        lblFecha.setText(ICP.getDp().getFecha());
        lblRestaurante.setText(ICP.getDp().getNickRest());
        modelo = (DefaultTableModel)tblPedido.getModel();
        LoadTablePedido(ICP.getDp().getNickRest());
        Double tot = ICP.getDp().getPrecio_total();
        String sTotal = Double.toString(tot);
        lblTotalPedido.setText(sTotal);
        ICP.limpiarCtrl();
        
        //LoadTablePedido();

        
    }
    DefaultTableModel modelo;
    
        private void LoadTablePedido(String res){
        //Restaurante r = null;
        String lista[]=new String[5];
        Map prod = ICP.getDp().getColCarrito();
        Iterator it = prod.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry mapcol = (Map.Entry) it.next();
            DataCarrito carro = (DataCarrito)mapcol.getValue();
            lista[0]= carro.getNomProd();
            int cant = carro.getCantidad();
            String sCant = Integer.toString(cant);
            lista[1]= sCant;
            double precio = carro.getPrecio();
            String sPrecio = Double.toString(precio);
            lista[2] = sPrecio;
            double totalU = cant * precio;
            String sTotalU = Double.toString(totalU);
            lista[3] = sTotalU;
            boolean promo = carro.getPromo();
            //String sPromo = Boolean.toString(promo);
            if (promo){
              lista[4] = "SI";
            }else{
              lista[4] = "NO";
            }
            //lista[4] = sPromo;
            modelo.insertRow((int)fila, lista);
            fila++;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblConfirmacion = new javax.swing.JLabel();
        lblNickUser = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblnomUsuario = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMailCliente = new javax.swing.JLabel();
        lblIdPedido = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblEstadoPedido = new javax.swing.JLabel();
        lblRest = new javax.swing.JLabel();
        lblRestaurante = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTotalPedido = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblConfirmacion.setText("Se ha registrado correctamente su pedido");

        lblNickUser.setText("Nombre de cliente:");

        lblMail.setText("Email del cliente:");

        lblId.setText("ID del pedido:");

        lblFecha.setText("Fecha");

        lblEstado.setText("Estado del pedido:");

        lblRest.setText("Restaurante:");

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio unitario", "Precio total", "Promocional?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPedido);

        jLabel1.setText("Total:");
        jLabel1.setToolTipText("");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNickUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblnomUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfirmacion)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMail)
                                            .addComponent(lblId))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIdPedido)
                                            .addComponent(lblMailCliente)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblRest, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEstado))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lblEstadoPedido))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(lblRestaurante)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotalPedido))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAceptar)
                                .addGap(30, 30, 30))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblConfirmacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNickUser)
                    .addComponent(lblnomUsuario)
                    .addComponent(lblFecha))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMail)
                            .addComponent(lblMailCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(lblIdPedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(lblEstadoPedido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRest)
                            .addComponent(lblRestaurante))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblTotalPedido))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoPedido;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdPedido;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblMailCliente;
    private javax.swing.JLabel lblNickUser;
    private javax.swing.JLabel lblRest;
    private javax.swing.JLabel lblRestaurante;
    private javax.swing.JLabel lblTotalPedido;
    private javax.swing.JLabel lblnomUsuario;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables
}
