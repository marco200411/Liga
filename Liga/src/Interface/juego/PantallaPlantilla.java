package Interface.juego;

import Interface.menus.Menu;
import Methods.Futbolista;
import Methods.Usuario;
import OperacionesBBDD.EnviarDatosBBDD;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.MouseInfo;
import java.awt.Point;

import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Marco
 */
public class PantallaPlantilla extends javax.swing.JFrame {

    /**
     * Creates new form PantallaLiga
     */
    Usuario Actual = null;
    DecimalFormat df = new DecimalFormat("0.##M");

    public PantallaPlantilla(Usuario us1) {
        Actual = us1;

        initComponents();

        actualizarPlantillaFirstTime();

        actualizarComboBox();
        lbldinero.setText(df.format(Actual.getEquipo().getDinero() / 1000000.0));
        lblNombreUsu.setText(Actual.getNombreUsuario());
    }

    private void actualizarComboBox() {
        comboJugadores.removeAllItems();
        comboJugadores.addItem("Seleccione uno");
        Iterator<Futbolista> it2 = Actual.getJugadores().iterator();
        while (it2.hasNext()) {
            Futbolista futbol = it2.next();
            if (!Actual.getPlantilla().contains(futbol)) {
                comboJugadores.addItem(futbol.getNombre());
            }

        }
    }

