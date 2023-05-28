package Interface.juego;

import Interface.menus.Menu;
import Methods.Futbolista;
import Methods.Partido;
import Methods.Usuario;
import OperacionesBBDD.ObtenerDatosBBDD;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * La clase pantallaPerfil representa la pantalla de perfil de usuario en la aplicación.
 * Muestra la información del usuario y su equipo, así como otros detalles relacionados.
 *
 * author Marco
 */
public class pantallaPerfil extends javax.swing.JFrame {

    int xMouse, yMouse;
    DecimalFormat df = new DecimalFormat("0.##M");

    Futbolista futbolistaSeleccionado = null;
    Usuario Actual = null;
    Usuario UsuarioPerfil = null;

    /**
     * Crea una instancia de la clase pantallaPerfil con los usuarios actual y de búsqueda especificados.
     *
     * @param Actual2          El objeto Usuario que representa al usuario actualmente conectado.
     * @param usuarioBusqueda  El objeto Usuario que representa al usuario cuyo perfil se está visualizando.
     */
    public pantallaPerfil(Usuario Actual2, Usuario usuarioBusqueda) {
        initComponents();

        Actual = Actual2;
        UsuarioPerfil = usuarioBusqueda;

        lblNombreUsu.setText(Actual.getNombreUsuario());
        if(Actual.getLiga() == null){
            lbldinero.setVisible(false);
            lblDin.setVisible(false);
        }else{
            lbldinero.setText(df.format(Actual.getEquipo().getDinero() / 1000000.0));
        }
        
        lblNombreUsuario.setText(UsuarioPerfil.getNombreUsuario());
        if (UsuarioPerfil.getLiga() != null) {
            ObtenerDatosBBDD get = new ObtenerDatosBBDD();
            get.getJugadoresPlantilla(UsuarioPerfil);

            rellenarTablaPartidos();

            lblNombre.setVisible(true);
            lblbEquipo.setVisible(true);
            lblLiga.setVisible(true);
            lblPuntost.setVisible(true);
            lblLigat.setVisible(true);
            lblLiga.setText(UsuarioPerfil.getLiga().getNombre());
            lblPuntos.setText("" + UsuarioPerfil.getEquipo().getPuntos());
            lblNombre.setText(UsuarioPerfil.getNombre());
            lblApellidos.setText("" + UsuarioPerfil.getApellidos());
            lblVicorias.setText("" + UsuarioPerfil.getEquipo().getVictorias());
            lblDerrotas1.setText("" + UsuarioPerfil.getEquipo().getDerrotas());
            lblNombreEquipo.setText(UsuarioPerfil.getEquipo().getNombre());

            actualizarPlantillaFirstTime();

        } else {
            lblbEquipo.setVisible(false);
            lblPuntos.setVisible(false);
            lblLiga.setVisible(false);
            lblPuntost.setVisible(false);
            lblLigat.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelAcciones1 = new javax.swing.JLayeredPane();
        btnRetroceder1 = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        pnlImg12 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblEI1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblValorJugador = new javax.swing.JLabel();
        lblSaldoDisponible = new javax.swing.JLabel();
        btnCompar1 = new javax.swing.JButton();
        BG = new javax.swing.JLayeredPane();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        panelCabecera = new javax.swing.JLayeredPane();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombreEquipo = new javax.swing.JLabel();
        lblbEquipo = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblNombret = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        lblPuntost = new javax.swing.JLabel();
        lblLigat = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblLiga = new javax.swing.JLabel();
        lblVicoriast = new javax.swing.JLabel();
        lblVicorias = new javax.swing.JLabel();
        lblDerrotas1 = new javax.swing.JLabel();
        lblDerrotas = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        layerUnirseLiga = new javax.swing.JLayeredPane(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src/images/campo.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);

            }
        };
        pnlImg1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblGK = new javax.swing.JLabel();
        pnlImg2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblLD = new javax.swing.JLabel();
        pnlImg3 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblDFCD = new javax.swing.JLabel();
        pnlImg4 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblDFCI = new javax.swing.JLabel();
        pnlImg5 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblLI = new javax.swing.JLabel();
        pnlImg6 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblMCD = new javax.swing.JLabel();
        pnlImg7 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblMC = new javax.swing.JLabel();
        pnlImg8 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblMCI = new javax.swing.JLabel();
        pnlImg9 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblED = new javax.swing.JLabel();
        pnlImg10 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblDC = new javax.swing.JLabel();
        pnlImg11 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblEI = new javax.swing.JLabel();
        btnError = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
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

