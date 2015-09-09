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
import lab01.Clases.DataCliente;


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
        cargarDatos();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNicknameCliente = new javax.swing.JLabel();
        tbdireccionCliente = new javax.swing.JTextField();
        tbfechaDeNacCliente = new javax.swing.JTextField();
        lblapellidoCliente = new javax.swing.JLabel();
        lblmailCliente = new javax.swing.JLabel();
        lblnombreCliente = new javax.swing.JLabel();
        tbNickNameCliente = new javax.swing.JTextField();
        tbmailCliente = new javax.swing.JTextField();
        lblfechaNacCliente = new javax.swing.JLabel();
        tbapellidoClente = new javax.swing.JTextField();
        lbldireccionCliente = new javax.swing.JLabel();
        tbnombreCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblVerImagenUsr = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ver informacion del cliente");
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        lblNicknameCliente.setText("NickName:");

        tbdireccionCliente.setEditable(false);

        tbfechaDeNacCliente.setEditable(false);

        lblapellidoCliente.setText("Apellido:");

        lblmailCliente.setText("Correo electronico:");

        lblnombreCliente.setText("Nombre:");

        tbNickNameCliente.setEditable(false);

        tbmailCliente.setEditable(false);

        lblfechaNacCliente.setText("Fecha de nacimiento:");

        tbapellidoClente.setEditable(false);

        lbldireccionCliente.setText("Direccion:");

        tbnombreCliente.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldireccionCliente)
                    .addComponent(lblfechaNacCliente)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblapellidoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNicknameCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblmailCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnombreCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbfechaDeNacCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbmailCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbNickNameCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbnombreCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbapellidoClente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbdireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbNickNameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNicknameCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmailCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbapellidoClente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellidoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbdireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccionCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbfechaDeNacCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechaNacCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerImagenUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVerImagenUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargarDatos(){
       DataCliente c = ICU.getUsuarioByNickname(ICU.getNickname());
       this.tbNickNameCliente.setVisible(true);
       this.tbNickNameCliente.setText(c.getNickname());
       this.tbapellidoClente.setVisible(true);
       this.tbapellidoClente.setText(c.getApellido());
       this.tbdireccionCliente.setVisible(true);
       this.tbdireccionCliente.setText(c.getDireccion());
       this.tbfechaDeNacCliente.setVisible(true);
       this.tbfechaDeNacCliente.setText(c.getFNac());
       this.tbmailCliente.setVisible(true);
       this.tbmailCliente.setText(c.getMail());
       this.tbnombreCliente.setVisible(true);
       this.tbnombreCliente.setText(c.getNombre());
       this.lblNicknameCliente.setVisible(true);
       this.lblapellidoCliente.setVisible(true);
       this.lbldireccionCliente.setVisible(true);
       this.lblfechaNacCliente.setVisible(true);
       this.lblmailCliente.setVisible(true);
       this.lblnombreCliente.setVisible(true);
       ImageIcon icon = new ImageIcon(c.getImagen());
       lblVerImagenUsr.setIcon(icon);
       this.lblVerImagenUsr.setVisible(true);
    }                                   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNicknameCliente;
    private javax.swing.JLabel lblVerImagenUsr;
    private javax.swing.JLabel lblapellidoCliente;
    private javax.swing.JLabel lbldireccionCliente;
    private javax.swing.JLabel lblfechaNacCliente;
    private javax.swing.JLabel lblmailCliente;
    private javax.swing.JLabel lblnombreCliente;
    private javax.swing.JTextField tbNickNameCliente;
    private javax.swing.JTextField tbapellidoClente;
    private javax.swing.JTextField tbdireccionCliente;
    private javax.swing.JTextField tbfechaDeNacCliente;
    private javax.swing.JTextField tbmailCliente;
    private javax.swing.JTextField tbnombreCliente;
    // End of variables declaration//GEN-END:variables

 
}
