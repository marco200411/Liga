package Interface.juego;

import Methods.*;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pantallaJugadores extends javax.swing.JFrame {

    ImageTableModel model = new ImageTableModel();
    Usuario Actual = null;
    DecimalFormat df = new DecimalFormat("0.##M");

    public pantallaJugadores(Usuario usuarioActual) {
        initComponents();
        Actual = usuarioActual;

        rellenarTbl();
    }

    public void rellenarTbl() {
        Iterator<Futbolista> it = Actual.getJugadores().iterator();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        while (it.hasNext()) {
            Futbolista jugador = it.next();
            int x = 1;
            int agenteLibre= Actual.getLiga().getIntegrantes().size();
            while (x < Actual.getLiga().getIntegrantes().size()) {
                if (Actual.getLiga().getIntegrantes().get(x).getJugadores().contains(jugador)) {
                    model.addRow(new Object[]{new ImageIcon(getClass().getResource("/images/jugadores/" + jugador.getNombre() + ".png")), jugador.getNombre(), jugador.getPosicion(), df.format(jugador.getPrecio() / 1000000.0), jugador.getAtaque(), jugador.getDefensa(), Actual.getLiga().getIntegrantes().get(x).getEquipo().getNombre()});

                } else {
                    agenteLibre --;
                }
                x++;

            }
            if(agenteLibre == 0){
                                    model.addRow(new Object[]{new ImageIcon(getClass().getResource("/images/jugadores/" + jugador.getNombre() + ".png")), jugador.getNombre(), jugador.getPosicion(), df.format(jugador.getPrecio() / 1000000.0), jugador.getAtaque(), jugador.getDefensa(), "Libre"});

            }

        }

        // Establece el renderizador de celdas personalizado para la columna de imágenes
        ImageTableCellRenderer renderer = new ImageTableCellRenderer();
        jTable1.getColumnModel().getColumn(0).setCellRenderer(renderer);
    }

    public void vaciarTabla() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelAcciones = new javax.swing.JLayeredPane();
        btnRetroceder = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setShape(new RoundRectangle2D.Double(0, 0, 900, 700, 50, 50));

        jPanel1.setBackground(new java.awt.Color(51, 61, 87));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagen", "Nombre", "Posicion", "Precio", "Ataque", "Defensa", "Equipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(75);
        jTable1.setRowMargin(5);
        jScrollPane2.setViewportView(jTable1);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(pantallaJugadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaJugadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaJugadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaJugadores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLayeredPane panelAcciones;
    // End of variables declaration//GEN-END:variables
}
