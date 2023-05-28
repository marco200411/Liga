package Interface.menus;

import Methods.Usuario;
import OperacionesBBDD.OperacionesBBDD;
import java.awt.geom.RoundRectangle2D;

public class pantallaCrearCuenta extends javax.swing.JFrame {
    
     
    int xMouse, yMouse;
    private static String MYSQLUSER = "root";

    private static String MYSQLPASS = "root";

    public pantallaCrearCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JLayeredPane();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        separatorApellidos = new javax.swing.JSeparator();
        txtCCApellidos = new javax.swing.JTextField();
        separatorContraseña = new javax.swing.JSeparator();
        lblContraseña = new javax.swing.JLabel();
        separatorNombre = new javax.swing.JSeparator();
        separatorUsername = new javax.swing.JSeparator();
        txtCCUsername = new javax.swing.JTextField();
        txtCCNombre = new javax.swing.JTextField();
        btnError1 = new javax.swing.JButton();
        btnCCCreate = new javax.swing.JButton();
        lblApellidos = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        separatorCorreo = new javax.swing.JSeparator();
        txtCCContraseña = new javax.swing.JPasswordField();
        txtCCCorreo = new javax.swing.JTextField();
        lblCrearCuenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(635, 700));
        setMinimumSize(new java.awt.Dimension(635, 700));
        setUndecorated(true);
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 635, 650, 20, 20));
        setSize(new java.awt.Dimension(635, 700));

        BG.setBackground(new java.awt.Color(51, 61, 87));
        BG.setMaximumSize(new java.awt.Dimension(635, 700));
        BG.setMinimumSize(new java.awt.Dimension(635, 700));
        BG.setOpaque(true);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 30));

        separatorApellidos.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 260, 20));

        txtCCApellidos.setBackground(new java.awt.Color(51, 61, 87));
        txtCCApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtCCApellidos.setBorder(null);
        txtCCApellidos.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 260, 50));

        separatorContraseña.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 260, 10));

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");
        BG.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        separatorNombre.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 260, 20));

        separatorUsername.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 260, 10));

        txtCCUsername.setBackground(new java.awt.Color(51, 61, 87));
        txtCCUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtCCUsername.setBorder(null);
        txtCCUsername.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 260, 50));

        txtCCNombre.setBackground(new java.awt.Color(51, 61, 87));
        txtCCNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtCCNombre.setBorder(null);
        txtCCNombre.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 260, 50));

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
        BG.add(btnError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 400, -1));

        btnCCCreate.setBackground(new java.awt.Color(45, 89, 141));
        btnCCCreate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCCCreate.setForeground(new java.awt.Color(206, 206, 206));
        btnCCCreate.setText("Crear cuenta");
        btnCCCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCCreateActionPerformed(evt);
            }
        });
        BG.add(btnCCCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 150, 80));

        lblApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setText("Apellidos");
        BG.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        lblUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Nombre usuario");
        BG.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo electronico");
        BG.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");
        BG.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        separatorCorreo.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(separatorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 260, 10));

        txtCCContraseña.setBackground(new java.awt.Color(51, 61, 87));
        txtCCContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtCCContraseña.setBorder(null);
        txtCCContraseña.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 260, 50));

        txtCCCorreo.setBackground(new java.awt.Color(51, 61, 87));
        txtCCCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCCCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCCCorreo.setBorder(null);
        txtCCCorreo.setMaximumSize(new java.awt.Dimension(64, 22));
        BG.add(txtCCCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 260, 50));

        lblCrearCuenta.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCrearCuenta.setText("CREAR CUENTA");
        BG.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 350, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 243));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 340, 20));

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
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnCCCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCCreateActionPerformed
       

        if ( comprobarFormulario() == true) {
            String usuario = txtCCUsername.getText();
            String contraseña = txtCCContraseña.getText();
            String nombre = txtCCNombre.getText();
            String apellidos = txtCCApellidos.getText();
            String correo = txtCCCorreo.getText();
            if (!usuario.contains("*") && !usuario.contains("@")) {
                String insertString = "INSERT INTO tbl_usuario (`USUARIO`, `CONTRASENA`, `NOMBRE`, `APELLIDOS`, `CORREO`)\n"
                        + "SELECT '" + usuario + "', MD5('" + contraseña + "'), '" + nombre + "','" + apellidos + "' , '" + correo + "'\n"
                        + "WHERE NOT EXISTS (SELECT * FROM TBL_USUARIO WHERE USUARIO = '" + usuario + "');";
                OperacionesBBDD escritura = new OperacionesBBDD();

                if (escritura.escrituraSql(insertString)) {
                    btnError1.setForeground(new java.awt.Color(0, 100, 0));
                    btnError1.setVisible(true);
                    btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INSERT.png")));
                    btnError1.setText("Usuario creado con exito, haga click aqui para iniciar sesion");

                } else {
                    btnError1.setForeground(new java.awt.Color(100, 0, 0));
                    btnError1.setVisible(true);
                    btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
                    btnError1.setText("Nombre usuario en uso");

                }

            }
        }


    }//GEN-LAST:event_btnCCCreateActionPerformed

    private boolean comprobarFormulario() {
        boolean valido = true;
        if (txtCCNombre.getText().isEmpty()) {
            valido = false;
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("El formato de campo nombre no es valido");
        } else if (txtCCApellidos.getText().isEmpty()) {
            valido = false;
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("El formato de campo apellidos no es valido");
        } else if (txtCCCorreo.getText().isEmpty()) {
            valido = false;
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("El formato de campo correo no es valido");
        } else if (txtCCUsername.getText().isEmpty()) {
            valido = false;
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("El formato de campo nombre usuario no es valido");
        } else if (txtCCContraseña.getText().isEmpty()) {
            valido = false;
            btnError1.setForeground(new java.awt.Color(100, 0, 0));
            btnError1.setVisible(true);
            btnError1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
            btnError1.setText("El formato de campo contraseña no es valido");
        }
        return valido;
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnError1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnError1ActionPerformed
        btnError1.setVisible(false);
        pantallaIniciarSesion pantalla = new pantallaIniciarSesion();
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnError1ActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int y = evt.getYOnScreen();
        int x = evt.getXOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaCrearCuenta().setVisible(true);
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
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLayeredPane panelAcciones;
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
