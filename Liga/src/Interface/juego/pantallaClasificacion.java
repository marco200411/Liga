package Interface.juego;

import Interface.menus.Menu;
import Methods.Equipo;
import Methods.Usuario;
import OperacionesBBDD.ObtenerDatosBBDD;
import OperacionesBBDD.OperacionesBBDD;
import java.awt.geom.RoundRectangle2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * La clase pantallaClasificacion representa la pantalla de clasificación de la
 * aplicación. Muestra la clasificación de los usuarios en función de su
 * puntuación.
 *
 * author Marco
 */
public class pantallaClasificacion extends javax.swing.JFrame {

    Usuario Actual = null;
    int xMouse, yMouse;
    DecimalFormat df = new DecimalFormat("0.##M");

    /**
     * Crea una instancia de la clase pantallaClasificacion con el usuario
     * especificado.
     *
     * @param usuario El objeto Usuario que representa al usuario actualmente
     * conectado.
     */
    public pantallaClasificacion(Usuario usuario) {
        initComponents();
        Actual = usuario;
        lblNombreUsu.setText(Actual.getNombreUsuario());
        lbldinero.setText(df.format(Actual.getEquipo().getDinero() / 1000000.0));
        rellenarTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerBG = new javax.swing.JLayeredPane();
        jSeparator2 = new javax.swing.JSeparator();
        layerInfo = new javax.swing.JLayeredPane();
        btnError = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();
        lblDin = new javax.swing.JLabel();
        lbldinero = new javax.swing.JLabel();
        layerMenu1 = new javax.swing.JLayeredPane();
        btnHome1 = new javax.swing.JButton();
        btnPlantilla1 = new javax.swing.JButton();
        btnPerfil1 = new javax.swing.JButton();
        btnClasificacion1 = new javax.swing.JButton();
        btnBuscarJugador1 = new javax.swing.JButton();
        btnTienda1 = new javax.swing.JButton();
        btnLiga1 = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();

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
        layerInfo.add(btnError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 810, -1));

        tblUsuarios.setBackground(new java.awt.Color(92, 99, 112));
        tblUsuarios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(51, 61, 87));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Usuario", "Plantilla", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblUsuarios.setGridColor(new java.awt.Color(92, 99, 112));
        tblUsuarios.setSelectionBackground(new java.awt.Color(51, 61, 87));
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblUsuarios.setShowGrid(false);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsuariosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);
        tblUsuarios.getAccessibleContext().setAccessibleName("");

        layerInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 820, 370));

        layerBG.add(layerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 160, 850, 520));

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
                .addGap(0, 0, 0)
                .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblDin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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

        layerMenu1.setBackground(new java.awt.Color(51, 61, 87));
        layerMenu1.setForeground(new java.awt.Color(51, 61, 87));
        layerMenu1.setOpaque(true);
        layerMenu1.setLayout(new java.awt.GridLayout());

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

        getContentPane().add(layerBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rellenarTable() {

        String consulta = ("SELECT U.USUARIO, E.NOMBRE_PLANTILLA, E.PUNTOS\n"
                + "FROM TBL_EQUIPO AS E INNER JOIN TBL_USUARIO AS U\n"
                + "ON E.ID_USUARIO=U.ID_USUARIO\n"
                + "WHERE LIGA = ( SELECT  ID_LIGA FROM TBL_LIGA WHERE NOMBRE='" + Actual.getLiga().getNombre() + "')"
                + "order by e.puntos desc ;");

        OperacionesBBDD escritura = new OperacionesBBDD();
        ResultSet mysqlResult = escritura.getSQL(consulta);
        Equipo eq1 = null;
        try {
            while (mysqlResult.next()) {

                DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();
                model.addRow(new Object[]{1, mysqlResult.getString(1), mysqlResult.getString(2), mysqlResult.getInt(3)});

            }

        } catch (SQLException ex) {
            Logger.getLogger(ObtenerDatosBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
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


    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        // TODO add your handling code here:
        btnError.setVisible(false);
    }//GEN-LAST:event_btnErrorActionPerformed

    private void tblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMousePressed
        String s = (String) tblUsuarios.getModel().getValueAt(tblUsuarios.getSelectedRow(), 1);

        Iterator it = Actual.getLiga().getIntegrantes().iterator();
        while (it.hasNext()) {
            Usuario us = (Usuario) it.next();
            if (us.getNombreUsuario().equals(s)) {
                this.setVisible(false);
                pantallaPerfil pantalla = new pantallaPerfil(Actual, us);
                pantalla.setVisible(true);
            }
        }


    }//GEN-LAST:event_tblUsuariosMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int y = evt.getYOnScreen();
        int x = evt.getXOnScreen();
        setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel1MousePressed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHomeKeyReleased

    }//GEN-LAST:event_btnHomeKeyReleased

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

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        this.setVisible(false);
        pantallaPerfil pantalla = new pantallaPerfil(Actual, Actual);
        pantalla.setVisible(true);
    }//GEN-LAST:event_btnPerfilActionPerformed

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
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
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
            btnError.setForeground(new java.awt.Color(100, 0, 0));
            btnError.setVisible(true);
            btnError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errorLong.png")));
            btnError.setText("Para acceder a este apartado antes debes estar participando en una liga.");
        } else {
            this.setVisible(false);
            pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
            pantalla.setVisible(true);
        }

    }//GEN-LAST:event_btnClasificacion1ActionPerformed

    private void btnBuscarJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJugador1ActionPerformed
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
    }//GEN-LAST:event_btnBuscarJugador1ActionPerformed

    private void btnTienda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienda1ActionPerformed
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
            java.util.logging.Logger.getLogger(pantallaClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaClasificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJugador;
    private javax.swing.JButton btnBuscarJugador1;
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnClasificacion1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLiga;
    private javax.swing.JButton btnLiga1;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPerfil1;
    private javax.swing.JButton btnPlantilla;
    private javax.swing.JButton btnPlantilla1;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnTienda1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLayeredPane layerBG;
    private javax.swing.JLayeredPane layerInfo;
    private javax.swing.JLayeredPane layerMenu;
    private javax.swing.JLayeredPane layerMenu1;
    private javax.swing.JLabel lblDin;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lbldinero;
    private javax.swing.JLayeredPane panelAcciones;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
