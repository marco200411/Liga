package Interface.juego;

import Interface.menus.Menu;
import Methods.Usuario;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;

/**
 * La clase pantallaSesionIniciada representa la pantalla principal de sesión iniciada en la aplicación.
 * Muestra la información del usuario y su liga, así como otros detalles relacionados.
 *
 * author Marco
 */
public class pantallaSesionIniciada extends javax.swing.JFrame {

    Usuario Actual = null;
    int xMouse, yMouse;
    DecimalFormat df = new DecimalFormat("0.##M");

    /**
     * Crea una instancia de la clase pantallaSesionIniciada con el usuario
     * especificado.
     *
     * @param usuario El objeto Usuario que representa al usuario actualmente
     * conectado.
     */
    public pantallaSesionIniciada(Usuario usuario) {
        initComponents();
        Actual = usuario;
        lblNombreUsu.setText(Actual.getNombreUsuario());
        if (Actual.getLiga() == null) {
            lblDin.setVisible(false);
            lbldinero.setVisible(false);
            layerCabecera.setVisible(false);
            layerCabeceraSinLiga.setVisible(true);
            layerCabeceraSinIntegrantes.setVisible(false);

        } else {
            lblDin.setVisible(true);
            lbldinero.setVisible(true);
            lbldinero.setText(df.format(Actual.getEquipo().getDinero() / 1000000.0));
            Actual.getLiga().almacenarIntegrantesLiga();
            if (Actual.getLiga().getIntegrantes().size() > 1) {

                Actual.getLiga().almacenarPartidosLiga(Actual);

                Actual.getLiga().almacenarPartidosEquipo(Actual);
                Actual.getLiga().almacenarPartidosEquipoActual(Actual);

                actualizarCabezera();
                almacenarTodosJugadores();
                layerCabecera.setVisible(true);
                layerCabeceraSinLiga.setVisible(false);
                layerCabeceraSinIntegrantes.setVisible(false);
            } else {
                layerCabecera.setVisible(false);
                layerCabeceraSinLiga.setVisible(false);
                layerCabeceraSinIntegrantes.setVisible(true);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerBG = new javax.swing.JLayeredPane();
        layerMenu = new javax.swing.JLayeredPane();
        btnHome = new javax.swing.JButton();
        btnPlantilla = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnClasificacion = new javax.swing.JButton();
        btnBuscarJugador = new javax.swing.JButton();
        btnTienda = new javax.swing.JButton();
        btnLiga = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        layerCabeceraSinIntegrantes = new javax.swing.JLayeredPane();
        lblSinLiga1 = new javax.swing.JLabel();
        layerCabecera = new javax.swing.JLayeredPane();
        lblNombreLiga = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblProximoPartido = new javax.swing.JLabel();
        lblPPEquipoVisitante = new javax.swing.JLabel();
        lblPPVS = new javax.swing.JLabel();
        lblPPEquipoLocal = new javax.swing.JLabel();
        layerCabeceraSinLiga = new javax.swing.JLayeredPane();
        lblSinLiga = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        layerInfo = new javax.swing.JLayeredPane();
        btnError = new javax.swing.JButton();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();
        lblDin = new javax.swing.JLabel();
        lbldinero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 900,700, 50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layerBG.setBackground(new java.awt.Color(51, 61, 87));
        layerBG.setForeground(new java.awt.Color(51, 61, 87));
        layerBG.setOpaque(true);
        layerBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layerMenu.setBackground(new java.awt.Color(51, 61, 87));
        layerMenu.setForeground(new java.awt.Color(51, 61, 87));
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
        btnPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantillaActionPerformed(evt);
            }
        });
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
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
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
        btnClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClasificacionActionPerformed(evt);
            }
        });
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
        btnBuscarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarJugadorActionPerformed(evt);
            }
        });
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
        btnTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiendaActionPerformed(evt);
            }
        });
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
        btnLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigaActionPerformed(evt);
            }
        });
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

        layerBG.add(layerMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 889, 105));
        layerBG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 273, 850, 10));

        layerCabeceraSinIntegrantes.setBackground(new java.awt.Color(92, 99, 112));
        layerCabeceraSinIntegrantes.setForeground(new java.awt.Color(124, 124, 124));
        layerCabeceraSinIntegrantes.setOpaque(true);
        layerCabeceraSinIntegrantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSinLiga1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblSinLiga1.setForeground(new java.awt.Color(206, 206, 206));
        lblSinLiga1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSinLiga1.setText("Espera a que se unan mas integrantes para jugar");
        lblSinLiga1.setToolTipText("");
        layerCabeceraSinIntegrantes.add(lblSinLiga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 80));

        layerBG.add(layerCabeceraSinIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 161, 850, 100));

        layerCabecera.setBackground(new java.awt.Color(92, 99, 112));
        layerCabecera.setForeground(new java.awt.Color(124, 124, 124));
        layerCabecera.setOpaque(true);
        layerCabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreLiga.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblNombreLiga.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblNombreLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 30));

        lblPuntos.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 240, 30));

        lblProximoPartido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblProximoPartido.setForeground(new java.awt.Color(206, 206, 206));
        lblProximoPartido.setText("Proximo Partido:");
        layerCabecera.add(lblProximoPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 40));

        lblPPEquipoVisitante.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPPEquipoVisitante.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPPEquipoVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 280, 40));

        lblPPVS.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPPVS.setForeground(new java.awt.Color(206, 206, 206));
        lblPPVS.setText("VS");
        lblPPVS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        layerCabecera.add(lblPPVS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 30, 40));

        lblPPEquipoLocal.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPPEquipoLocal.setForeground(new java.awt.Color(206, 206, 206));
        layerCabecera.add(lblPPEquipoLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 260, 40));

        layerBG.add(layerCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 161, 850, 100));

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

        layerBG.add(layerCabeceraSinLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 161, 850, 100));
        layerBG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 147, 850, 10));

        layerInfo.setBackground(new java.awt.Color(92, 99, 112));
        layerInfo.setOpaque(true);
        layerInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnError.setBackground(new java.awt.Color(92, 99, 112));
        btnError.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnError.setForeground(new java.awt.Color(153, 0, 0));
        btnError.setBorder(null);
        btnError.setBorderPainted(false);
        btnError.setContentAreaFilled(false);
        btnError.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnError.setMaximumSize(new java.awt.Dimension(800, 100));
        btnError.setMinimumSize(new java.awt.Dimension(800, 100));
        btnError.setOpaque(true);
        btnError.setPreferredSize(new java.awt.Dimension(800, 100));
        btnError.setRequestFocusEnabled(false);
        btnError.setRolloverEnabled(false);
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });
        layerInfo.setLayer(btnError, javax.swing.JLayeredPane.POPUP_LAYER);
        layerInfo.add(btnError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        layerBG.add(layerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 280, 850, 400));

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
                .addContainerGap())
        );

        layerBG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 7, -1, 30));

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

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 129, 129));
        jLabel2.setText("Usuario:");

        lblNombreUsu.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreUsu.setForeground(new java.awt.Color(129, 129, 129));

        lblDin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDin.setForeground(new java.awt.Color(129, 129, 129));
        lblDin.setText("Dinero:");

        lbldinero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbldinero.setForeground(new java.awt.Color(129, 129, 129));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblDin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbldinero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldinero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layerBG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

        getContentPane().add(layerBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void almacenarTodosJugadores() {
        Actual.getLiga().agentesLibres(Actual);
        Actual.getLiga().jugadoresJugandoLiga();
    }


    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHomeKeyReleased

    }//GEN-LAST:event_btnHomeKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Menu pantalla = new Menu();
        pantalla.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnExitActionPerformed

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

    private void btnPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantillaActionPerformed

        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            PantallaPlantilla pantalla = new PantallaPlantilla(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnPlantillaActionPerformed

    /**
     * Actualiza la cabecera de la pantalla con la información actual del equipo
     * y la liga del usuario. Si el usuario tiene un equipo asociado o pertenece
     * a una liga con más de un integrante, se actualizan los elementos de la
     * cabecera con la información correspondiente.
     */
    public void actualizarCabezera() {
        if (Actual.getEquipo() != null || Actual.getLiga().getIntegrantes().size() > 1) {
            lblPuntos.setText("Puntos: " + Actual.getEquipo().getPuntos());
            lblNombreLiga.setText("Liga: " + Actual.getLiga().getNombre());
            lblPPEquipoLocal.setText(Actual.getEquipo().getPartidosEquipo().get(1).getUsuarioLocal().getEquipo().getNombre());
            lblPPEquipoVisitante.setText(Actual.getEquipo().getPartidosEquipo().get(1).getUsuarioVisitante().getEquipo().getNombre());
        }

    }

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        // TODO add your handling code here:

        btnError.setVisible(false);
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClasificacionActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
            pantalla.setVisible(true);
        }


    }//GEN-LAST:event_btnClasificacionActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        this.setVisible(false);
        pantallaPerfil pantalla = new pantallaPerfil(Actual, Actual);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnBuscarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJugadorActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaJugadores pantalla = new pantallaJugadores(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnBuscarJugadorActionPerformed

    private void btnTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiendaActionPerformed
        if (Actual.getEquipo() == null || Actual.getLiga() == null) {
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaTienda pantalla = new pantallaTienda(Actual);
            pantalla.setVisible(true);
        }
    }//GEN-LAST:event_btnTiendaActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();


    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int y = evt.getYOnScreen();
        int x = evt.getXOnScreen();
        setLocation(x - xMouse, y - yMouse);


    }//GEN-LAST:event_jPanel1MouseDragged

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

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJugador;
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLiga;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPlantilla;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnTienda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLayeredPane layerBG;
    private javax.swing.JLayeredPane layerCabecera;
    private javax.swing.JLayeredPane layerCabeceraSinIntegrantes;
    private javax.swing.JLayeredPane layerCabeceraSinLiga;
    private javax.swing.JLayeredPane layerInfo;
    private javax.swing.JLayeredPane layerMenu;
    private javax.swing.JLabel lblDin;
    private javax.swing.JLabel lblNombreLiga;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lblPPEquipoLocal;
    private javax.swing.JLabel lblPPEquipoVisitante;
    private javax.swing.JLabel lblPPVS;
    private javax.swing.JLabel lblProximoPartido;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblSinLiga;
    private javax.swing.JLabel lblSinLiga1;
    private javax.swing.JLabel lbldinero;
    private javax.swing.JLayeredPane panelAcciones;
    // End of variables declaration//GEN-END:variables

}
