/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificador_de_precios;

import java.sql.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author aemil
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private String codigo = "";
    private String serverIP = "localhost";
    private String port = "3306";
    private String database = "verificador_precios";
    private String username = "root";
    private String password = "";
    private String table = "productos";
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private String dir = "F:/OneDrive - Universidad de Sonora/Séptimo Semestre/Gestión de la Calidad del Software II/NetBeans/verificador_de_precios/src/verificador_de_precios/images/";
    private int timeLimit = 2000;


    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {

        initComponents();

        this.setLayout(null);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0, 122, 41));

        MainWindowVisible(true);
        PriceWindowVisible(false);
        ErrorWindowVisible(false);

        pictureLogo.setText("<html><img src='file:" + dir + "logo.png' width='744' height='162'>");
        pictureCodebar.setText("<html><img src='file:" + dir + "barcode-scan.gif' width='288' height='252'>");

        pictureLogo.setLocation(dim.width / 2 - pictureLogo.getWidth() / 2, dim.height / 4 - pictureLogo.getHeight());
        labelTitle.setLocation(dim.width / 2 - labelTitle.getWidth() / 2, dim.height / 3 - pictureLogo.getHeight() / 3);
        labelText.setLocation(dim.width / 2 - labelText.getWidth() / 2, dim.height / 3 - pictureLogo.getHeight() / 3 + labelTitle.getHeight());
        pictureCodebar.setLocation(dim.width / 2 - pictureCodebar.getWidth() / 2, dim.height / 2 + pictureLogo.getHeight());

        pictureProduct.setLocation(dim.width / 5 - pictureProduct.getWidth() / 2, dim.height / 2 - pictureProduct.getHeight() / 2);
        labelProductName.setLocation(dim.width / 2 - pictureProduct.getWidth() / 2 - 30, dim.height / 2 - pictureProduct.getHeight() / 2 - 60);
        labelProductDesc.setLocation(dim.width / 2 - pictureProduct.getWidth() / 2 - 30, dim.height / 2 - labelProductName.getHeight() - 80);
        labelProductPrice.setLocation(dim.width / 2 - pictureProduct.getWidth() / 2 - 30, dim.height / 2 + pictureProduct.getHeight() / 2);

        labelErrorTitle.setLocation(dim.width / 2 - labelErrorTitle.getWidth() / 2, dim.height / 4 - labelErrorTitle.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureLogo = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelText = new javax.swing.JLabel();
        pictureCodebar = new javax.swing.JLabel();
        labelProductName = new javax.swing.JLabel();
        labelProductDesc = new javax.swing.JLabel();
        labelProductPrice = new javax.swing.JLabel();
        pictureProduct = new javax.swing.JLabel();
        labelErrorTitle = new javax.swing.JLabel();
        labelErrorText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 122, 41));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pictureLogo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pictureLogo.setText("Logo");
        pictureLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        labelTitle.setFont(new java.awt.Font("Heebo", 1, 150)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 216, 89));
        labelTitle.setText("Checa el precio");
        labelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelText.setFont(new java.awt.Font("Heebo", 1, 80)); // NOI18N
        labelText.setForeground(new java.awt.Color(255, 255, 255));
        labelText.setText("Pasando el código de barras bajo el sensor");
        labelText.setToolTipText("");

        pictureCodebar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pictureCodebar.setText("Codebar");
        pictureCodebar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pictureCodebar.setName(""); // NOI18N

        labelProductName.setFont(new java.awt.Font("Heebo", 1, 80)); // NOI18N
        labelProductName.setForeground(new java.awt.Color(255, 216, 89));
        labelProductName.setText("Nombre del producto");
        labelProductName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelProductDesc.setFont(new java.awt.Font("Heebo", 0, 70)); // NOI18N
        labelProductDesc.setForeground(new java.awt.Color(255, 255, 255));
        labelProductDesc.setText("Descripción del producto ");
        labelProductDesc.setToolTipText("");

        labelProductPrice.setFont(new java.awt.Font("Heebo", 1, 80)); // NOI18N
        labelProductPrice.setForeground(new java.awt.Color(255, 216, 89));
        labelProductPrice.setText("Precio: xxx.xx");
        labelProductPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pictureProduct.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pictureProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificador_de_precios/images/image placeholder.png"))); // NOI18N
        pictureProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pictureProduct.setName(""); // NOI18N

        labelErrorTitle.setFont(new java.awt.Font("Heebo", 1, 150)); // NOI18N
        labelErrorTitle.setForeground(new java.awt.Color(255, 216, 89));
        labelErrorTitle.setText("Lo sentimos");
        labelErrorTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelErrorText.setFont(new java.awt.Font("Heebo", 1, 80)); // NOI18N
        labelErrorText.setForeground(new java.awt.Color(255, 255, 255));
        labelErrorText.setText("Hubo un error al realizar el escaneo");
        labelErrorText.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pictureLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelErrorTitle))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pictureCodebar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pictureProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelText)
                                    .addComponent(labelProductName)
                                    .addComponent(labelProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 1592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelProductPrice))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(labelErrorText))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(pictureLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelErrorTitle)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pictureCodebar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(pictureProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelProductName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addComponent(labelProductPrice))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyChar() == '\n') {
            String url = "jdbc:mysql://" + serverIP + ":" + port + "/" + database + "?user=" + username + "&pasword=" + password;

            try {
                Connection connection = DriverManager.getConnection(url);
                String query = "SELECT producto_nombre, producto_precio, producto_imagen FROM " + database + "." + table + " WHERE producto_codigo = '" + codigo + "';";

                ResultSet rs = connection.createStatement().executeQuery(query);
                if (rs.next()) {
                    
                    MainWindowVisible(false);
                    PriceWindowVisible(true);
                    ErrorWindowVisible(false);

                    String nombre = "", precio = "", imagen = "";

                    do {
                        nombre = rs.getString("producto_nombre");
                        precio = rs.getString("producto_precio");
                        imagen = rs.getString("producto_imagen");                        
                    } while (rs.next());
                    

                    labelProductDesc.setText(nombre);
                    labelProductPrice.setText("Precio: $" + precio);
                    pictureProduct.setText("<html><img src='" + imagen + "' width='527' height='479'");
                    
                    timer(timeLimit);
                    
                } else {
                    labelErrorText.setText("<html>Hubo un error al realizar el escaneo<br><br>"
                            + "Inténtalo de nuevo o avisa a un\n"
                            + "empleado de la sucursal para\n"
                            + "solicitar ayuda");
                    
                    labelErrorText.setLocation(dim.width / 2 - labelErrorText.getWidth() / 2, dim.height / 3 - labelErrorTitle.getHeight() + 30);
                    
                    MainWindowVisible(false);
                    PriceWindowVisible(false);
                    ErrorWindowVisible(true);
                    
                    timer(timeLimit);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un error al conectarse a la base de datos");
                JOptionPane.showMessageDialog(null, e.getMessage());
                System.out.println(e.getMessage());
            }
            codigo = "";
        } else {
            codigo += evt.getKeyChar();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void MainWindowVisible(boolean option) {
        pictureLogo.setVisible(option);
        labelTitle.setVisible(option);
        labelText.setVisible(option);
        pictureCodebar.setVisible(option);
    }

    private void PriceWindowVisible(boolean option) {
        pictureProduct.setVisible(option);
        labelProductName.setVisible(option);
        labelProductDesc.setVisible(option);
        labelProductPrice.setVisible(option);

    }

    private void ErrorWindowVisible(boolean option) {
        labelErrorTitle.setVisible(option);
        labelErrorText.setVisible(option);
    }
    
    private void timer(int time) {
        Timer t = new Timer();
        
        t.schedule(new TimerTask() {
            
            @Override
            public void run() {
                try {
                    MainWindowVisible(true);
                    PriceWindowVisible(false);
                    ErrorWindowVisible(false);
                    
                    t.cancel();
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                } 
                t.cancel();
            }
        }, time, time);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel labelErrorText;
    private static javax.swing.JLabel labelErrorTitle;
    private static javax.swing.JLabel labelProductDesc;
    private static javax.swing.JLabel labelProductName;
    private static javax.swing.JLabel labelProductPrice;
    private static javax.swing.JLabel labelText;
    private static javax.swing.JLabel labelTitle;
    private static javax.swing.JLabel pictureCodebar;
    private static javax.swing.JLabel pictureLogo;
    private static javax.swing.JLabel pictureProduct;
    // End of variables declaration//GEN-END:variables
}
