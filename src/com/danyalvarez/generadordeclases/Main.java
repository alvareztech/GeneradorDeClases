package com.danyalvarez.generadordeclases;

import javax.swing.UIManager;

/**
 * Clase Main
 * @author Daniel Alvarez (a3dany)
 */
public class Main {

    public static void main(String[] a3d) {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName())) {
                try {
                    UIManager.setLookAndFeel(laf.getClassName());
                } catch (Exception ex) {
                }
            }
        }
        VentanaPrincipal X = new VentanaPrincipal();
        X.setVisible(true);
    }
}
