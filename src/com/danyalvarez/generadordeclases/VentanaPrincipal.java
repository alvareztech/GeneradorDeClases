package com.danyalvarez.generadordeclases;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Clase VentanaPrincipal
 * @author Daniel Alvarez (a3dany)
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Clase clase;
    private VentanaTipo ventanaTipo;
    private VentanaCodigo ventanaCodigo;

    public VentanaPrincipal() {
        initComponents();
        clase = new Clase();
        ventanaTipo = new VentanaTipo(this, true);
        ventanaCodigo = new VentanaCodigo(this, true, null);
        this.setLocationRelativeTo(null);
        listaAtributos.setModel(new DefaultListModel());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombreClase = new javax.swing.JTextField();
        cbxClasePadre = new javax.swing.JCheckBox();
        cbxClaseHija = new javax.swing.JCheckBox();
        txtNombreClasePadre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtNombreAtributo = new javax.swing.JTextField();
        btnTipo = new javax.swing.JButton();
        btnAdicionarAtributo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAtributos = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        cbxSetterYGetter = new javax.swing.JCheckBox();
        cbxLeerYMostrar = new javax.swing.JCheckBox();
        btnGenerarClaseJava = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnA3D = new javax.swing.JButton();
        btnGenerarClaseCSharp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador De Clases 1.3");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtNombreClase.setForeground(java.awt.Color.gray);
        txtNombreClase.setText("Nombre Clase");
        txtNombreClase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreClaseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreClaseFocusLost(evt);
            }
        });

        cbxClasePadre.setFont(new java.awt.Font("Consolas", 0, 11));
        cbxClasePadre.setText("Padre");

        cbxClaseHija.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        cbxClaseHija.setText("Hija");
        cbxClaseHija.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClaseHijaItemStateChanged(evt);
            }
        });

        txtNombreClasePadre.setForeground(java.awt.Color.gray);
        txtNombreClasePadre.setText("Su Clase Padre");
        txtNombreClasePadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreClasePadreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreClasePadreFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        txtNombreAtributo.setForeground(java.awt.Color.gray);
        txtNombreAtributo.setText("Nombre Atributo");
        txtNombreAtributo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreAtributoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreAtributoFocusLost(evt);
            }
        });

        btnTipo.setFont(new java.awt.Font("Consolas", 0, 11));
        btnTipo.setText("String");
        btnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoActionPerformed(evt);
            }
        });

        btnAdicionarAtributo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adicionar.png"))); // NOI18N
        btnAdicionarAtributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAtributoActionPerformed(evt);
            }
        });

        listaAtributos.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listaAtributos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreAtributo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreAtributo)
                    .addComponent(btnTipo, 0, 0, Short.MAX_VALUE)
                    .addComponent(btnAdicionarAtributo, 0, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Métodos"));

        cbxSetterYGetter.setSelected(true);
        cbxSetterYGetter.setText("Setter Y Getter");

        cbxLeerYMostrar.setSelected(true);
        cbxLeerYMostrar.setText("Leer Y Mostrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxSetterYGetter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxLeerYMostrar)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSetterYGetter)
                    .addComponent(cbxLeerYMostrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGenerarClaseJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/java.png"))); // NOI18N
        btnGenerarClaseJava.setText("Generar En Java");
        btnGenerarClaseJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarClaseJavaActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnReset.setText("Nueva Clase");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnA3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a3d.png"))); // NOI18N
        btnA3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA3DActionPerformed(evt);
            }
        });

        btnGenerarClaseCSharp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/csharp.png"))); // NOI18N
        btnGenerarClaseCSharp.setText("Generar En C#");
        btnGenerarClaseCSharp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarClaseCSharpActionPerformed(evt);
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
                        .addComponent(txtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxClasePadre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxClaseHija)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreClasePadre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnA3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerarClaseCSharp, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(btnGenerarClaseJava, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbxClasePadre)
                    .addComponent(txtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreClasePadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxClaseHija))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnGenerarClaseJava))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarClaseCSharp)
                    .addComponent(btnA3D))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoActionPerformed
        ventanaTipo.setTitle("Tipo De \"" + Formato.variable(txtNombreAtributo.getText()) + "\"");
        ventanaTipo.setVisible(true);
    }//GEN-LAST:event_btnTipoActionPerformed

    private void btnGenerarClaseJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarClaseJavaActionPerformed
        String nombreClase = Formato.nombreClase(txtNombreClase.getText());
        boolean padre = cbxClasePadre.isSelected();
        boolean hija = cbxClaseHija.isSelected();
        String nombrePadre = Formato.nombreClase(txtNombreClasePadre.getText());
        //clase = new Clase(nombreClase, padre, hija, nombrePadre);
        clase.setNombre(nombreClase);
        clase.setPadre(padre);
        clase.setHija(hija);
        clase.setNombrePadre(nombrePadre);
        String codigo = clase.generarCodigoJava(cbxSetterYGetter.isSelected(), cbxLeerYMostrar.isSelected());
        ventanaCodigo = new VentanaCodigo(this, true, codigo);
        ventanaCodigo.setVisible(true);
    }//GEN-LAST:event_btnGenerarClaseJavaActionPerformed

    private void txtNombreAtributoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAtributoFocusGained
        txtNombreAtributo.setForeground(Color.BLACK);
        txtNombreAtributo.setText("");
    }//GEN-LAST:event_txtNombreAtributoFocusGained

    private void txtNombreAtributoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreAtributoFocusLost
        if (txtNombreAtributo.getText().equals("")) {
            txtNombreAtributo.setForeground(Color.GRAY);
            txtNombreAtributo.setText("Nombre Atributo");
        }
    }//GEN-LAST:event_txtNombreAtributoFocusLost

    private void txtNombreClaseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreClaseFocusGained
        txtNombreClase.setForeground(Color.BLACK);
        txtNombreClase.setText("");
    }//GEN-LAST:event_txtNombreClaseFocusGained

    private void txtNombreClaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreClaseFocusLost
        if (txtNombreClase.getText().equals("")) {
            txtNombreClase.setForeground(Color.GRAY);
            txtNombreClase.setText("Nombre Clase");
        }
    }//GEN-LAST:event_txtNombreClaseFocusLost

    private void cbxClaseHijaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClaseHijaItemStateChanged
        if (cbxClaseHija.isSelected()) {
            txtNombreClasePadre.setVisible(true);
        } else {
            txtNombreClasePadre.setVisible(false);
        }
        this.setVisible(true);
    }//GEN-LAST:event_cbxClaseHijaItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtNombreClasePadre.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtNombreClasePadreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreClasePadreFocusGained
        txtNombreClasePadre.setForeground(Color.BLACK);
        txtNombreClasePadre.setText("");
    }//GEN-LAST:event_txtNombreClasePadreFocusGained

    private void txtNombreClasePadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreClasePadreFocusLost
        if (txtNombreClasePadre.getText().equals("")) {
            txtNombreClasePadre.setForeground(Color.GRAY);
            txtNombreClasePadre.setText("Su Clase Padre");
        }
    }//GEN-LAST:event_txtNombreClasePadreFocusLost

    private void btnAdicionarAtributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAtributoActionPerformed
        adicionarAtributo();
}//GEN-LAST:event_btnAdicionarAtributoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clase = new Clase();
        listaAtributos.setModel(new DefaultListModel());
        txtNombreClase.requestFocus();
        txtNombreClasePadre.setForeground(Color.GRAY);
        txtNombreClasePadre.setText("Su Clase Padre");
        txtNombreAtributo.setForeground(Color.GRAY);
        txtNombreAtributo.setText("Nombre Atributo");
        cbxClaseHija.setSelected(false);
        cbxClasePadre.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnA3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3DActionPerformed
        JOptionPane.showMessageDialog(this, "Daniel Alvarez (a3dany)\nSoloInformaticaYAlgoMas.blogspot.com", "Acerca De Generador De Clases 1.3", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnA3DActionPerformed

    private void btnGenerarClaseCSharpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarClaseCSharpActionPerformed
        String nombreClase = Formato.nombreClase(txtNombreClase.getText());
        boolean padre = cbxClasePadre.isSelected();
        boolean hija = cbxClaseHija.isSelected();
        String nombrePadre = Formato.nombreClase(txtNombreClasePadre.getText());
        //clase = new Clase(nombreClase, padre, hija, nombrePadre);
        clase.setNombre(nombreClase);
        clase.setPadre(padre);
        clase.setHija(hija);
        clase.setNombrePadre(nombrePadre);
        String codigo = clase.generarCodigoCSharp(cbxSetterYGetter.isSelected(), cbxLeerYMostrar.isSelected());
        ventanaCodigo = new VentanaCodigo(this, true, codigo);
        ventanaCodigo.setVisible(true);
    }//GEN-LAST:event_btnGenerarClaseCSharpActionPerformed

    public static void main(String[] a3d) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA3D;
    private javax.swing.JButton btnAdicionarAtributo;
    private javax.swing.JButton btnGenerarClaseCSharp;
    private javax.swing.JButton btnGenerarClaseJava;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTipo;
    private javax.swing.JCheckBox cbxClaseHija;
    private javax.swing.JCheckBox cbxClasePadre;
    private javax.swing.JCheckBox cbxLeerYMostrar;
    private javax.swing.JCheckBox cbxSetterYGetter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaAtributos;
    private javax.swing.JTextField txtNombreAtributo;
    private javax.swing.JTextField txtNombreClase;
    private javax.swing.JTextField txtNombreClasePadre;
    // End of variables declaration//GEN-END:variables

    public void actualizar(String definicion) {
        btnTipo.setText(definicion);
    }

    public void adicionarAtributo() {
        String nombreAtributo = Formato.nombreVariable(txtNombreAtributo.getText());
        String variableAtributo = Formato.variable(txtNombreAtributo.getText());
        Tipo tipoAtributo = ventanaTipo.getTipo();
        Atributo A = new Atributo(nombreAtributo, variableAtributo, tipoAtributo);
        clase.adicionarAtributo(A);
        // adiciona atributo a la tabla
        DefaultListModel modelo = (DefaultListModel) listaAtributos.getModel();

        modelo.addElement(A.getVariable() + " : " + A.getTipo().getDefinicionJava());

        // modelo.addElement(new Object[]{new Font("Helvetica", Font.PLAIN, 20), Color.red, null, "Help"});
        // ListCellRenderer renderer = new ComplexCellRenderer();
        // listaAtributos.setCellRenderer(renderer);
    }
}
