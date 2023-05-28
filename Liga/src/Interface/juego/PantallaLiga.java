package Interface.juego;

import Interface.menus.Menu;
import Methods.Equipo;
import Methods.Liga;
import Methods.Usuario;
import OperacionesBBDD.OperacionesBBDD;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import Methods.Futbolista;

/**
 * La clase PantallaLiga representa la pantalla principal de la aplicación relacionada con las ligas.
 * Permite al usuario unirse a una liga existente o crear una nueva.
 *
 * @author Marco
 */
public class PantallaLiga extends javax.swing.JFrame {

    int xMouse, yMouse;
    Usuario Actual = null;

    /**
     * Crea una instancia de la clase PantallaLiga con el usuario especificado.
     *
     * @param us1 El objeto Usuario que representa al usuario actualmente
     * conectado.
     */
    public PantallaLiga(Usuario us1) {
        initComponents();
        btnUnirseLiga.setEnabled(true);
        btnCrearLiga.setEnabled(true);
        Actual = us1;
        lblNombreUsu.setText(Actual.getNombreUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerBG = new javax.swing.JLayeredPane();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        layerUnirseLiga = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        btnUnirseLiga = new javax.swing.JButton();
        txtNombreUnirseLiga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInfoUnirse = new javax.swing.JButton();
        layerInfoCrearLiga = new javax.swing.JLayeredPane();
        jSeparator3 = new javax.swing.JSeparator();
        btnCrearLiga = new javax.swing.JButton();
        txtNombreCrearLiga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInfoCrear = new javax.swing.JButton();
        layerMenu1 = new javax.swing.JLayeredPane();
        btnHome1 = new javax.swing.JButton();
        btnPlantilla1 = new javax.swing.JButton();
        btnPerfil1 = new javax.swing.JButton();
        btnClasificacion1 = new javax.swing.JButton();
        btnBuscarJugador1 = new javax.swing.JButton();
        btnTienda1 = new javax.swing.JButton();
        btnLiga1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, 900, 700, 50, 50));

