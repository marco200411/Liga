/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.juego;

import Interface.menus.Menu;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author a22marcorr
 */
public class pantallaSesionIniciada extends javax.swing.JFrame {

    /**
     * Creates new form pantallaSesionIniciada
     */
    public pantallaSesionIniciada() {
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

        layerBG = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        layerCabecera = new javax.swing.JLayeredPane();
        lblNombreLiga = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblProximoPartido = new javax.swing.JLabel();
        lblPPEquipoVisitante = new javax.swing.JLabel();
        lblPPEquipoLocal = new javax.swing.JLabel();
        lblPPEquipoVisitante1 = new javax.swing.JLabel();
        layerCabeceraSinLiga = new javax.swing.JLayeredPane();
        lblSinLiga = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        layerInfo = new javax.swing.JLayeredPane();
        layerMenu = new javax.swing.JLayeredPane();
        btnHome = new javax.swing.JButton();
        btnPlantilla = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnClasificacion = new javax.swing.JButton();
        btnBuscarJugador = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        btnLiga = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 900,700, 50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layerBG.setBackground(new java.awt.Color(206, 206, 206));
        layerBG.setOpaque(true);
        layerBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        layerBG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 850, 10));

        layerCabecera.setBackground(new java.awt.Color(92, 99, 112));
        layerCabecera.setForeground(new java.awt.Color(124, 124, 124));
        layerCabecera.setOpaque(true);
        layerCabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreLiga.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblNombreLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 570, 30));

        lblPuntos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 230, 30));

        lblProximoPartido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProximoPartido.setForeground(new java.awt.Color(206, 206, 206));
        lblProximoPartido.setText("Proximo Partido:");
        layerCabecera.add(lblProximoPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 40));

        lblPPEquipoVisitante.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPPEquipoVisitante.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPPEquipoVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 300, 40));

        lblPPEquipoLocal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPPEquipoLocal.setForeground(new java.awt.Color(206, 206, 206));
        lblPPEquipoLocal.setText("VS");
        lblPPEquipoLocal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layerCabecera.add(lblPPEquipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 70, 40));

        lblPPEquipoVisitante1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPPEquipoVisitante1.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPPEquipoVisitante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 300, 40));

        layerBG.add(layerCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 850, 100));

        layerCabeceraSinLiga.setBackground(new java.awt.Color(92, 99, 112));
        layerCabeceraSinLiga.setForeground(new java.awt.Color(124, 124, 124));
        layerCabeceraSinLiga.setOpaque(true);
        layerCabeceraSinLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSinLiga.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblSinLiga.setForeground(new java.awt.Color(206, 206, 206));
        lblSinLiga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSinLiga.setText("Crea o unete a una liga y empieza a jugar con tus amigos");
        lblSinLiga.setToolTipText("");
        layerCabeceraSinLiga.add(lblSinLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 80));

        layerBG.add(layerCabeceraSinLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 850, 100));
        layerBG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 850, 10));

        layerInfo.setBackground(new java.awt.Color(92, 99, 112));
        layerInfo.setOpaque(true);
        layerInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        layerBG.add(layerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 850, 400));

        getContentPane().add(layerBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 890, 580));

        layerMenu.setBackground(new java.awt.Color(206, 206, 206));
        layerMenu.setOpaque(true);
        layerMenu.setLayout(new java.awt.GridLayout(1, 0));

        btnHome.setBackground(new java.awt.Color(206, 206, 206));
        btnHome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(0, 0, 0));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btnHome.setName(""); // NOI18N
        btnHome.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.click.png"))); // NOI18N
        btnHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.hover.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        btnHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnHomeKeyReleased(evt);
            }
        });
        layerMenu.add(btnHome);
        btnHome.getAccessibleContext().setAccessibleDescription("");

        btnPlantilla.setBackground(new java.awt.Color(206, 206, 206));
        btnPlantilla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPlantilla.setForeground(new java.awt.Color(0, 0, 0));
        btnPlantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.png"))); // NOI18N
        btnPlantilla.setBorder(null);
        btnPlantilla.setBorderPainted(false);
        btnPlantilla.setContentAreaFilled(false);
        btnPlantilla.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.click.png"))); // NOI18N
        btnPlantilla.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.hover.png"))); // NOI18N
        layerMenu.add(btnPlantilla);

        btnPerfil.setBackground(new java.awt.Color(206, 206, 206));
        btnPerfil.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnPerfil.setBorder(null);
        btnPerfil.setBorderPainted(false);
        btnPerfil.setContentAreaFilled(false);
        btnPerfil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.click.png"))); // NOI18N
        btnPerfil.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.hover.png"))); // NOI18N
        layerMenu.add(btnPerfil);

        btnClasificacion.setBackground(new java.awt.Color(206, 206, 206));
        btnClasificacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClasificacion.setForeground(new java.awt.Color(0, 0, 0));
        btnClasificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.png"))); // NOI18N
        btnClasificacion.setBorder(null);
        btnClasificacion.setBorderPainted(false);
        btnClasificacion.setContentAreaFilled(false);
        btnClasificacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.click.png"))); // NOI18N
        btnClasificacion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.hover.png"))); // NOI18N
        layerMenu.add(btnClasificacion);

        btnBuscarJugador.setBackground(new java.awt.Color(206, 206, 206));
        btnBuscarJugador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscarJugador.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnBuscarJugador.setBorder(null);
        btnBuscarJugador.setBorderPainted(false);
        btnBuscarJugador.setContentAreaFilled(false);
        btnBuscarJugador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.click.png"))); // NOI18N
        btnBuscarJugador.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.hover.png"))); // NOI18N
        layerMenu.add(btnBuscarJugador);

        btnTienda.setBackground(new java.awt.Color(206, 206, 206));
        btnTienda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTienda.setForeground(new java.awt.Color(0, 0, 0));
        btnTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.png"))); // NOI18N
        btnTienda.setBorder(null);
        btnTienda.setBorderPainted(false);
        btnTienda.setContentAreaFilled(false);
        btnTienda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.click.png"))); // NOI18N
        btnTienda.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.hover.png"))); // NOI18N
        layerMenu.add(btnTienda);

        btnLiga.setBackground(new java.awt.Color(206, 206, 206));
        btnLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLiga.setForeground(new java.awt.Color(0, 0, 0));
        btnLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.png"))); // NOI18N
        btnLiga.setBorder(null);
        btnLiga.setBorderPainted(false);
        btnLiga.setContentAreaFilled(false);
        btnLiga.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.click.png"))); // NOI18N
        btnLiga.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.hover.png"))); // NOI18N
        layerMenu.add(btnLiga);

        btnExit.setBackground(new java.awt.Color(206, 206, 206));
        btnExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.press.png"))); // NOI18N
        btnExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.hover.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        layerMenu.add(btnExit);

        getContentPane().add(layerMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHomeKeyReleased
        // TODO add your handling code here:
//        btnHome.setIcon(home_90px.hover);
    }//GEN-LAST:event_btnHomeKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);

        
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(pantallaSesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaSesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaSesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaSesionIniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaSesionIniciada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJugador;
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLiga;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPlantilla;
    private javax.swing.JButton btnTienda;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLayeredPane layerBG;
    private javax.swing.JLayeredPane layerCabecera;
    private javax.swing.JLayeredPane layerCabeceraSinLiga;
    private javax.swing.JLayeredPane layerInfo;
    private javax.swing.JLayeredPane layerMenu;
    private javax.swing.JLabel lblNombreLiga;
    private javax.swing.JLabel lblPPEquipoLocal;
    private javax.swing.JLabel lblPPEquipoVisitante;
    private javax.swing.JLabel lblPPEquipoVisitante1;
    private javax.swing.JLabel lblProximoPartido;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblSinLiga;
    // End of variables declaration//GEN-END:variables
}
