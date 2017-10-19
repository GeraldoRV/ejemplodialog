package gui;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Entrar
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        dialogMenu = new javax.swing.JMenu();
        cuadroMenuItem = new javax.swing.JMenuItem();
        cuadro2MenuItem = new javax.swing.JMenuItem();
        cuadro3MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuFile.setText("File");

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        menuFile.add(openMenuItem);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");
        jMenuBar1.add(menuEdit);

        dialogMenu.setText("Dialog Change");

        cuadroMenuItem.setText("cuadro");
        cuadroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroMenuItemActionPerformed(evt);
            }
        });
        dialogMenu.add(cuadroMenuItem);

        cuadro2MenuItem.setText("cuadro2");
        cuadro2MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro2MenuItemActionPerformed(evt);
            }
        });
        dialogMenu.add(cuadro2MenuItem);

        cuadro3MenuItem.setText("cuadro3");
        cuadro3MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadro3MenuItemActionPerformed(evt);
            }
        });
        dialogMenu.add(cuadro3MenuItem);

        jMenuBar1.add(dialogMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        System.out.println("Boton abrir");
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void cuadroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroMenuItemActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Esto es un mensaje", "Titulo", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_cuadroMenuItemActionPerformed

    private void cuadro2MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro2MenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "¿estas seguro?", "Salir", JOptionPane.YES_NO_OPTION);
        
        if (res == JOptionPane.YES_OPTION) {
            System.out.println("terminar la opcion");
        }
        
    }//GEN-LAST:event_cuadro2MenuItemActionPerformed

    private void cuadro3MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadro3MenuItemActionPerformed
        String res = (String) JOptionPane.showInputDialog(rootPane, "Intrdoucir nombre dle dragon", "Nombre dragon0",JOptionPane.PLAIN_MESSAGE,null,null,"Marc");
    }//GEN-LAST:event_cuadro3MenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cuadro2MenuItem;
    private javax.swing.JMenuItem cuadro3MenuItem;
    private javax.swing.JMenuItem cuadroMenuItem;
    private javax.swing.JMenu dialogMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables
}
