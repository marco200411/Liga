package Interface.juego;

import Interface.menus.Menu;
import Methods.Entrenador;
import Methods.Equipo;
import Methods.Futbolista;
import Methods.Liga;
import Methods.Partido;
import java.util.ArrayList;
import Methods.Usuario;
import OperacionesBBDD.ObtenerDatosBBDD;
import OperacionesBBDD.OperacionesBBDD;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class pantallaSesionIniciada extends javax.swing.JFrame {

    Usuario Actual = null;

    public pantallaSesionIniciada(Usuario usuario) {
        initComponents();

        Actual = usuario;
        if (Actual.getLiga() == null) {
            layerCabecera.setVisible(false);
            layerCabeceraSinLiga.setVisible(true);

        } else {
            comprobarPartidos();

            almacenarIntegrantesLiga();

            System.out.println("aa");
            almacenarPartidosLiga();

            almacenarPartidosEquipo();
            almacenarPartidosEquipoActual();

            actualizarCabezera();
            almacenarTodosJugadores();
            layerCabecera.setVisible(true);
            layerCabeceraSinLiga.setVisible(false);

        }

    }

    public Usuario getUsuarioActual() {
        return Actual;

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

        getContentPane().add(layerBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void agentesLibres() {
        Actual.getLiga().getJugadoresLibres().clear();
        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA, J.IMAGEN\n"
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

                Futbolista f1 = new Futbolista(results.getString(1), results.getString(2), results.getInt(3), results.getInt(4), results.getInt(5), results.getString(6));
                if (!Actual.getJugadores().contains(f1)) {
                    Actual.getLiga().getJugadoresLibres().add(f1);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void jugadoresJugandoLiga() {

        String sentenciaSelect = "SELECT J.NOMBRE, J.POSICION, J.PRECIO, J.ATAQUE, J.DEFENSA\n"
                + "                FROM TBL_JUGADORES AS J RIGHT JOIN tbl_jugador_equipo AS JE \n"
                + "                ON JE.ID_JUGADOR=J.ID_JUGADOR INNER JOIN TBL_EQUIPO AS E\n"
                + "                ON JE.ID_EQUIPO=E.ID_EQUIPO INNER JOIN TBL_USUARIO AS U\n"
                + "               ON E.ID_USUARIO=U.ID_USUARIO\n"
                + "               where E.LIGA=(SELECT ID_LIGA FROM TBL_LIGA WHERE NOMBRE = '" + Actual.getLiga().getNombre() + "');";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);

        try {
            while (results.next()) {
                Futbolista f1 = new Futbolista(results.getString(2), results.getString(1), results.getInt(3), results.getInt(4), results.getInt(5), null);
                Actual.getLiga().getJugadoresJugando().add(f1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void almacenarTodosJugadores() {
        agentesLibres();
        jugadoresJugandoLiga();

    }

    public void almacenarPartidosEquipo() {

        Iterator it = Actual.getLiga().getPartidos().iterator();
        while (it.hasNext()) {
            Partido partido = (Partido) it.next();

            for (Usuario integrante : Actual.getLiga().getIntegrantes()) {

                if (!integrante.equals(Actual) && partido.getUsuarioLocal().getNombreUsuario().equalsIgnoreCase(integrante.getNombreUsuario()) || partido.getUsuarioVisitante().getNombreUsuario().equalsIgnoreCase(integrante.getNombreUsuario())) {
                    integrante.getEquipo().getPartidosEquipo().add(partido);
                }
            }
        }

    }

    private void almacenarPartidosEquipoActual() {
        Iterator it = Actual.getLiga().getPartidos().iterator();
        while (it.hasNext()) {
            Partido partido = (Partido) it.next();
            if (partido.getUsuarioLocal().getNombreUsuario().equalsIgnoreCase(Actual.getNombreUsuario()) || partido.getUsuarioVisitante().getNombreUsuario().equalsIgnoreCase(Actual.getNombreUsuario())) {
                Actual.getEquipo().getPartidosEquipo().add(partido);
            }
        }
    }

//    public void almacenarJugadoresJugando() {
//
//        Iterator it = Actual.getLiga().getIntegrantes().iterator();
//        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();
//        while (it.hasNext()) {
//            Usuario us = (Usuario) it.next();
//           
//
//        }
//
//    }
    public void almacenarPartidosLiga() {
        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();
        getDatos.getPartidosBBDD(Actual.getLiga());

    }

    public void almacenarIntegrantesLiga() {

        ObtenerDatosBBDD getDatos = new ObtenerDatosBBDD();
        String sentenciaSelect = " SELECT U.USUARIO \n"
                + "                    FROM TBL_USUARIO AS U INNER JOIN TBL_EQUIPO AS E\n"
                + "                    ON U.ID_USUARIO=E.ID_USUARIO INNER JOIN TBL_LIGA AS L\n"
                + "                    ON L.ID_LIGA=E.LIGA\n"
                + "                    WHERE L.NOMBRE='" + Actual.getLiga().getNombre() + "';";

        OperacionesBBDD get = new OperacionesBBDD();
        ResultSet results = get.getSQL(sentenciaSelect);
        System.out.println("aasasa" + sentenciaSelect);
        try {
            while (results.next()) {
                String nombreUsuario = results.getString(1);

                Entrenador entrenador = getDatos.getEntrenadorBBDD(nombreUsuario);
                Equipo equipo = getDatos.getEquipoBBDD(nombreUsuario, entrenador);

                Usuario usuario = getDatos.getUsuarioBBDD(nombreUsuario);

                Liga liga = getDatos.getLigaBBDD(usuario.getNombre());
                usuario.setLiga(liga);
                usuario.setEquipo(equipo);
                System.out.println("sdawdasd" + usuario.getNombreUsuario());
                Actual.getLiga().getIntegrantes().add(usuario);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PantallaLiga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);

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

    private void btnLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigaActionPerformed
        // TODO add your handling code here:s

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
        // TODO add your handling code here:

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
    private void comprobarPartidos() {

    }

    public void actualizarCabezera() {
        if (Actual.getEquipo() != null || Actual.getLiga().getIntegrantes().size() > 1) {
            lblPuntos.setText("Puntos: " + Actual.getEquipo().getPuntos());
            lblNombreLiga.setText("Liga: " + Actual.getLiga().getNombre());
            lblPPEquipoLocal.setText(Actual.getEquipo().getPartidosEquipo().get(1).getUsuarioLocal().getEquipo().getNombre());
            lblPPEquipoVisitante.setText(Actual.getEquipo().getPartidosEquipo().get(1).getUsuarioVisitante().getEquipo().getNombre());

//            Iterator it2 = partidosEquipo.iterator();
//            while (it2.hasNext()) {
//                Partido partido = (Partido) it2.next();
//                
//                
//            }
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
        this.setVisible(false);
        pantallaJugadores pantalla = new pantallaJugadores(Actual);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnBuscarJugadorActionPerformed

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
    private javax.swing.JLabel lblPPVS;
    private javax.swing.JLabel lblProximoPartido;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblSinLiga;
    private javax.swing.JLayeredPane panelAcciones;
    // End of variables declaration//GEN-END:variables

}
