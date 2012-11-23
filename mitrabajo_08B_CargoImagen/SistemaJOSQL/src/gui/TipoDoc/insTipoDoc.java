/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * insTipoDoc.java
 *
 * Created on 05/05/2010, 08:48:43 PM
 */
package gui.TipoDoc;

import javax.swing.JOptionPane;
import joyeria.TipoDocumentos;
import modelo.Controlador;

/**
 *
 * @author Alumno
 */
public class insTipoDoc extends javax.swing.JInternalFrame {

    /** Creates new form insTipoDoc */
    public insTipoDoc() {
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

        jLabel1 = new javax.swing.JLabel();
        txtDescipcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Insertar Tipo Documento");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setText("Descripcion:");

        txtDescipcion.setFont(new java.awt.Font("Arial", 0, 12));

        btnAgregar.setFont(new java.awt.Font("Arial", 0, 12));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescipcion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescipcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try {
            TipoDocumentos xtipdoc = new TipoDocumentos();
            xtipdoc.setDescripcion(txtDescipcion.getText());
            Controlador c = new Controlador();
            c.insertar_tipdoc(xtipdoc);
            JOptionPane.showMessageDialog(null, "Exito");
            txtDescipcion.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDescipcion;
    // End of variables declaration//GEN-END:variables
}