    private void actualizarPlantillaFirstTime() {
        Actual.getPlantillaDefensas().clear();
        Actual.getPlantillaMedios().clear();
        Actual.getPlantillaDelanteros().clear();
        Iterator<Futbolista> it1 = Actual.getPlantilla().iterator();
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

    private void eliminanrTodosJugadoresInterfaz() {

        lblGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblGK.setText("");
        lblLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblLD.setText("");
        lblDFCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblDFCD.setText("");
        lblDFCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblDFCI.setText("");
        lblLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblLI.setText("");
        lblMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblMCD.setText("");
        lblMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblMC.setText("");
        lblMCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblMCI.setText("");
        lblED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblED.setText("");
        lblDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblDC.setText("");
        lblEI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png")));
        lblEI.setText("");

    }

    private void actualizarInterfazPlantilla() {

        if (Actual.getPlantillaPortero() != null) {
            lblGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + Actual.getPlantillaPortero().getNombre() + ".png")));
            lblGK.setText(Actual.getPlantillaPortero().getNombre());
        }

        Iterator<Futbolista> itDefensas = Actual.getPlantillaDefensas().iterator();
        while (itDefensas.hasNext()) {
            Futbolista jDef = itDefensas.next();
            if (lblLD.getText().isBlank()) {
                lblLD.setText("" + jDef.getNombre());
                lblLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDef.getNombre() + ".png")));
            } else if (lblDFCD.getText().isBlank()) {
                lblDFCD.setText("" + jDef.getNombre());
                lblDFCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDef.getNombre() + ".png")));

            } else if (lblDFCI.getText().isBlank()) {
                lblDFCI.setText("" + jDef.getNombre());
                lblDFCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDef.getNombre() + ".png")));

            } else if (lblLI.getText().isBlank()) {
                lblLI.setText("" + jDef.getNombre());
                lblLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDef.getNombre() + ".png")));

            }

        }
        Iterator<Futbolista> itMedios = Actual.getPlantillaMedios().iterator();
        while (itMedios.hasNext()) {
            Futbolista jMed = itMedios.next();

            if (lblMCD.getText().isBlank()) {
                lblMCD.setText("" + jMed.getNombre());
                lblMCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jMed.getNombre() + ".png")));

            } else if (lblMC.getText().isBlank()) {
                lblMC.setText("" + jMed.getNombre());
                lblMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jMed.getNombre() + ".png")));

            } else if (lblMCI.getText().isBlank()) {
                lblMCI.setText("" + jMed.getNombre());
                lblMCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jMed.getNombre() + ".png")));

            }

        }
        Iterator<Futbolista> itDelanteros = Actual.getPlantillaDelanteros().iterator();
        while (itDelanteros.hasNext()) {
            Futbolista jDel = itDelanteros.next();
            if (lblED.getText().isBlank()) {
                lblED.setText("" + jDel.getNombre());
                lblED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDel.getNombre() + ".png")));

            } else if (lblDC.getText().isBlank()) {
                lblDC.setText("" + jDel.getNombre());
                lblDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDel.getNombre() + ".png")));

            } else if (lblEI.getText().isBlank()) {
                lblEI.setText("" + jDel.getNombre());
                lblEI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jugadores/" + jDel.getNombre() + ".png")));

            }

        }

    }

    private void ActualizarArrayPlantillaConArrayPosiciones() {

        Actual.getPlantilla().clear();
        Actual.getPlantilla().add(Actual.getPlantillaPortero());
        Iterator<Futbolista> itDefensas = Actual.getPlantillaDefensas().iterator();
        while (itDefensas.hasNext()) {

            Futbolista jDef = itDefensas.next();
            System.out.println(jDef.getNombre() + "");
            Actual.getPlantilla().add(jDef);
        }
        Iterator<Futbolista> itMedios = Actual.getPlantillaMedios().iterator();
        while (itMedios.hasNext()) {
            Futbolista jMed = itMedios.next();
            Actual.getPlantilla().add(jMed);
        }
        Iterator<Futbolista> itDelanteros = Actual.getPlantillaDelanteros().iterator();
        while (itDelanteros.hasNext()) {
            Futbolista jDel = itDelanteros.next();
            Actual.getPlantilla().add(jDel);
        }

    }


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
        jSeparator2 = new javax.swing.JSeparator();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
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
        layerUnirseLiga1 = new javax.swing.JLayeredPane();
        comboJugadores = new javax.swing.JComboBox<>();
        pnlInfoJugador = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        lblprecio = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        lblAtaque = new javax.swing.JLabel();
        btnAddPlantilla = new javax.swing.JButton();
        btnVender1 = new javax.swing.JButton();
        pnlImg = new javax.swing.JPanel(){
            public void paintComponent(Graphics g) {
                ImageIcon im = new ImageIcon("src\\images\\bordeJugadores.png");
                Image i = im.getImage();
                g.drawImage(i, 0,0, this.getSize().width, this.getSize().height,this);
            }
        };
        lblIMG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbldinero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreUsu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setShape(new RoundRectangle2D.Double(0, 0, 900, 700, 50, 50));

        layerBG.setBackground(new java.awt.Color(51, 61, 87));
        layerBG.setOpaque(true);
        layerBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layerMenu.setBackground(new java.awt.Color(51, 61, 87));
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

        layerBG.add(layerMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 882, 91));
        layerBG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 140, 850, 10));

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
                .addContainerGap())
        );

        layerBG.add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 10, -1, 30));

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

        layerBG.add(layerUnirseLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 500, 480));

        layerUnirseLiga1.setBackground(new java.awt.Color(92, 99, 112));
        layerUnirseLiga1.setMaximumSize(new java.awt.Dimension(410, 510));
        layerUnirseLiga1.setMinimumSize(new java.awt.Dimension(410, 510));
        layerUnirseLiga1.setOpaque(true);
        layerUnirseLiga1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboJugadores.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        comboJugadores.setToolTipText("");
        comboJugadores.setBorder(null);
        comboJugadores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboJugadoresItemStateChanged(evt);
            }
        });
        comboJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJugadoresActionPerformed(evt);
            }
        });
        layerUnirseLiga1.add(comboJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 30));
        comboJugadores.addItem("Seleccione uno");

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        lblNombre1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblNombre1.setText("Nombre:");

        lblPosicion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        lblprecio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        lblDefensa.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDefensa.setPreferredSize(new java.awt.Dimension(40, 20));

        lblAtaque.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAtaque.setPreferredSize(new java.awt.Dimension(40, 20));

        btnAddPlantilla.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAddPlantilla.setText("Añadir");
        btnAddPlantilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddPlantillaMousePressed(evt);
            }
        });
        btnAddPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlantillaActionPerformed(evt);
            }
        });

        btnVender1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVender1.setText("Vender por: ");
        btnVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVender1ActionPerformed(evt);
            }
        });

        pnlImg.setMaximumSize(new java.awt.Dimension(90, 90));
        pnlImg.setMinimumSize(new java.awt.Dimension(90, 90));
        pnlImg.setOpaque(false);
        pnlImg.setPreferredSize(new java.awt.Dimension(90, 90));

        lblIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/player.png"))); // NOI18N
        lblIMG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblIMG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIMG.setPreferredSize(new java.awt.Dimension(80, 80));
        lblIMG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblIMGMouseDragged(evt);
            }
        });
        lblIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIMGMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlImgLayout = new javax.swing.GroupLayout(pnlImg);
        pnlImg.setLayout(pnlImgLayout);
        pnlImgLayout.setHorizontalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIMG, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlImgLayout.setVerticalGroup(
            pnlImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIMG, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlInfoJugadorLayout = new javax.swing.GroupLayout(pnlInfoJugador);
        pnlInfoJugador.setLayout(pnlInfoJugadorLayout);
        pnlInfoJugadorLayout.setHorizontalGroup(
            pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                        .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoJugadorLayout.createSequentialGroup()
                                .addComponent(lblAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                        .addComponent(btnVender1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoJugadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoJugadorLayout.createSequentialGroup()
                                .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoJugadorLayout.createSequentialGroup()
                                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pnlInfoJugadorLayout.setVerticalGroup(
            pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefensa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVender1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btnAddPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(pnlInfoJugadorLayout.createSequentialGroup()
                        .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlInfoJugadorLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblNombre, lblPosicion});

        layerUnirseLiga1.add(pnlInfoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 280, 380));

        layerBG.add(layerUnirseLiga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 330, 480));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Dinero:");
        layerBG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 50, 30));

        lbldinero.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        layerBG.add(lbldinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 70, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");
        layerBG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 60, 30));

        lblNombreUsu.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        layerBG.add(lblNombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerBG, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerBG, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
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

    private void mostrarInfoJugador(String nombre) {
        pnlInfoJugador.setVisible(true);
        Iterator<Futbolista> it = Actual.getJugadores().iterator();

        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                lblIMG.setIcon(new ImageIcon(getClass().getResource("/images/jugadores/" + jugador.getNombre() + ".png")));
                lblNombre.setText(jugador.getNombre());
                lblPosicion.setText("Posicion: " + jugador.getPosicion());
                lblprecio.setText("Precio: " + jugador.getPrecio());
                lblAtaque.setText("" + jugador.getAtaque());
                lblDefensa.setText("" + jugador.getDefensa());
                btnAddPlantilla.setText("Retirar");
                btnVender1.setText("Vender por: " + df.format(jugador.getPrecio() / 1000000.0));
            }
        }

    }

    private void comboJugadoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboJugadoresItemStateChanged
        System.out.println(comboJugadores.getSelectedIndex());
        if (comboJugadores.getSelectedIndex() == 0) {

            pnlInfoJugador.setVisible(false);
        } else {
            pnlInfoJugador.setVisible(true);
        }
        lblIMG.setIcon(new ImageIcon(getClass().getResource("/images/player.png")));
        Iterator<Futbolista> it = Actual.getJugadores().iterator();

        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (Actual.getPlantilla().contains(jugador)) {

                if (jugador.getNombre().equals(comboJugadores.getSelectedItem())) {

                }
            } else {
                if (jugador.getNombre().equals(comboJugadores.getSelectedItem())) {
                    lblIMG.setIcon(new ImageIcon(getClass().getResource("/images/jugadores/" + jugador.getNombre() + ".png")));
                    lblNombre.setText(jugador.getNombre());
                    lblPosicion.setText("Posicion: " + jugador.getPosicion());
                    lblprecio.setText("Precio: " + jugador.getPrecio());
                    lblAtaque.setText("" + jugador.getAtaque());
                    lblDefensa.setText("" + jugador.getDefensa());
                    btnAddPlantilla.setText("Alinear");

                    btnVender1.setText("Vender por: " + df.format(jugador.getPrecio() / 1000000.0));
                }
            }
        }

    }//GEN-LAST:event_comboJugadoresItemStateChanged

    private void lblIMGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIMGMousePressed

    }//GEN-LAST:event_lblIMGMousePressed

    private void lblIMGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIMGMouseDragged


    }//GEN-LAST:event_lblIMGMouseDragged

    private void btnAddPlantillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPlantillaMousePressed

    }//GEN-LAST:event_btnAddPlantillaMousePressed

    private void lblEIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEIKeyPressed

    }//GEN-LAST:event_lblEIKeyPressed

    private void lblEIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEIMouseClicked


    }//GEN-LAST:event_lblEIMouseClicked

    private void lblDCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDCMouseEntered

    }//GEN-LAST:event_lblDCMouseEntered

    private void lblEIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEIKeyReleased

    }//GEN-LAST:event_lblEIKeyReleased

    private void lblEIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEIMousePressed
        String jugador = lblEI.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }

    }//GEN-LAST:event_lblEIMousePressed

    private void lblDCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDCMousePressed
        String jugador = lblDC.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblDCMousePressed

    private void lblEDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEDMousePressed
        String jugador = lblED.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblEDMousePressed

    private void lblMCIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCIMousePressed
        String jugador = lblMCI.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblMCIMousePressed

    private void lblMCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCMousePressed
        String jugador = lblMC.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblMCMousePressed

    private void lblMCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMCDMousePressed
        String jugador = lblMCD.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblMCDMousePressed

    private void lblLIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLIMousePressed
        String jugador = lblLI.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblLIMousePressed

    private void lblDFCIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDFCIMousePressed
        String jugador = lblDFCI.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblDFCIMousePressed

    private void lblDFCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDFCDMousePressed
        String jugador = lblDFCD.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblDFCDMousePressed

    private void lblLDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLDMousePressed
        String jugador = lblLD.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblLDMousePressed

    private void lblGKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGKMousePressed
        String jugador = lblGK.getText();
        if (jugador != "") {
            mostrarInfoJugador(jugador);
        }
    }//GEN-LAST:event_lblGKMousePressed

    private void btnAddPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlantillaActionPerformed

        Iterator<Futbolista> it = Actual.getJugadores().iterator();

        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (jugador.getNombre().equalsIgnoreCase(lblNombre.getText())) {
                System.out.println("1");
                if (jugador.getPosicion().equalsIgnoreCase("PORTERO")) {

                    if (!Actual.getPlantilla().contains(jugador)) {
                        System.out.println("1");
                        //Modificar Array posiciones 
                        Actual.setPlantillaPortero(jugador);
                    } else {
                        Actual.setPlantillaPortero(null);
                    }

                } else if (jugador.getPosicion().equalsIgnoreCase("DEFENSA")) {
                    System.out.println("2");
                    if (Actual.getPlantilla().contains(jugador)) {
                        System.out.println("3");
                        Actual.getPlantillaDefensas().remove(jugador);

                    } else if (!Actual.getPlantilla().contains(jugador) && Actual.getPlantillaDefensas().size() < 4) {
                        System.out.println("4");
                        Actual.getPlantillaDefensas().add(jugador);
                    } else {
                        System.out.println("error");
                    }

                } else if (jugador.getPosicion().equalsIgnoreCase("MEDIO")) {
                    if (!Actual.getPlantilla().contains(jugador) && Actual.getPlantillaMedios().size() < 3) {
                        Actual.getPlantillaMedios().add(jugador);
                    } else {
                        Actual.getPlantillaMedios().remove(jugador);
                    }

                } else {
                    if (!Actual.getPlantilla().contains(jugador) && Actual.getPlantillaDelanteros().size() < 3) {
                        Actual.getPlantillaDelanteros().add(jugador);
                    } else {
                        Actual.getPlantillaDelanteros().remove(jugador);

                    }
                }

            }

        }
        comboJugadores.setSelectedIndex(0);

        eliminanrTodosJugadoresInterfaz();
        //Modificar Array plantilla
        ActualizarArrayPlantillaConArrayPosiciones();
        //Modificar Interfaz
        actualizarInterfazPlantilla();
        EnviarDatosBBDD send = new EnviarDatosBBDD();
        send.actualizarJugadoresPlantilla(Actual.getPlantilla(), Actual);
        actualizarComboBox();

    }//GEN-LAST:event_btnAddPlantillaActionPerformed

    private void comboJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJugadoresActionPerformed

    private void lblEDAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblEDAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEDAncestorAdded

    private void btnVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVender1ActionPerformed
        Futbolista futbolistaEliminar = null;
        Iterator<Futbolista> it = Actual.getJugadores().iterator();

        while (it.hasNext()) {
            Futbolista jugador = it.next();
            if (jugador.getNombre().equalsIgnoreCase(lblNombre.getText())) {
                futbolistaEliminar = jugador;
                if (Actual.getPlantillaPortero() == jugador) {
                    System.out.println("portero");
                    Actual.setPlantillaPortero(null);
                } else {
                    Actual.getPlantillaDefensas().remove(jugador);
                    Actual.getPlantillaMedios().remove(jugador);
                    Actual.getPlantillaDelanteros().remove(jugador);
                }

            }
        }
        EnviarDatosBBDD send = new EnviarDatosBBDD();
        Actual.getJugadores().remove(futbolistaEliminar);
        send.actualizarJugadoresPlantilla(Actual.getJugadores(), Actual);
        eliminanrTodosJugadoresInterfaz();
        //Modificar Array plantilla
        ActualizarArrayPlantillaConArrayPosiciones();
        //Modificar Interfaz
        actualizarInterfazPlantilla();
        actualizarComboBox();
        System.out.println(Actual.getEquipo().getDinero());
        int saldo = Actual.getEquipo().getDinero() + futbolistaEliminar.getPrecio();
        Actual.getEquipo().setDinero(saldo);
        send.actualizarSaldo(Actual);

        lbldinero.setText(df.format(Actual.getEquipo().getDinero() / 1000000.0));
    }//GEN-LAST:event_btnVender1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPlantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlantilla;
    private javax.swing.JButton btnBuscarJugador;
    private javax.swing.JButton btnClasificacion;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLiga;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPlantilla;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnTienda;
    private javax.swing.JButton btnVender1;
    private javax.swing.JComboBox<String> comboJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLayeredPane layerBG;
    private javax.swing.JLayeredPane layerMenu;
    private javax.swing.JLayeredPane layerUnirseLiga;
    private javax.swing.JLayeredPane layerUnirseLiga1;
    private javax.swing.JLabel lblAtaque;
    private javax.swing.JLabel lblDC;
    private javax.swing.JLabel lblDFCD;
    private javax.swing.JLabel lblDFCI;
    private javax.swing.JLabel lblDefensa;
    private javax.swing.JLabel lblED;
    private javax.swing.JLabel lblEI;
    private javax.swing.JLabel lblGK;
    private javax.swing.JLabel lblIMG;
    private javax.swing.JLabel lblLD;
    private javax.swing.JLabel lblLI;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblMCD;
    private javax.swing.JLabel lblMCI;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombreUsu;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lbldinero;
    private javax.swing.JLabel lblprecio;
    private javax.swing.JLayeredPane panelAcciones;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel pnlImg1;
    private javax.swing.JPanel pnlImg10;
    private javax.swing.JPanel pnlImg11;
    private javax.swing.JPanel pnlImg2;
    private javax.swing.JPanel pnlImg3;
    private javax.swing.JPanel pnlImg4;
    private javax.swing.JPanel pnlImg5;
    private javax.swing.JPanel pnlImg6;
    private javax.swing.JPanel pnlImg7;
    private javax.swing.JPanel pnlImg8;
    private javax.swing.JPanel pnlImg9;
    private javax.swing.JPanel pnlInfoJugador;
    // End of variables declaration//GEN-END:variables
}