        layerBG.setBackground(new java.awt.Color(51, 61, 87));
        layerBG.setOpaque(true);
        layerBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        layerBG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, 30));
        layerBG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 860, 10));

        layerUnirseLiga.setBackground(new java.awt.Color(92, 99, 112));
        layerUnirseLiga.setMaximumSize(new java.awt.Dimension(410, 510));
        layerUnirseLiga.setMinimumSize(new java.awt.Dimension(410, 510));
        layerUnirseLiga.setOpaque(true);
        layerUnirseLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        layerUnirseLiga.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 330, 20));

        btnUnirseLiga.setBackground(new java.awt.Color(206, 206, 206));
        btnUnirseLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnUnirseLiga.setForeground(new java.awt.Color(0, 0, 0));
        btnUnirseLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telegram_app_150px.png"))); // NOI18N
        btnUnirseLiga.setBorder(null);
        btnUnirseLiga.setBorderPainted(false);
        btnUnirseLiga.setContentAreaFilled(false);
        btnUnirseLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUnirseLiga.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btnUnirseLiga.setName(""); // NOI18N
        btnUnirseLiga.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telegram_app_150px.click.png"))); // NOI18N
        btnUnirseLiga.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telegram_app_150px.hover.png"))); // NOI18N
        btnUnirseLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirseLigaActionPerformed(evt);
            }
        });
        btnUnirseLiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnUnirseLigaKeyReleased(evt);
            }
        });
        layerUnirseLiga.add(btnUnirseLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        txtNombreUnirseLiga.setBackground(new java.awt.Color(92, 99, 112));
        txtNombreUnirseLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreUnirseLiga.setForeground(new java.awt.Color(206, 206, 206));
        txtNombreUnirseLiga.setBorder(null);
        layerUnirseLiga.add(txtNombreUnirseLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, 60));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(206, 206, 206));
        jLabel3.setText("UNIRSE A UNA LIGA");
        layerUnirseLiga.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 80));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(206, 206, 206));
        jLabel4.setText("Nombre de la liga:");
        layerUnirseLiga.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 30));

        btnInfoUnirse.setBackground(new java.awt.Color(92, 99, 112));
        btnInfoUnirse.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnInfoUnirse.setForeground(new java.awt.Color(153, 0, 0));
        btnInfoUnirse.setBorder(null);
        btnInfoUnirse.setBorderPainted(false);
        btnInfoUnirse.setContentAreaFilled(false);
        btnInfoUnirse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInfoUnirse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInfoUnirse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoUnirse.setMaximumSize(new java.awt.Dimension(390, 80));
        btnInfoUnirse.setMinimumSize(new java.awt.Dimension(390, 80));
        btnInfoUnirse.setOpaque(true);
        btnInfoUnirse.setPreferredSize(new java.awt.Dimension(390, 80));
        btnInfoUnirse.setRequestFocusEnabled(false);
        btnInfoUnirse.setRolloverEnabled(false);
        btnInfoUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoUnirseActionPerformed(evt);
            }
        });
        layerUnirseLiga.setLayer(btnInfoUnirse, javax.swing.JLayeredPane.POPUP_LAYER);
        layerUnirseLiga.add(btnInfoUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 80));

        layerInfoCrearLiga.setBackground(new java.awt.Color(92, 99, 112));
        layerInfoCrearLiga.setMaximumSize(new java.awt.Dimension(410, 510));
        layerInfoCrearLiga.setMinimumSize(new java.awt.Dimension(410, 510));
        layerInfoCrearLiga.setOpaque(true);
        layerInfoCrearLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        layerInfoCrearLiga.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 330, 20));

        btnCrearLiga.setBackground(new java.awt.Color(206, 206, 206));
        btnCrearLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCrearLiga.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus_150px.png"))); // NOI18N
        btnCrearLiga.setBorder(null);
        btnCrearLiga.setBorderPainted(false);
        btnCrearLiga.setContentAreaFilled(false);
        btnCrearLiga.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearLiga.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btnCrearLiga.setName(""); // NOI18N
        btnCrearLiga.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus_150px.click.png"))); // NOI18N
        btnCrearLiga.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plus_150px.hover.png"))); // NOI18N
        btnCrearLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLigaActionPerformed(evt);
            }
        });
        btnCrearLiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnCrearLigaKeyReleased(evt);
            }
        });
        layerInfoCrearLiga.add(btnCrearLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        txtNombreCrearLiga.setBackground(new java.awt.Color(92, 99, 112));
        txtNombreCrearLiga.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreCrearLiga.setForeground(new java.awt.Color(206, 206, 206));
        txtNombreCrearLiga.setBorder(null);
        layerInfoCrearLiga.add(txtNombreCrearLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 320, 60));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 206, 206));
        jLabel2.setText("CREAR A UNA LIGA");
        layerInfoCrearLiga.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 360, 80));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 206, 206));
        jLabel1.setText("Nombre de la liga:");
        layerInfoCrearLiga.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 160, 30));

        btnInfoCrear.setBackground(new java.awt.Color(92, 99, 112));
        btnInfoCrear.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnInfoCrear.setForeground(new java.awt.Color(153, 0, 0));
        btnInfoCrear.setBorder(null);
        btnInfoCrear.setBorderPainted(false);
        btnInfoCrear.setContentAreaFilled(false);
        btnInfoCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInfoCrear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInfoCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoCrear.setMaximumSize(new java.awt.Dimension(390, 80));
        btnInfoCrear.setMinimumSize(new java.awt.Dimension(390, 80));
        btnInfoCrear.setOpaque(true);
        btnInfoCrear.setPreferredSize(new java.awt.Dimension(390, 80));
        btnInfoCrear.setRequestFocusEnabled(false);
        btnInfoCrear.setRolloverEnabled(false);
        btnInfoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCrearActionPerformed(evt);
            }
        });
        layerInfoCrearLiga.setLayer(btnInfoCrear, javax.swing.JLayeredPane.POPUP_LAYER);
        layerInfoCrearLiga.add(btnInfoCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 80));

        jLayeredPane1.setLayer(layerUnirseLiga, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layerInfoCrearLiga, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layerInfoCrearLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(layerUnirseLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layerInfoCrearLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layerUnirseLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        layerBG.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 870, 530));

        layerMenu1.setBackground(new java.awt.Color(51, 61, 87));
        layerMenu1.setForeground(new java.awt.Color(51, 61, 87));
        layerMenu1.setOpaque(true);
        layerMenu1.setLayout(new java.awt.GridLayout(1, 0));

        btnHome1.setBackground(new java.awt.Color(206, 206, 206));
        btnHome1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(0, 0, 0));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.png"))); // NOI18N
        btnHome1.setBorder(null);
        btnHome1.setBorderPainted(false);
        btnHome1.setContentAreaFilled(false);
        btnHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btnHome1.setName(""); // NOI18N
        btnHome1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.click.png"))); // NOI18N
        btnHome1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_90px.hover.png"))); // NOI18N
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        btnHome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnHome1KeyReleased(evt);
            }
        });
        layerMenu1.add(btnHome1);

        btnPlantilla1.setBackground(new java.awt.Color(206, 206, 206));
        btnPlantilla1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPlantilla1.setForeground(new java.awt.Color(0, 0, 0));
        btnPlantilla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.png"))); // NOI18N
        btnPlantilla1.setBorder(null);
        btnPlantilla1.setBorderPainted(false);
        btnPlantilla1.setContentAreaFilled(false);
        btnPlantilla1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.click.png"))); // NOI18N
        btnPlantilla1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadium_90px.hover.png"))); // NOI18N
        btnPlantilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantilla1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnPlantilla1);

        btnPerfil1.setBackground(new java.awt.Color(206, 206, 206));
        btnPerfil1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnPerfil1.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnPerfil1.setBorder(null);
        btnPerfil1.setBorderPainted(false);
        btnPerfil1.setContentAreaFilled(false);
        btnPerfil1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.click.png"))); // NOI18N
        btnPerfil1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.hover.png"))); // NOI18N
        btnPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfil1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnPerfil1);

        btnClasificacion1.setBackground(new java.awt.Color(206, 206, 206));
        btnClasificacion1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClasificacion1.setForeground(new java.awt.Color(0, 0, 0));
        btnClasificacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.png"))); // NOI18N
        btnClasificacion1.setBorder(null);
        btnClasificacion1.setBorderPainted(false);
        btnClasificacion1.setContentAreaFilled(false);
        btnClasificacion1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.click.png"))); // NOI18N
        btnClasificacion1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.hover.png"))); // NOI18N
        btnClasificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificacion1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnClasificacion1);

        btnBuscarJugador1.setBackground(new java.awt.Color(206, 206, 206));
        btnBuscarJugador1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnBuscarJugador1.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnBuscarJugador1.setBorder(null);
        btnBuscarJugador1.setBorderPainted(false);
        btnBuscarJugador1.setContentAreaFilled(false);
        btnBuscarJugador1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.click.png"))); // NOI18N
        btnBuscarJugador1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.hover.png"))); // NOI18N
        btnBuscarJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarJugador1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnBuscarJugador1);

        btnTienda1.setBackground(new java.awt.Color(206, 206, 206));
        btnTienda1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTienda1.setForeground(new java.awt.Color(0, 0, 0));
        btnTienda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.png"))); // NOI18N
        btnTienda1.setBorder(null);
        btnTienda1.setBorderPainted(false);
        btnTienda1.setContentAreaFilled(false);
        btnTienda1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.click.png"))); // NOI18N
        btnTienda1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tienda.hover.png"))); // NOI18N
        btnTienda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienda1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnTienda1);

        btnLiga1.setBackground(new java.awt.Color(206, 206, 206));
        btnLiga1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnLiga1.setForeground(new java.awt.Color(0, 0, 0));
        btnLiga1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.png"))); // NOI18N
        btnLiga1.setBorder(null);
        btnLiga1.setBorderPainted(false);
        btnLiga1.setContentAreaFilled(false);
        btnLiga1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.click.png"))); // NOI18N
        btnLiga1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_90px.hover.png"))); // NOI18N
        btnLiga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiga1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnLiga1);

        btnExit1.setBackground(new java.awt.Color(206, 206, 206));
        btnExit1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(0, 0, 0));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit1.setBorder(null);
        btnExit1.setBorderPainted(false);
        btnExit1.setContentAreaFilled(false);
        btnExit1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.press.png"))); // NOI18N
        btnExit1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.hover.png"))); // NOI18N
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        layerMenu1.add(btnExit1);

        layerBG.add(layerMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 889, 105));

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

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 129));
        jLabel5.setText("Usuario:");

        lblNombreUsu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreUsu.setForeground(new java.awt.Color(129, 129, 129));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layerBG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerBG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnirseLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirseLigaActionPerformed
        if (!txtNombreUnirseLiga.getText().isEmpty()) {

            String NombreLiga = txtNombreUnirseLiga.getText();

            String sentenciaSelect = "SELECT NOMBRE, (SELECT USUARIO FROM TBL_USUARIO  WHERE ID_USUARIO=ADMINISTRADOR)FROM TBL_LIGA WHERE NOMBRE='" + NombreLiga + "';";

            OperacionesBBDD get = new OperacionesBBDD();
            ResultSet results = get.getSQL(sentenciaSelect);

            try {
                if (results.next()) {

                    Liga liga1 = new Liga(results.getString(1), results.getString(2));
                    if (liga1.getNombre().equalsIgnoreCase(NombreLiga) && results != null) {

                        btnInfoUnirse.setForeground(new java.awt.Color(0, 100, 0));
                        btnInfoUnirse.setVisible(true);
                        btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INSERT.png")));
                        btnInfoUnirse.setText("Te has unido con exito a la liga: " + NombreLiga);
                        Equipo e1 = new Equipo(liga1, null, Actual.getNombre() + "s team", 1000000, 0, 0, 0);
                        Actual.setEquipo(e1);
                        Actual.setLiga(liga1);
                        crearEquipo(liga1);

                    }

                } else {
                    btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
                    btnInfoUnirse.setVisible(true);
                    btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
                    btnInfoUnirse.setText("La liga no existe");

                }

            } catch (SQLException ex) {
                Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnUnirseLigaActionPerformed

    private void btnUnirseLigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUnirseLigaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUnirseLigaKeyReleased

    private void btnCrearLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLigaActionPerformed
        // TODO add your handling code here:

        String NombreLiga = txtNombreCrearLiga.getText();

        String sentenciaSelect = "  SELECT nombre\n"
                + "                    FROM  TBL_LIGA \n"
                + "                    WHERE NOMBRE='" + txtNombreCrearLiga.getText() + "';";

        OperacionesBBDD lectura = new OperacionesBBDD();
        ResultSet results = lectura.getSQL(sentenciaSelect);

        try {
            if (!results.next()) {

                String insertString = "INSERT INTO bbdd_fantasy.tbl_liga (NOMBRE, ADMINISTRADOR) VALUES ('" + NombreLiga + "', (select id_usuario from tbl_usuario where  usuario='" + Actual.getNombreUsuario() + "'));";

                OperacionesBBDD escritura = new OperacionesBBDD();
                if (escritura.escrituraSql(insertString)) {
                    btnInfoCrear.setForeground(new java.awt.Color(0, 100, 0));
                    btnInfoCrear.setVisible(true);
                    btnInfoCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/INSERT.png")));
                    btnInfoCrear.setText("Has creado con exito la liga: " + NombreLiga);
                    btnUnirseLiga.setEnabled(false);
                    btnCrearLiga.setEnabled(false);
                    Liga liga1 = new Liga(NombreLiga, Actual.getNombreUsuario());
                    Actual.setLiga(liga1);

                    crearEquipo(liga1);
                } else {
                    btnInfoCrear.setForeground(new java.awt.Color(100, 0, 0));
                    btnInfoCrear.setVisible(true);
                    btnInfoCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
                    btnInfoCrear.setText("Ha habido un problema intentelo dentro de un rato");
                }

            } else {
                btnInfoCrear.setForeground(new java.awt.Color(100, 0, 0));
                btnInfoCrear.setVisible(true);
                btnInfoCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error.png")));
                btnInfoCrear.setText("El nombre de la liga ya esta en uso");

            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCrearLigaActionPerformed

    private void crearEquipo(Liga liga1) {

        if (insertarBBDDEquipo()) {

            while (Actual.getPlantilla().size() != 11) {
                agentesLibres();
                Futbolista futbolistaRandom = null;
                if (Actual.getPlantilla().isEmpty()) {
                    futbolistaRandom = liga1.getJugadoresLibresPortero().get((int) (Math.random() * liga1.getJugadoresLibresPortero().size()));
                    Actual.setPlantillaPortero(futbolistaRandom);
                } else if (Actual.getPlantilla().size() >= 1 && Actual.getPlantilla().size() < 5) {

                    futbolistaRandom = liga1.getJugadoresLibresDefensa().get((int) (Math.random() * liga1.getJugadoresLibresDefensa().size()));
                    Actual.getPlantillaDefensas().add(futbolistaRandom);
                } else if (Actual.getPlantilla().size() >= 5 && Actual.getPlantilla().size() < 8) {
                    futbolistaRandom = liga1.getJugadoresLibresMedio().get((int) (Math.random() * liga1.getJugadoresLibresMedio().size()));
                    Actual.getPlantillaMedios().add(futbolistaRandom);

                } else if (Actual.getPlantilla().size() >= 8 && Actual.getPlantilla().size() < 11) {
                    futbolistaRandom = liga1.getJugadoresLibresDelantero().get((int) (Math.random() * liga1.getJugadoresLibresDelantero().size()));
                    Actual.getPlantillaDelanteros().add(futbolistaRandom);

                }

                if (futbolistaRandom != null) {
                    Actual.getPlantilla().add(futbolistaRandom);
                    Actual.getJugadores().add(futbolistaRandom);
                    liga1.getJugadoresLibres().remove(futbolistaRandom);
                    String sentenciaInsert = "INSERT  INTO TBL_JUGADOR_EQUIPO\n"
                            + "SELECT\n"
                            + " (SELECT ID_JUGADOR\n"
                            + "FROM TBL_JUGADORES\n"
                            + "WHERE NOMBRE='" + futbolistaRandom.getNombre() + "'),\n"
                            + "(SELECT ID_EQUIPO \n"
                            + "FROM TBL_EQUIPO\n"
                            + "WHERE ID_USUARIO=\n"
                            + "(SELECT ID_USUARIO\n"
                            + "FROM TBL_USUARIO\n"
                            + "WHERE USUARIO='" + Actual.getNombreUsuario() + "')"
                            + "),'SI';";
                    OperacionesBBDD escritura = new OperacionesBBDD();

                    if (escritura.escrituraSql(sentenciaInsert)) {

                        System.out.println(futbolistaRandom.getNombre());

                    }
                }

            };
        }

    }

    private boolean insertarBBDDEquipo() {
        boolean confirm = false;
        String sentenciaInsert = "INSERT INTO TBL_EQUIPO\n"
                + "(LIGA,NOMBRE_PLANTILLA,DINERO,PUNTOS,ID_USUARIO)\n"
                + "SELECT(SELECT ID_LIGA\n"
                + "FROM TBL_LIGA \n"
                + "WHERE NOMBRE='" + Actual.getLiga().getNombre() + "'),\n"
                + "'" + Actual.getNombre() + " team',100000000,0,\n"
                + "(SELECT ID_USUARIO\n"
                + "FROM TBL_USUARIO\n"
                + "WHERE USUARIO='" + Actual.getNombreUsuario() + "');";

        System.out.println(sentenciaInsert);
        OperacionesBBDD escritura = new OperacionesBBDD();

        if (escritura.escrituraSql(sentenciaInsert)) {

            confirm = true;
            Equipo e = new Equipo(Actual.getLiga(), null, Actual.getNombre() + " team", 100000000, 0, 0, 0);
            Actual.setEquipo(e);
        }

        return confirm;
    }

    private void agentesLibres() {
        Actual.getLiga().getJugadoresLibres().clear();
        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA\n"
                + "FROM TBL_JUGADORES AS J WHERE \n"
                + "J.ID_JUGADOR NOT IN\n"
                + "(SELECT ID_JUGADOR \n"
                + "FROM TBL_JUGADOR_EQUIPO\n"
                + "WHERE J.ID_JUGADOR=ID_JUGADOR AND \n"
                + "ID_EQUIPO IN (SELECT E.ID_EQUIPO\n"
                + "FROM TBL_EQUIPO AS E INNER JOIN TBL_LIGA AS L \n"
                + "ON E.LIGA=L.ID_LIGA\n"
                + "WHERE L.NOMBRE='" + Actual.getLiga().getNombre() + "')) \n"
                + ";";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);
        try {
            while (results.next()) {

                Futbolista f1 = new Futbolista(results.getString(1), results.getString(2), results.getInt(3), results.getInt(4), results.getInt(5));
                if (!Actual.getJugadores().contains(f1)) {
                    Actual.getLiga().getJugadoresLibres().add(f1);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }
        organizarJugadores();

    }

    private void organizarJugadores() {
        Actual.getLiga().getJugadoresLibresPortero().clear();
        Actual.getLiga().getJugadoresLibresDefensa().clear();
        Actual.getLiga().getJugadoresLibresMedio().clear();
        Actual.getLiga().getJugadoresLibresDelantero().clear();
        Iterator<Futbolista> it = Actual.getLiga().getJugadoresLibres().iterator();
        while (it.hasNext()) {
            Futbolista f1 = it.next();
            if (f1.getPosicion().equals("PORTERO")) {
                Actual.getLiga().getJugadoresLibresPortero().add(f1);
            } else if (f1.getPosicion().equals("DEFENSA")) {
                Actual.getLiga().getJugadoresLibresDefensa().add(f1);
            } else if (f1.getPosicion().equals("MEDIO")) {
                Actual.getLiga().getJugadoresLibresMedio().add(f1);
            } else if (f1.getPosicion().equals("DELANTERO")) {
                Actual.getLiga().getJugadoresLibresDelantero().add(f1);
            }

        }

    }

//    private void jugadoresJugandoLiga() {
//
//        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA\n"
//                + "                FROM TBL_JUGADORES AS J RIGHT JOIN tbl_jugador_equipo AS JE \n"
//                + "                ON JE.ID_JUGADOR=J.ID_JUGADOR INNER JOIN TBL_EQUIPO AS E\n"
//                + "                ON JE.ID_EQUIPO=E.ID_EQUIPO INNER JOIN TBL_USUARIO AS U\n"
//                + "               ON E.PRESIDENTE=U.ID_USUARIO\n"
//                + "                WHERE '" + Actual.getLiga().getNombre() + "'=(SELECT NOMBRE FROM TBL_LIGA WHERE ID_LIGA=U.LIGA_INSCRITO);";
//
//        OperacionesBBDD get = new OperacionesBBDD();
//        ResultSet results = get.getSQL(sentenciaSelect);
//
//        try {
//            while (results.next()) {
//                Futbolista f1 = new Futbolista(results.getString(2), results.getString(1), results.getInt(3), results.getInt(4), results.getInt(5));
//                Actual.getLiga().getJugadoresJugando().add(f1);
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }


    private void btnCrearLigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCrearLigaKeyReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_btnCrearLigaKeyReleased

    private void btnInfoUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUnirseActionPerformed
        // TODO add your handling code here:
        btnInfoUnirse.setVisible(false);
    }//GEN-LAST:event_btnInfoUnirseActionPerformed

    private void btnInfoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCrearActionPerformed
        // TODO add your handling code here:
        btnInfoCrear.setVisible(false);
    }//GEN-LAST:event_btnInfoCrearActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHomeKeyReleased

    }//GEN-LAST:event_btnHomeKeyReleased

    private void btnPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantillaActionPerformed

        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            PantallaPlantilla pantalla = new PantallaPlantilla(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnPlantillaActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        this.setVisible(false);
        pantallaPerfil pantalla = new pantallaPerfil(Actual, Actual);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificacionActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
            pantalla.setVisible(true);
        }

    }//GEN-LAST:event_btnClasificacionActionPerformed

    private void btnBuscarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJugadorActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaJugadores pantalla = new pantallaJugadores(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarJugadorActionPerformed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaTienda pantalla = new pantallaTienda(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void btnLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigaActionPerformed

        if (Actual.getLiga() == null || Actual.getLiga().getNombre() == null) {
            this.setVisible(false);
            PantallaLiga pantalla = new PantallaLiga(Actual);
            pantalla.setVisible(true);
        } else {
            this.setVisible(false);
            PantallaLigaAbandonar pantalla = new PantallaLigaAbandonar(Actual);
            pantalla.setVisible(true);
        }

    }//GEN-LAST:event_btnLigaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnHome1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHome1KeyReleased

    }//GEN-LAST:event_btnHome1KeyReleased

    private void btnPlantilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantilla1ActionPerformed

        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            PantallaPlantilla pantalla = new PantallaPlantilla(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnPlantilla1ActionPerformed

    private void btnPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfil1ActionPerformed
        this.setVisible(false);
        pantallaPerfil pantalla = new pantallaPerfil(Actual, Actual);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnPerfil1ActionPerformed

    private void btnClasificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificacion1ActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
            pantalla.setVisible(true);
        }

    }//GEN-LAST:event_btnClasificacion1ActionPerformed

    private void btnBuscarJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJugador1ActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaJugadores pantalla = new pantallaJugadores(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarJugador1ActionPerformed

    private void btnTienda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienda1ActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnInfoUnirse.setForeground(new java.awt.Color(100, 0, 0));
            btnInfoUnirse.setVisible(true);
            btnInfoUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnInfoUnirse.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaTienda pantalla = new pantallaTienda(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnTienda1ActionPerformed

    private void btnLiga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiga1ActionPerformed

        if (Actual.getLiga() == null || Actual.getLiga().getNombre() == null) {
            this.setVisible(false);
            PantallaLiga pantalla = new PantallaLiga(Actual);
            pantalla.setVisible(true);
        } else {
            this.setVisible(false);
            PantallaLigaAbandonar pantalla = new PantallaLigaAbandonar(Actual);
            pantalla.setVisible(true);
        }

    }//GEN-LAST:event_btnLiga1ActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnExit1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaLiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJugador1;
    private javax.swing.JButton btnClasificacion1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCrearLiga;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnInfoCrear;
    private javax.swing.JButton btnInfoUnirse;
    private javax.swing.JButton btnLiga1;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPerfil1;
    private javax.swing.JButton btnPlantilla1;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnTienda1;
    private javax.swing.JButton btnUnirseLiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLayeredPane layerBG;
    private javax.swing.JLayeredPane layerInfoCrearLiga;
    private javax.swing.JLayeredPane layerMenu1;
    private javax.swing.JLayeredPane layerUnirseLiga;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLayeredPane panelAcciones;
    private javax.swing.JTextField txtNombreCrearLiga;
    private javax.swing.JTextField txtNombreUnirseLiga;
    // End of variables declaration//GEN-END:variables
}
