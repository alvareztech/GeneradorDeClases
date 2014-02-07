package com.danyalvarez.generadordeclases;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase VentanaCodigo
 * @author Daniel Alvarez (a3dany)
 */
public class VentanaCodigo extends javax.swing.JDialog {

    public VentanaCodigo(java.awt.Frame parent, boolean modal, String codigo) {
        super(parent, modal);
        initComponents();
        txtCodigo.setText(codigo);
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        btnCopiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Código Generado");

        txtCodigo.setColumns(20);
        txtCodigo.setFont(new java.awt.Font("Consolas", 0, 14));
        txtCodigo.setRows(5);
        txtCodigo.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(txtCodigo);

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles.png"))); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCopiar)
                    .addComponent(btnGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(txtCodigo.getText());
        cb.setContents(ss, null);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
//System.getProperty("user.dir") Abre el JFileChooser donde esta el ejecutable
            JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Clase Java (.java)", "java");
            fc.setFileFilter(filter);
            fc.showSaveDialog(this); //Muestra el diálogo

            File Guardar = fc.getSelectedFile();
            if (Guardar != null) {
                FileWriter Guardx = new FileWriter(Guardar + ".java");
                Guardx.write(txtCodigo.getText());
                Guardx.close(); //Cierra el fichero
            }
        } catch (IOException ioe) {
            System.out.println(ioe); //Muestra por consola los errores
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtCodigo;
    // End of variables declaration//GEN-END:variables
}
