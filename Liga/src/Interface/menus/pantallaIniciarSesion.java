/*
 * Click nbfs://nbhost/Syste    @Override
    public double getArcWidth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getArcHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setRoundRect(double x, double y, double w, double h, double arcWidth, double arcHeight) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getX() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Rectangle2D getBounds2D() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
mFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.menus;

import Interface.juego.pantallaSesionIniciada;
import Methods.Usuario;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a22marcorr
 */
public class pantallaIniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form pantallaIniciarSesion
     */
    private static String MYSQLUSER = "root";

    private static String MYSQLPASS = "root";

    public pantallaIniciarSesion() {
        initComponents();

    }

    public boolean validarUsuario(Usuario us1) {
        boolean inicio = false;

        return inicio;

    }
public void componentResized(ComponentEvent e) {
                    setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));
                }
    private void getSql(String consulta) {

        try {

            String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";

            Connection mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            Statement mysqlSelect = mysqlCon.createStatement();
            System.out.println(consulta);
            ResultSet mysqlResult = mysqlSelect.executeQuery(consulta);

            int contador = 0;

            // procesa cada fila do resultado
            if (mysqlResult.next()) {
                System.out.println(txtCCUsername.getText());
                System.out.println(mysqlResult.getString(4));
                System.out.println(txtCCContraseña.getText());
                System.out.println(mysqlResult.getString(5));
                if (txtCCContraseña.getText().equalsIgnoreCase(mysqlResult.getString(5)) && (txtCCUsername.getText().equalsIgnoreCase(mysqlResult.getString(4)) || txtCCUsername.getText().equalsIgnoreCase(mysqlResult.getString(6)))) {

                    Usuario us1 = new Usuario(mysqlResult.getString(2), mysqlResult.getString(3), mysqlResult.getString(4), mysqlResult.getString(5), mysqlResult.getString(6), mysqlResult.getString(7), mysqlResult.getString(8));
                    System.out.println(us1.getContraseña());
                    pantallaSesionIniciada pantalla = new pantallaSesionIniciada();
                    pantalla.setVisible(true);
                    this.setVisible(false);

               } else {
                    System.out.println("No encontrado");
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(pantallaIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
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

        BG = new javax.swing.JLayeredPane();
        lblCrearCuenta = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        separatorContraseña = new javax.swing.JSeparator();
        txtCCContraseña = new javax.swing.JPasswordField();
        btnCCCreate = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        separatorUsername = new javax.swing.JSeparator();
        txtCCUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 650));
        setShape(new RoundRectangle2D.Double(0, 0, 650, 650, 50, 50));

        BG.setBackground(new java.awt.Color(206, 206, 206));
        BG.setOpaque(true);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCuenta.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(92, 99, 112));
        lblCrearCuenta.setText("INICIAR SESION");
        BG.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 390, 60));

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(92, 99, 112));
        lblContraseña.setText("Contraseña");
        BG.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        BG.add(separatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 260, 10));

        txtCCContraseña.setBackground(new java.awt.Color(206, 206, 206));
        txtCCContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCContraseña.setBorder(null);
        txtCCContraseña.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 260, 50));

        btnCCCreate.setBackground(new java.awt.Color(45, 89, 141));
        btnCCCreate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCCCreate.setForeground(new java.awt.Color(206, 206, 206));
        btnCCCreate.setText("Crear cuenta");
        btnCCCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCCreateActionPerformed(evt);
            }
        });
        BG.add(btnCCCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 180, 80));

        lblUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(92, 99, 112));
        lblUsername.setText("Nombre usuario o correo");
        BG.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));
        BG.add(separatorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 260, 10));

        txtCCUsername.setBackground(new java.awt.Color(206, 206, 206));
        txtCCUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCUsername.setBorder(null);
        txtCCUsername.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCCCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCCreateActionPerformed
        // TODO add your handling code here:
        String consulta = null;
        if (txtCCUsername.getText().contains("@")) {
            consulta = ("SELECT * FROM tbl_usuario WHERE CORREO='" + txtCCUsername.getText() + "';");

        } else {
            consulta = ("SELECT * FROM tbl_usuario WHERE USUARIO='" + txtCCUsername.getText() + "';");
        }
        if (consulta != null) {
            getSql(consulta);

        }


    }//GEN-LAST:event_btnCCCreateActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaIniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaIniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BG;
    private javax.swing.JButton btnCCCreate;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorContraseña;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JPasswordField txtCCContraseña;
    private javax.swing.JTextField txtCCUsername;
    // End of variables declaration//GEN-END:variables
}