        jDialog1.setUndecorated(true);
        jDialog1.setShape(new RoundRectangle2D.Double(0, 0, 900,700, 50, 50));

        jLayeredPane1.setBackground(new java.awt.Color(51, 61, 87));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLayeredPane1ComponentShown(evt);
            }
        });
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAcciones1.setMaximumSize(new java.awt.Dimension(95, 25));
        panelAcciones1.setMinimumSize(new java.awt.Dimension(95, 25));

        btnRetroceder1.setBackground(new java.awt.Color(51, 61, 87));
        btnRetroceder1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRetroceder1.setForeground(new java.awt.Color(153, 0, 0));
        btnRetroceder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retroceder.png"))); // NOI18N
        btnRetroceder1.setBorder(null);
        btnRetroceder1.setBorderPainted(false);
        btnRetroceder1.setContentAreaFilled(false);
        btnRetroceder1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRetroceder1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRetroceder1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetroceder1.setOpaque(true);
        btnRetroceder1.setRequestFocusEnabled(false);
        btnRetroceder1.setRolloverEnabled(false);
        btnRetroceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetroceder1ActionPerformed(evt);
            }
        });

        btnMinimizar1.setBackground(new java.awt.Color(51, 61, 87));
        btnMinimizar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMinimizar1.setForeground(new java.awt.Color(153, 0, 0));
        btnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar (1).png"))); // NOI18N
        btnMinimizar1.setBorder(null);
        btnMinimizar1.setBorderPainted(false);
        btnMinimizar1.setContentAreaFilled(false);
        btnMinimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnMinimizar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar1.setOpaque(true);
        btnMinimizar1.setRequestFocusEnabled(false);
        btnMinimizar1.setRolloverEnabled(false);
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });

        btnClose1.setBackground(new java.awt.Color(51, 61, 87));
        btnClose1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(153, 0, 0));
        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close (1).png"))); // NOI18N
        btnClose1.setBorder(null);
        btnClose1.setBorderPainted(false);
        btnClose1.setContentAreaFilled(false);
        btnClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnClose1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose1.setOpaque(true);
        btnClose1.setRequestFocusEnabled(false);
        btnClose1.setRolloverEnabled(false);
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        panelAcciones1.setLayer(btnRetroceder1, javax.swing.JLayeredPane.POPUP_LAYER);
        panelAcciones1.setLayer(btnMinimizar1, javax.swing.JLayeredPane.POPUP_LAYER);
        panelAcciones1.setLayer(btnClose1, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout panelAcciones1Layout = new javax.swing.GroupLayout(panelAcciones1);
        panelAcciones1.setLayout(panelAcciones1Layout);
        panelAcciones1Layout.setHorizontalGroup(
            panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRetroceder1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMinimizar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose1))
        );
        panelAcciones1Layout.setVerticalGroup(
            panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcciones1Layout.createSequentialGroup()
                .addGroup(panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetroceder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLayeredPane1.add(panelAcciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 30));

        pnlImg12.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg12.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg12.setOpaque(false);

        javax.swing.GroupLayout pnlImg12Layout = new javax.swing.GroupLayout(pnlImg12);
        pnlImg12.setLayout(pnlImg12Layout);
        pnlImg12Layout.setHorizontalGroup(
            pnlImg12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnlImg12Layout.setVerticalGroup(
            pnlImg12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jLayeredPane1.add(pnlImg12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblEI1.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblEI1.setForeground(new java.awt.Color(60, 63, 65));
        lblEI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblEI1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEI1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEI1.setMaximumSize(new java.awt.Dimension(75, 75));
        lblEI1.setMinimumSize(new java.awt.Dimension(75, 75));
        lblEI1.setName(""); // NOI18N
        lblEI1.setPreferredSize(new java.awt.Dimension(75, 75));
        lblEI1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblEI1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEI1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEI1MousePressed(evt);
            }
        });
        lblEI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblEI1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblEI1KeyReleased(evt);
            }
        });
        jLayeredPane1.add(lblEI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 90));

        jLabel2.setText("Estas seguro que quieres comprar a este jugador?");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 86, 280, 70));

        btnNo.setText("No");
        jLayeredPane1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 120, 90));

        jLabel3.setText("Saldo disponible:");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 40));

        jLabel4.setText("Valor del jugador:");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 40));
        jLayeredPane1.add(lblValorJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 40));
        jLayeredPane1.add(lblSaldoDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, 40));

        btnCompar1.setText("Comprar");
        jLayeredPane1.add(btnCompar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 90));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 800));
        setMinimumSize(new java.awt.Dimension(900, 800));
        setUndecorated(true);
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 900,800, 50, 50));

        BG.setBackground(new java.awt.Color(51, 61, 87));
        BG.setMaximumSize(new java.awt.Dimension(900, 700));
        BG.setMinimumSize(new java.awt.Dimension(900, 700));
        BG.setOpaque(true);
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 30));

        panelCabecera.setBackground(new java.awt.Color(92, 99, 112));
        panelCabecera.setOpaque(true);
        panelCabecera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 20));

        jSeparator2.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 490, 10));

        lblNombreEquipo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombreEquipo.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 90, 427, 40));

        lblbEquipo.setForeground(new java.awt.Color(51, 51, 51));
        lblbEquipo.setText("Equipo:");
        panelCabecera.add(lblbEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 90, 50, 40));

        lblNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 492, 72));

        lblNombret.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombret.setForeground(new java.awt.Color(51, 51, 51));
        lblNombret.setText("Nombre:");
        panelCabecera.add(lblNombret, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 50, 20));

        lblApe.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblApe.setForeground(new java.awt.Color(51, 51, 51));
        lblApe.setText("Apellidos:");
        panelCabecera.add(lblApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 3, 60, 30));

        lblPuntost.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblPuntost.setForeground(new java.awt.Color(51, 51, 51));
        lblPuntost.setText("Puntos: ");
        panelCabecera.add(lblPuntost, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 50, 27));

        lblLigat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblLigat.setForeground(new java.awt.Color(51, 51, 51));
        lblLigat.setText("Liga: ");
        panelCabecera.add(lblLigat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, 40));

        lblPuntos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 110, 20));

        lblNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 6, 110, 30));

        lblApellidos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 6, 110, 30));

        lblLiga.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblLiga.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 45, 120, 30));

        lblVicoriast.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblVicoriast.setForeground(new java.awt.Color(51, 51, 51));
        lblVicoriast.setText("Victorias:");
        panelCabecera.add(lblVicoriast, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 68, 20));

        lblVicorias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblVicorias.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblVicorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 102, 100, 20));

        lblDerrotas1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDerrotas1.setForeground(new java.awt.Color(51, 51, 51));
        panelCabecera.add(lblDerrotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 102, 110, 20));

        lblDerrotas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDerrotas.setForeground(new java.awt.Color(51, 51, 51));
        lblDerrotas.setText("Derrotas:");
        panelCabecera.add(lblDerrotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 102, 56, 20));

        jSeparator3.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 160, 10));

        jSeparator4.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 170, 10));

        jSeparator5.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 160, 10));

        jSeparator6.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 170, 10));

        jSeparator7.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, 10));

        jSeparator8.setForeground(new java.awt.Color(129, 129, 129));
        panelCabecera.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 180, 20));

        BG.add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 880, 130));

        layerUnirseLiga.setBackground(new java.awt.Color(51, 61, 87));
        layerUnirseLiga.setMaximumSize(new java.awt.Dimension(500, 480));
        layerUnirseLiga.setMinimumSize(new java.awt.Dimension(500, 480));
        layerUnirseLiga.setOpaque(true);
        layerUnirseLiga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImg1.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg1.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg1.setOpaque(false);

        lblGK.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblGK.setForeground(new java.awt.Color(60, 63, 65));
        lblGK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblGK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGK.setDisabledIcon(null);
        lblGK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblGK.setMaximumSize(new java.awt.Dimension(75, 75));
        lblGK.setMinimumSize(new java.awt.Dimension(75, 75));
        lblGK.setName(""); // NOI18N
        lblGK.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblGK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblGKMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg1Layout = new javax.swing.GroupLayout(pnlImg1);
        pnlImg1.setLayout(pnlImg1Layout);
        pnlImg1Layout.setHorizontalGroup(
            pnlImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGK, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg1Layout.setVerticalGroup(
            pnlImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGK, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        pnlImg2.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg2.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg2.setOpaque(false);

        lblLD.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblLD.setForeground(new java.awt.Color(60, 63, 65));
        lblLD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblLD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLD.setDisabledIcon(null);
        lblLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLD.setMaximumSize(new java.awt.Dimension(75, 75));
        lblLD.setMinimumSize(new java.awt.Dimension(75, 75));
        lblLD.setName(""); // NOI18N
        lblLD.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg2Layout = new javax.swing.GroupLayout(pnlImg2);
        pnlImg2.setLayout(pnlImg2Layout);
        pnlImg2Layout.setHorizontalGroup(
            pnlImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg2Layout.setVerticalGroup(
            pnlImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        pnlImg3.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg3.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg3.setOpaque(false);

        lblDFCD.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblDFCD.setForeground(new java.awt.Color(60, 63, 65));
        lblDFCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDFCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblDFCD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDFCD.setDisabledIcon(null);
        lblDFCD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDFCD.setMaximumSize(new java.awt.Dimension(75, 75));
        lblDFCD.setMinimumSize(new java.awt.Dimension(75, 75));
        lblDFCD.setName(""); // NOI18N
        lblDFCD.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblDFCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDFCDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg3Layout = new javax.swing.GroupLayout(pnlImg3);
        pnlImg3.setLayout(pnlImg3Layout);
        pnlImg3Layout.setHorizontalGroup(
            pnlImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDFCD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg3Layout.setVerticalGroup(
            pnlImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDFCD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        pnlImg4.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg4.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg4.setOpaque(false);

        lblDFCI.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblDFCI.setForeground(new java.awt.Color(60, 63, 65));
        lblDFCI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDFCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblDFCI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDFCI.setDisabledIcon(null);
        lblDFCI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDFCI.setMaximumSize(new java.awt.Dimension(75, 75));
        lblDFCI.setMinimumSize(new java.awt.Dimension(75, 75));
        lblDFCI.setName(""); // NOI18N
        lblDFCI.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblDFCI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDFCIMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg4Layout = new javax.swing.GroupLayout(pnlImg4);
        pnlImg4.setLayout(pnlImg4Layout);
        pnlImg4Layout.setHorizontalGroup(
            pnlImg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDFCI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg4Layout.setVerticalGroup(
            pnlImg4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDFCI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        pnlImg5.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg5.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg5.setOpaque(false);

        lblLI.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblLI.setForeground(new java.awt.Color(60, 63, 65));
        lblLI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblLI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLI.setDisabledIcon(null);
        lblLI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLI.setMaximumSize(new java.awt.Dimension(75, 75));
        lblLI.setMinimumSize(new java.awt.Dimension(75, 75));
        lblLI.setName(""); // NOI18N
        lblLI.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblLI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLIMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg5Layout = new javax.swing.GroupLayout(pnlImg5);
        pnlImg5.setLayout(pnlImg5Layout);
        pnlImg5Layout.setHorizontalGroup(
            pnlImg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg5Layout.setVerticalGroup(
            pnlImg5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        pnlImg6.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg6.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg6.setOpaque(false);

        lblMCD.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblMCD.setForeground(new java.awt.Color(60, 63, 65));
        lblMCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblMCD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMCD.setDisabledIcon(null);
        lblMCD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMCD.setMaximumSize(new java.awt.Dimension(75, 75));
        lblMCD.setMinimumSize(new java.awt.Dimension(75, 75));
        lblMCD.setName(""); // NOI18N
        lblMCD.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblMCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMCDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg6Layout = new javax.swing.GroupLayout(pnlImg6);
        pnlImg6.setLayout(pnlImg6Layout);
        pnlImg6Layout.setHorizontalGroup(
            pnlImg6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMCD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg6Layout.setVerticalGroup(
            pnlImg6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMCD, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        pnlImg7.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg7.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg7.setOpaque(false);

        lblMC.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblMC.setForeground(new java.awt.Color(60, 63, 65));
        lblMC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblMC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMC.setDisabledIcon(null);
        lblMC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMC.setMaximumSize(new java.awt.Dimension(75, 75));
        lblMC.setMinimumSize(new java.awt.Dimension(75, 75));
        lblMC.setName(""); // NOI18N
        lblMC.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg7Layout = new javax.swing.GroupLayout(pnlImg7);
        pnlImg7.setLayout(pnlImg7Layout);
        pnlImg7Layout.setHorizontalGroup(
            pnlImg7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg7Layout.setVerticalGroup(
            pnlImg7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        pnlImg8.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg8.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg8.setOpaque(false);

        lblMCI.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblMCI.setForeground(new java.awt.Color(60, 63, 65));
        lblMCI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblMCI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMCI.setDisabledIcon(null);
        lblMCI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMCI.setMaximumSize(new java.awt.Dimension(75, 75));
        lblMCI.setMinimumSize(new java.awt.Dimension(75, 75));
        lblMCI.setName(""); // NOI18N
        lblMCI.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblMCI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMCIMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg8Layout = new javax.swing.GroupLayout(pnlImg8);
        pnlImg8.setLayout(pnlImg8Layout);
        pnlImg8Layout.setHorizontalGroup(
            pnlImg8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMCI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg8Layout.setVerticalGroup(
            pnlImg8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMCI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        pnlImg9.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg9.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg9.setOpaque(false);

        lblED.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblED.setForeground(new java.awt.Color(60, 63, 65));
        lblED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblED.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblED.setDisabledIcon(null);
        lblED.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblED.setMaximumSize(new java.awt.Dimension(75, 75));
        lblED.setMinimumSize(new java.awt.Dimension(75, 75));
        lblED.setName(""); // NOI18N
        lblED.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblED.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblEDAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblED.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg9Layout = new javax.swing.GroupLayout(pnlImg9);
        pnlImg9.setLayout(pnlImg9Layout);
        pnlImg9Layout.setHorizontalGroup(
            pnlImg9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblED, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg9Layout.setVerticalGroup(
            pnlImg9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblED, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        pnlImg10.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg10.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg10.setOpaque(false);

        lblDC.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblDC.setForeground(new java.awt.Color(60, 63, 65));
        lblDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblDC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDC.setDisabledIcon(null);
        lblDC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblDC.setMaximumSize(new java.awt.Dimension(75, 75));
        lblDC.setMinimumSize(new java.awt.Dimension(75, 75));
        lblDC.setName(""); // NOI18N
        lblDC.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDCMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImg10Layout = new javax.swing.GroupLayout(pnlImg10);
        pnlImg10.setLayout(pnlImg10Layout);
        pnlImg10Layout.setHorizontalGroup(
            pnlImg10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg10Layout.setVerticalGroup(
            pnlImg10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDC, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pnlImg11.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg11.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg11.setOpaque(false);

        lblEI.setFont(new java.awt.Font("Roboto", 0, 1)); // NOI18N
        lblEI.setForeground(new java.awt.Color(60, 63, 65));
        lblEI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblEI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEI.setMaximumSize(new java.awt.Dimension(75, 75));
        lblEI.setMinimumSize(new java.awt.Dimension(75, 75));
        lblEI.setName(""); // NOI18N
        lblEI.setPreferredSize(new java.awt.Dimension(75, 75));
        lblEI.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lblEI.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblEIAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblEI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEIMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEIMousePressed(evt);
            }
        });
        lblEI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblEIKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblEIKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlImg11Layout = new javax.swing.GroupLayout(pnlImg11);
        pnlImg11.setLayout(pnlImg11Layout);
        pnlImg11Layout.setHorizontalGroup(
            pnlImg11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImg11Layout.setVerticalGroup(
            pnlImg11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEI, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        layerUnirseLiga.add(pnlImg11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

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
        btnError.setPreferredSize(new java.awt.Dimension(800, 100));
        btnError.setRequestFocusEnabled(false);
        btnError.setRolloverEnabled(false);
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });
        layerUnirseLiga.setLayer(btnError, javax.swing.JLayeredPane.POPUP_LAYER);
        layerUnirseLiga.add(btnError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        BG.add(layerUnirseLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 500, 480));

        tblPartidos.setBackground(new java.awt.Color(92, 99, 112));
        tblPartidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblPartidos.setForeground(new java.awt.Color(51, 61, 87));
        tblPartidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Local", "Visitante", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPartidos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblPartidos.setGridColor(new java.awt.Color(92, 99, 112));
        tblPartidos.setSelectionBackground(new java.awt.Color(51, 61, 87));
        tblPartidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPartidos.setShowGrid(false);
        tblPartidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPartidosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPartidos);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 360, 420));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 129, 129));
        jLabel1.setText("Partidos de liga:");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 350, 30));

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
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldinero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 30));

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

        BG.add(layerMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 900, 105));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        pantallaSesionIniciada pantalla = new pantallaSesionIniciada(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void rellenarTablaPartidos() {

        Iterator it = UsuarioPerfil.getEquipo().getPartidosEquipo().iterator();
        DefaultTableModel model = (DefaultTableModel) tblPartidos.getModel();
        while (it.hasNext()) {
            Partido partido = (Partido) it.next();
            if (partido.getUsuarioLocal().getNombreUsuario().equalsIgnoreCase(UsuarioPerfil.getNombreUsuario()) || partido.getUsuarioVisitante().getNombreUsuario().equalsIgnoreCase(UsuarioPerfil.getNombreUsuario())) {
                if (partido.getPuntosLocal() == 0 && partido.getPuntosVisitante() == 0) {
                    model.addRow(new Object[]{partido.getUsuarioLocal().getEquipo().getNombre(), partido.getUsuarioVisitante().getEquipo().getNombre(), partido.getFechaPartido()});

                } else {
                    model.addRow(new Object[]{partido.getUsuarioLocal().getEquipo().getNombre(), partido.getUsuarioVisitante().getEquipo().getNombre(), partido.getPuntosLocal() + "-" + partido.getPuntosVisitante()});

                }
            }

        }

    }

    private void actualizarPlantillaFirstTime() {

        Iterator<Futbolista> it1 = UsuarioPerfil.getPlantilla().iterator();
        while (it1.hasNext()) {
            Futbolista futbol = it1.next();
            if (futbol != null) {
                if (futbol.getPosicion().equalsIgnoreCase("PORTERO")) {
                    Actual.setPlantillaPortero(futbol);
                    lblGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));
                    lblGK.setText("" + futbol.getNombre());

                } else if (futbol.getPosicion().equalsIgnoreCase("DEFENSA")) {
                    Actual.getPlantillaDefensas().add(futbol);

                    if (lblLD.getText().isBlank()) {
                        lblLD.setText("" + futbol.getNombre());
                        lblLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));
                    } else if (lblDFCD.getText().isBlank()) {
                        lblDFCD.setText("" + futbol.getNombre());
                        lblDFCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblDFCI.getText().isBlank()) {
                        lblDFCI.setText("" + futbol.getNombre());
                        lblDFCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblLI.getText().isBlank()) {
                        lblLI.setText("" + futbol.getNombre());
                        lblLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    }

                } else if (futbol.getPosicion().equalsIgnoreCase("MEDIO")) {

                    Actual.getPlantillaMedios().add(futbol);

                    if (lblMCD.getText().isBlank()) {
                        lblMCD.setText("" + futbol.getNombre());
                        lblMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblMC.getText().isBlank()) {
                        lblMC.setText("" + futbol.getNombre());
                        lblMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblMCI.getText().isBlank()) {
                        lblMCI.setText("" + futbol.getNombre());
                        lblMCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    }
                } else if (futbol.getPosicion().equalsIgnoreCase("DELANTERO")) {
                    Actual.getPlantillaDelanteros().add(futbol);
                    if (lblED.getText().isBlank()) {
                        lblED.setText("" + futbol.getNombre());
                        lblED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblDC.getText().isBlank()) {
                        lblDC.setText("" + futbol.getNombre());
                        lblDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    } else if (lblEI.getText().isBlank()) {
                        lblEI.setText("" + futbol.getNombre());
                        lblEI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + futbol.getNombre() + ".png")));

                    }
                }
            }

        }
    }
    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private Futbolista buscarJugador(Usuario us, String nombre) {
        Futbolista futRet = null;
        Iterator it = us.getJugadores().iterator();
        while (it.hasNext()) {
            Futbolista futbolista = (Futbolista) it.next();
            if (futbolista.getNombre() == nombre) {
                futRet = futbolista;
            }

        }
        return futRet;

    }


    private void lblGKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGKMousePressed
        String jugador = lblGK.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblGKMousePressed

    private void lblLDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLDMousePressed
        String jugador = lblLD.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblLDMousePressed

    private void lblDFCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDFCDMousePressed
        String jugador = lblDFCD.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblDFCDMousePressed

    private void lblDFCIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDFCIMousePressed
        String jugador = lblDFCI.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblDFCIMousePressed

    private void lblLIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLIMousePressed
        String jugador = lblLI.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblLIMousePressed

    private void lblMCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCDMousePressed
        String jugador = lblMCD.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
        }
    }//GEN-LAST:event_lblMCDMousePressed

    private void lblMCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCMousePressed
        String jugador = lblMC.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_lblMCMousePressed

    private void lblMCIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCIMousePressed
        String jugador = lblMCI.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_lblMCIMousePressed

    private void lblEDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblEDAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEDAncestorAdded

    private void lblEDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEDMousePressed
        String jugador = lblED.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_lblEDMousePressed

    private void lblDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDCMouseEntered

    }//GEN-LAST:event_lblDCMouseEntered

    private void lblDCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDCMousePressed
        String jugador = lblDC.getText();
        if (jugador != "") {
            futbolistaSeleccionado = buscarJugador(UsuarioPerfil, jugador);
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_lblDCMousePressed

    private void lblEIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEIMouseClicked

    }//GEN-LAST:event_lblEIMouseClicked

    private void lblEIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEIMousePressed
        String jugador = lblEI.getText();
        if (jugador != "") {
        }
    }//GEN-LAST:event_lblEIMousePressed

    private void lblEIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEIKeyPressed

    }//GEN-LAST:event_lblEIKeyPressed

    private void lblEIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEIKeyReleased

    }//GEN-LAST:event_lblEIKeyReleased

    private void tblPartidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPartidosMousePressed
        String s = (String) tblPartidos.getModel().getValueAt(tblPartidos.getSelectedRow(), 1);

    }//GEN-LAST:event_tblPartidosMousePressed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrorActionPerformed
        // TODO add your handling code here:

        btnError.setVisible(false);
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnRetroceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetroceder1ActionPerformed
        // TODO add your handling code here:
        pantallaClasificacion pantalla = new pantallaClasificacion(Actual);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetroceder1ActionPerformed

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void jLayeredPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLayeredPane1ComponentShown
//        UsuarioPerfil


    }//GEN-LAST:event_jLayeredPane1ComponentShown

    private void lblEI1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEI1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEI1MouseClicked

    private void lblEI1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEI1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEI1MousePressed

    private void lblEI1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEI1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEI1KeyPressed

    private void lblEI1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEI1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEI1KeyReleased

    private void lblEIAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblEIAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEIAncestorAdded

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
            java.util.logging.Logger.getLogger(pantallaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BG;
    private javax.swing.JButton btnBuscarJugador1;
    private javax.swing.JButton btnClasificacion1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnCompar1;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLiga1;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnPerfil1;
    private javax.swing.JButton btnPlantilla1;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnRetroceder1;
    private javax.swing.JButton btnTienda1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLayeredPane layerMenu1;
    private javax.swing.JLayeredPane layerUnirseLiga;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDC;
    private javax.swing.JLabel lblDFCD;
    private javax.swing.JLabel lblDFCI;
    private javax.swing.JLabel lblDerrotas;
    private javax.swing.JLabel lblDerrotas1;
    private javax.swing.JLabel lblDin;
    private javax.swing.JLabel lblED;
    private javax.swing.JLabel lblEI;
    private javax.swing.JLabel lblEI1;
    private javax.swing.JLabel lblGK;
    private javax.swing.JLabel lblLD;
    private javax.swing.JLabel lblLI;
    private javax.swing.JLabel lblLiga;
    private javax.swing.JLabel lblLigat;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblMCD;
    private javax.swing.JLabel lblMCI;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEquipo;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombret;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblPuntost;
    private javax.swing.JLabel lblSaldoDisponible;
    private javax.swing.JLabel lblValorJugador;
    private javax.swing.JLabel lblVicorias;
    private javax.swing.JLabel lblVicoriast;
    private javax.swing.JLabel lblbEquipo;
    private javax.swing.JLabel lbldinero;
    private javax.swing.JLayeredPane panelAcciones;
    private javax.swing.JLayeredPane panelAcciones1;
    private javax.swing.JLayeredPane panelCabecera;
    private javax.swing.JPanel pnlImg1;
    private javax.swing.JPanel pnlImg10;
    private javax.swing.JPanel pnlImg11;
    private javax.swing.JPanel pnlImg12;
    private javax.swing.JPanel pnlImg2;
    private javax.swing.JPanel pnlImg3;
    private javax.swing.JPanel pnlImg4;
    private javax.swing.JPanel pnlImg5;
    private javax.swing.JPanel pnlImg6;
    private javax.swing.JPanel pnlImg7;
    private javax.swing.JPanel pnlImg8;
    private javax.swing.JPanel pnlImg9;
    private javax.swing.JTable tblPartidos;
    // End of variables declaration//GEN-END:variables
}
