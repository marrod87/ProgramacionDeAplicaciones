/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01.Interfaces;

import javax.swing.JOptionPane;
import lab01.Clases.Cliente;
import lab01.Handlers.Fabrica;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author gonzalo
 */
public class VerCliente extends javax.swing.JInternalFrame {
    private ICtrlUsuario ICU; 
    /**
     * Creates new form VerCliente
     */
    public VerCliente() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
       this.tbNickNameCliente.setVisible(false);
       this.tbapellidoClente.setVisible(false);
       this.tbdireccionCliente.setVisible(false);
       this.tbfechaDeNacCliente.setVisible(false);
       this.tbmailCliente.setVisible(false);
       this.tbnombreCliente.setVisible(false);
       this.tbtipoDeUsuario.setVisible(false);
       this.lblNicknameCliente.setVisible(false);
       this.lblapellidoCliente.setVisible(false);
       this.lbldireccionCliente.setVisible(false);
       this.lblfechaNacCliente.setVisible(false);
       this.lblmailCliente.setVisible(false);
       this.lblnombreCliente.setVisible(false);
       this.lbltipoDeUsuarioCliente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cliente = new javax.swing.JTextField();
        ver = new javax.swing.JButton();
        tbNickNameCliente = new javax.swing.JTextField();
        tbmailCliente = new javax.swing.JTextField();
        tbnombreCliente = new javax.swing.JTextField();
        tbapellidoClente = new javax.swing.JTextField();
        tbdireccionCliente = new javax.swing.JTextField();
        tbfechaDeNacCliente = new javax.swing.JTextField();
        tbtipoDeUsuario = new javax.swing.JTextField();
        lblNicknameCliente = new javax.swing.JLabel();
        lblmailCliente = new javax.swing.JLabel();
        lblnombreCliente = new javax.swing.JLabel();
        lblapellidoCliente = new javax.swing.JLabel();
        lbldireccionCliente = new javax.swing.JLabel();
        lblfechaNacCliente = new javax.swing.JLabel();
        lbltipoDeUsuarioCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblVerImagenUsr = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(500, 500));

        ver.setText("Ver cliente");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        tbNickNameCliente.setEditable(false);

        tbmailCliente.setEditable(false);

        tbnombreCliente.setEditable(false);

        tbapellidoClente.setEditable(false);

        tbdireccionCliente.setEditable(false);

        tbfechaDeNacCliente.setEditable(false);

        tbtipoDeUsuario.setEditable(false);

        lblNicknameCliente.setText("NickName:");

        lblmailCliente.setText("Correo electronico:");

        lblnombreCliente.setText("Nombre:");

        lblapellidoCliente.setText("Apellido:");

        lbldireccionCliente.setText("Direccion:");

        lblfechaNacCliente.setText("Fecha de nacimiento:");

        lbltipoDeUsuarioCliente.setText("Tipo de usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVerImagenUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVerImagenUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbldireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblfechaNacCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbltipoDeUsuarioCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblapellidoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNicknameCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblmailCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblnombreCliente, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbtipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbfechaDeNacCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(tbmailCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbNickNameCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbnombreCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbapellidoClente, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbdireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(ver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbNickNameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNicknameCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmailCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombreCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbapellidoClente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapellidoCliente)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbdireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccionCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbfechaDeNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechaNacCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltipoDeUsuarioCliente))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        //String cli = ICU.verClientes();
    //String str = toString();
        Fabrica fabrica = Fabrica.getInstance();
        ICU = fabrica.getICtrlUsuario();
       String cli = this.cliente.getText();
       Cliente c = ICU.getUsuarioByNickname(cli);
       this.tbNickNameCliente.setVisible(true);
       this.tbNickNameCliente.setText(c.getNickname());
       this.tbapellidoClente.setVisible(true);
       this.tbapellidoClente.setText(c.getApellido());
       this.tbdireccionCliente.setVisible(true);
       this.tbdireccionCliente.setText(c.getDireccion());
       this.tbfechaDeNacCliente.setVisible(true);
       
       this.tbmailCliente.setVisible(true);
       this.tbmailCliente.setText(c.getMail());
       this.tbnombreCliente.setVisible(true);
       this.tbnombreCliente.setText(c.getNombre());
       this.tbtipoDeUsuario.setVisible(true);

       this.lblNicknameCliente.setVisible(true);
       this.lblapellidoCliente.setVisible(true);
       this.lbldireccionCliente.setVisible(true);
       this.lblfechaNacCliente.setVisible(true);
       this.lblmailCliente.setVisible(true);
       this.lblnombreCliente.setVisible(true);
       this.lbltipoDeUsuarioCliente.setVisible(true);
       ImageIcon icon = new ImageIcon(c.getImagen());
       lblVerImagenUsr.setIcon(icon);
       this.lblVerImagenUsr.setVisible(true);
    //this.Cliente.setText("lala");
    }//GEN-LAST:event_verActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNicknameCliente;
    private javax.swing.JLabel lblVerImagenUsr;
    private javax.swing.JLabel lblapellidoCliente;
    private javax.swing.JLabel lbldireccionCliente;
    private javax.swing.JLabel lblfechaNacCliente;
    private javax.swing.JLabel lblmailCliente;
    private javax.swing.JLabel lblnombreCliente;
    private javax.swing.JLabel lbltipoDeUsuarioCliente;
    private javax.swing.JTextField tbNickNameCliente;
    private javax.swing.JTextField tbapellidoClente;
    private javax.swing.JTextField tbdireccionCliente;
    private javax.swing.JTextField tbfechaDeNacCliente;
    private javax.swing.JTextField tbmailCliente;
    private javax.swing.JTextField tbnombreCliente;
    private javax.swing.JTextField tbtipoDeUsuario;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables

 
}
