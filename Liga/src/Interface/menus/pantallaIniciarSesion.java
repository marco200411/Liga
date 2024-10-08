package Interface.menus;

import Interface.juego.pantallaSesionIniciada;
import Methods.Entrenador;
import Methods.Equipo;
import Methods.Liga;
import Methods.Usuario;
import OperacionesBBDD.ObtenerDatosBBDD;
import OperacionesBBDD.OperacionesBBDD;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase pantallaIniciarSesion representa la pantalla de inicio de sesión en
 * la aplicación.
 *
 * author a22marcorr
 */
public class pantallaIniciarSesion extends javax.swing.JFrame {

    int xMouse, yMouse;
    private static String MYSQLUSER = "root";

    private static String MYSQLPASS = "root";

    /**
     * Crea una instancia de la clase pantallaIniciarSesion.
     */
    public pantallaIniciarSesion() {
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
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnError1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 650));
        setMinimumSize(new java.awt.Dimension(650, 650));
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, 650, 650, 50, 50));

        BG.setBackground(new java.awt.Color(51, 61, 87));
        BG.setOpaque(true);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearCuenta.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(255, 255, 243));
        lblCrearCuenta.setText("INICIAR SESION");
        BG.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 390, 60));

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 243));
        lblContraseña.setText("Contraseña");
        BG.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        separatorContraseña.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 260, 10));

        txtCCContraseña.setBackground(new java.awt.Color(51, 61, 87));
        txtCCContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCContraseña.setForeground(new java.awt.Color(255, 255, 243));
        txtCCContraseña.setBorder(null);
        txtCCContraseña.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 50));

        btnCCCreate.setBackground(new java.awt.Color(45, 89, 141));
        btnCCCreate.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCCCreate.setForeground(new java.awt.Color(206, 206, 206));
        btnCCCreate.setText("Iniciar sesion");
        btnCCCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCCreateActionPerformed(evt);
            }
        });
        BG.add(btnCCCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 180, 80));

        lblUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 243));
        lblUsername.setText("Nombre usuario o correo");
        BG.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        separatorUsername.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 260, 10));

        txtCCUsername.setBackground(new java.awt.Color(51, 61, 87));
        txtCCUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCUsername.setForeground(new java.awt.Color(255, 255, 243));
        txtCCUsername.setBorder(null);
        txtCCUsername.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 260, 50));

        panelAcciones.setForeground(new java.awt.Color(51, 61, 87));
        panelAcciones.setMaximumSize(new java.awt.Dimension(95, 25));
        panelAcciones.setMinimumSize(new java.awt.Dimension(95, 25));

        btnRetroceder.setBackground(new java.awt.Color(51, 61, 87));
        btnRetroceder.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRetroceder.setForeground(new java.awt.Color(153, 0, 0));
        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retroceder.png"))); // NOI18N
        btnRetroceder.setBorder(null);
        btnRetroceder.setBorderPainted(false);
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRetroceder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetroceder.setOpaque(true);
        btnRetroceder.setRequestFocusEnabled(false);
        btnRetroceder.setRolloverEnabled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(51, 61, 87));
        btnMinimizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(153, 0, 0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar (1).png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setOpaque(true);
        btnMinimizar.setRequestFocusEnabled(false);
        btnMinimizar.setRolloverEnabled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(51, 61, 87));
        btnClose.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(153, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close (1).png"))); // NOI18N
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.setOpaque(true);
        btnClose.setRequestFocusEnabled(false);
        btnClose.setRolloverEnabled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        panelAcciones.setLayer(btnRetroceder, javax.swing.JLayeredPane.POPUP_LAYER);
        panelAcciones.setLayer(btnMinimizar, javax.swing.JLayeredPane.POPUP_LAYER);
        panelAcciones.setLayer(btnClose, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnClose))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        BG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 5, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 350, 30));

        btnError1.setBackground(new java.awt.Color(51, 61, 87));
        btnError1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnError1.setForeground(new java.awt.Color(153, 0, 0));
        btnError1.setBorder(null);
        btnError1.setBorderPainted(false);
        btnError1.setContentAreaFilled(false);
        btnError1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnError1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnError1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnError1.setMaximumSize(new java.awt.Dimension(390, 80));
        btnError1.setMinimumSize(new java.awt.Dimension(390, 80));
        btnError1.setOpaque(true);
        btnError1.setPreferredSize(new java.awt.Dimension(390, 80));
        btnError1.setRequestFocusEnabled(false);
        btnError1.setRolloverEnabled(false);
        btnError1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnError1ActionPerformed(evt);
            }
        });
        BG.setLayer(btnError1, javax.swing.JLayeredPane.POPUP_LAYER);
        BG.add(btnError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 400, -1));

        jPanel1.setBackground(new java.awt.Color(51, 61, 87));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnCCCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCCreateActionPerformed

        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();

        if (getDatos.ComprobarUsuarioBBDD(txtCCUsername.getText(), txtCCContraseña.getText())) {
            Entrenador entrenador = getDatos.getEntrenadorBBDD(txtCCUsername.getText());
            Equipo equipo = getDatos.getEquipoBBDD(txtCCUsername.getText(), entrenador);

            Usuario usuario = getDatos.getUsuarioBBDD(txtCCUsername.getText());
            usuario.setEquipo(equipo);
            Liga liga = getDatos.getLigaBBDD(usuario.getNombre());
            usuario.setLiga(liga);
            getDatos.getJugadoresPlantilla(usuario);

            this.setVisible(false);
            pantallaSesionIniciada pantalla = new pantallaSesionIniciada(usuario);
            pantalla.setVisible(true);
        } else {
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("Nombre usuario o contraseña incorrectos");
        }
//if (escritura.escrituraSql(insertString)) {
//                    btnError1.setForeground(new java.awt.Color(0, 100, 0));
//                    btnError1.setVisible(true);
//                    btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INSERT.png")));
//                    btnError1.setText("Usuario creado con exito, haga click aqui para iniciar sesion");
//
//                } else {
//                    btnError1.setForeground(new java.awt.Color(100, 0, 0));
//                    btnError1.setVisible(true);
//                    btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
//                    btnError1.setText("Nombre usuario en uso");
//
//                }
//        if (consulta != null) {
//            try {
//
//                // procesa cada fila do resultado
//                if (mysqlResult.next()) {
//                    
//                    Liga liga = new Liga(mysqlResult.getString(6), mysqlResult.getString(7));
//                    
//                    Entrenador entrenador = getDatos.getEntrenadorBBDD(liga, mysqlResult.getString(1));
//                    
//                    Equipo equipo = new Equipo(liga, "n", consulta, WIDTH, WIDTH);
//                    us1.setEquipo(consulta);
//
//                    
//                } else {
//                    System.out.println("No encontrado");
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(pantallaIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            getSql(consulta);

    }//GEN-LAST:event_btnCCCreateActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnError1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnError1ActionPerformed
        btnError1.setVisible(false);
        pantallaIniciarSesion pantalla = new pantallaIniciarSesion();
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnError1ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int y = evt.getYOnScreen();
        int x = evt.getXOnScreen();
        setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel1MousePressed

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
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnError1;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLayeredPane panelAcciones;
    private javax.swing.JSeparator separatorContraseña;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JPasswordField txtCCContraseña;
    private javax.swing.JTextField txtCCUsername;
    // End of variables declaration//GEN-END:variables
}
