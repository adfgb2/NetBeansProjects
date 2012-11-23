/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * insProducto.java
 *
 * Created on 06-may-2010, 2:52:11
 */
package gui.Producto;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import joyeria.Familia;
import modelo.Controlador;
import joyeria.Producto;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author familia
 */
public class insProducto extends javax.swing.JInternalFrame {

    /** Creates new form insProducto */
    public insProducto() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboCfamilia = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtFregistro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFbaja = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Insertar Producto");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setText("Descripcion:");

        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setText("Familia Codigo:");

        cboCfamilia.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setText("Fecha de Registro:");

        txtFregistro.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel4.setText("Fecha de Baja:");

        txtFbaja.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel5.setText("Estado:");

        txtEstado.setFont(new java.awt.Font("Arial", 0, 12));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel6.setText("Foto:");

        txtFoto.setFont(new java.awt.Font("Arial", 0, 12));

        btnBuscar.setFont(new java.awt.Font("Arial", 0, 12));
        btnBuscar.setText("...");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 12));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11));
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 213, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(txtFbaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(txtFregistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(cboCfamilia, javax.swing.GroupLayout.Alignment.TRAILING, 0, 174, Short.MAX_VALUE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(txtFoto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFbaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        try {
            Controlador c = new Controlador();
            List<Familia> familias = c.relacion_familia();
            for (Familia familia : familias) {
                this.cboCfamilia.addItem(familia.getIdFamilia());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:        
        try {
            Producto xproduc = new Producto();
            xproduc.setDescripcion(txtDescripcion.getText());
            Familia myfamilia = new Familia();
            myfamilia.setIdFamilia(Integer.parseInt(cboCfamilia.getSelectedItem().toString()));
            xproduc.setFamilia(myfamilia);
            SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yy");
            SimpleDateFormat fechaa = new SimpleDateFormat("dd-MM-yy");
            xproduc.setFechaDeRegistro(fechaa.parse(txtFregistro.getText()));
            xproduc.setFechaDeBaja(fecha.parse(txtFbaja.getText()));
            xproduc.setEstado(txtEstado.getText());
            FileInputStream fis;
            fis = new FileInputStream(txtFoto.getText());
            byte[] foto = null;
            foto = new byte[fis.available()];
            fis.read(foto);
            xproduc.setFoto(foto);
            Controlador c = new Controlador();
            c.insertar_producto(xproduc);
            JOptionPane.showMessageDialog(null, "Exito");
            txtDescripcion.setText("");
            txtFregistro.setText("");
            txtFbaja.setText("");
            txtEstado.setText("");
            txtFoto.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }



    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Seleccione Imagenes", "jpeg", "jpg", "png", "gif");
        buscar.setFileFilter(filtro);
        int result = buscar.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = buscar.getSelectedFile();
            txtFoto.setText(String.valueOf(file));
            ImageIcon imagen = new ImageIcon(buscar.getSelectedFile().getPath());
            ImageIcon mostrar = new ImageIcon(imagen.getImage().getScaledInstance(213,154,0));
            jLabel7.setIcon(mostrar);
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JFileChooser buscar;
    private javax.swing.JComboBox cboCfamilia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFbaja;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtFregistro;
    // End of variables declaration//GEN-END:variables
}
