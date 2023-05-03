/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.menus;

import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author a22marcorr
 */
public class pantallaCrearCuenta extends javax.swing.JFrame {
    private static String MYSQLUSER = "root";

    private static String MYSQLPASS = "root";
    /**
     * Creates new form pantallaCrearCuenta
     */
    public pantallaCrearCuenta() {
        initComponents();
    }

   
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
        lblCorreo = new javax.swing.JLabel();
        separatorCorreo = new javax.swing.JSeparator();
        txtCCCorreo = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        separatorApellidos = new javax.swing.JSeparator();
        txtCCApellidos = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        separatorNombre = new javax.swing.JSeparator();
        txtCCNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 650));
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 650, 650, 20, 20));
        setSize(new java.awt.Dimension(650, 650));

        BG.setBackground(new java.awt.Color(206, 206, 206));
        BG.setOpaque(true);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCuenta.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(92, 99, 112));
        lblCrearCuenta.setText("CREAR CUENTA");
        BG.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 390, 60));

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(92, 99, 112));
        lblContraseña.setText("Contraseña");
        BG.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));
        BG.add(separatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 260, 10));

        txtCCContraseña.setBackground(new java.awt.Color(206, 206, 206));
        txtCCContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCContraseña.setBorder(null);
        txtCCContraseña.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 260, 50));

        btnCCCreate.setBackground(new java.awt.Color(45, 89, 141));
        btnCCCreate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCCCreate.setForeground(new java.awt.Color(206, 206, 206));
        btnCCCreate.setText("Crear cuenta");
        btnCCCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCCreateActionPerformed(evt);
            }
        });
        BG.add(btnCCCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 180, 80));

        lblUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(92, 99, 112));
        lblUsername.setText("Nombre usuario");
        BG.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));
        BG.add(separatorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 260, 10));

        txtCCUsername.setBackground(new java.awt.Color(206, 206, 206));
        txtCCUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCUsername.setBorder(null);
        txtCCUsername.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 260, 50));

        lblCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(92, 99, 112));
        lblCorreo.setText("Correo electronico");
        BG.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));
        BG.add(separatorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 260, 10));

        txtCCCorreo.setBackground(new java.awt.Color(206, 206, 206));
        txtCCCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCCorreo.setBorder(null);
        txtCCCorreo.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 260, 50));

        lblApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(92, 99, 112));
        lblApellidos.setText("Apellidos");
        BG.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));
        BG.add(separatorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 260, 20));

        txtCCApellidos.setBackground(new java.awt.Color(206, 206, 206));
        txtCCApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCApellidos.setBorder(null);
        txtCCApellidos.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 260, 50));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(92, 99, 112));
        lblNombre.setText("Nombre");
        BG.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));
        BG.add(separatorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 260, 20));

        txtCCNombre.setBackground(new java.awt.Color(206, 206, 206));
        txtCCNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCNombre.setBorder(null);
        txtCCNombre.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void escrituraSql(String insertString) {
        Statement insertFilm = null;
        Connection mysqlCon = null;
        String mysqlUrl = "jdbc:mysql://localhost/bbdd_fantasy";
        try {

            mysqlCon = DriverManager.getConnection(mysqlUrl, MYSQLUSER, MYSQLPASS);

            insertFilm = mysqlCon.createStatement();

            int inseridos = insertFilm.executeUpdate(insertString);

            System.out.println("Resultado: " + inseridos + " inserido");
        } catch (SQLException e) {

            while (e != null) { //bucle que trata a cadea de excepcións

                System.err.println("SQLState: " + e.getSQLState());

                System.err.println(" Code: " + e.getErrorCode());

                System.err.println(" Message:");

                System.err.println(e.getMessage());

                e = e.getNextException();

            }

        } finally {

            if (mysqlCon != null) {

                try {
                    mysqlCon.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }
    
    
    private void btnCCCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCCreateActionPerformed
        // TODO add your handling code here:
        String usuario = txtCCUsername.getText();
        String contraseña = txtCCContraseña.getText();
        String nombre = txtCCNombre.getText();
        String apellidos = txtCCApellidos.getText();
        String correo = txtCCCorreo.getText();
        if(!usuario.contains("*") && !usuario.contains("@")){
            String insertString = "INSERT INTO tbl_usuario (`USUARIO`, `CONTRASENA`, `NOMBRE`, `APELLIDOS`, `CORREO`) VALUES ('" + usuario + "', '" + contraseña + "', '" + nombre + "','" + apellidos + "' , '" + correo + "');";
        escrituraSql(insertString); 
        }else{
            
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
            java.util.logging.Logger.getLogger(pantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaCrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaCrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BG;
    private javax.swing.JButton btnCCCreate;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorApellidos;
    private javax.swing.JSeparator separatorContraseña;
    private javax.swing.JSeparator separatorCorreo;
    private javax.swing.JSeparator separatorNombre;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JTextField txtCCApellidos;
    private javax.swing.JPasswordField txtCCContraseña;
    private javax.swing.JTextField txtCCCorreo;
    private javax.swing.JTextField txtCCNombre;
    private javax.swing.JTextField txtCCUsername;
    // End of variables declaration//GEN-END:variables
}
