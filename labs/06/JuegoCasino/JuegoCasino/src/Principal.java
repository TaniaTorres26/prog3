/**
 *
 * @author Tania Sofia Torres Romero
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Principal extends javax.swing.JFrame {
    private int coins = 100; 
    private final int betAmount = 20; 
    private boolean spinning = false; 
    private int difficulty = 100; 

    private final String[] imagenes = {"imagen1.jpeg", "imagen2.jpeg", "imagen3.jpeg", "imagen4.jpeg"};
    private final Random random = new Random();
    private Hilo hilo;

    private final ImageIcon[] originalImages = new ImageIcon[4];

    public Principal() {
        initComponents();
        updateCoinsLabel();
        setupDifficultyComboBox();
        originalImages[0] = (ImageIcon) jLabel2.getIcon();
        originalImages[1] = (ImageIcon) jLabel4.getIcon();
        originalImages[2] = (ImageIcon) jLabel5.getIcon();
        originalImages[3] = (ImageIcon) jLabel6.getIcon();
        Detener.setEnabled(false);
    }

    private void setupDifficultyComboBox() {
        Dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"DIFICULTAD", "FACIL", "MEDIO", "DIFICIL"}));
        Dificultad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JComboBox cb = (JComboBox) evt.getSource();
                int selectedIndex = cb.getSelectedIndex();
                if (selectedIndex == 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, elija una dificultad antes de comenzar el juego.");
                } else {
                    difficulty = selectedIndex * 50 + 100;
                }
            }
        });
    }

    private void updateCoinsLabel() {
        Monedas.setText("MONEDAS: " + coins);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Monedas = new javax.swing.JLabel();
        SalirButton = new javax.swing.JButton();
        Dificultad = new javax.swing.JComboBox<>();
        Detener = new javax.swing.JButton();
        Rodar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen2.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 80, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen3.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 80, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen4.jpeg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 90, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CASINO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 310, 40));

        Monedas.setBackground(new java.awt.Color(0, 51, 51));
        Monedas.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Monedas.setForeground(new java.awt.Color(255, 255, 255));
        Monedas.setText("MONEDAS: 100");
        jPanel1.add(Monedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        SalirButton.setBackground(new java.awt.Color(255, 0, 0));
        SalirButton.setText("X");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SalirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        Dificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIFICULTAD", "FACIL", "MEDIO", "DIFICIL", " " }));
        Dificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DificultadActionPerformed(evt);
            }
        });
        jPanel1.add(Dificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 140, 40));

        Detener.setBackground(new java.awt.Color(0, 102, 102));
        Detener.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Detener.setForeground(new java.awt.Color(255, 255, 255));
        Detener.setText("DETENER");
        Detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetenerActionPerformed(evt);
            }
        });
        jPanel1.add(Detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        Rodar.setBackground(new java.awt.Color(0, 102, 102));
        Rodar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Rodar.setForeground(new java.awt.Color(255, 255, 255));
        Rodar.setText("RODAR");
        Rodar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RodarActionPerformed(evt);
            }
        });
        jPanel1.add(Rodar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Fondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 640, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RodarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RodarActionPerformed
 if (!spinning) {
        if (Dificultad.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, elija una dificultad antes de comenzar el juego.");
            return;
        }

        if (coins >= betAmount) {
            coins -= betAmount;
            updateCoinsLabel();
            Rodar.setEnabled(false);
            Detener.setEnabled(true);
            hilo = new Hilo();
            hilo.start();
        } else {
            JOptionPane.showMessageDialog(this, "No tienes suficientes monedas para apostar.", "Sin monedas", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_RodarActionPerformed

    private void DetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetenerActionPerformed
       if (spinning && hilo != null) {
            hilo.detenerGiro();
        }
    }//GEN-LAST:event_DetenerActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void DificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadActionPerformed
       JComboBox cb = (JComboBox) evt.getSource();
    int selectedIndex = cb.getSelectedIndex();
    if (selectedIndex == 0) {
        JOptionPane.showMessageDialog(null, "Por favor, elija una dificultad antes de comenzar el juego.");
    } else {
        if (selectedIndex == 1) { 
            difficulty = 200;
        } else if (selectedIndex == 2) { 
            difficulty = 80; 
        } else if (selectedIndex == 3) { 
            difficulty = 20; 
        }
    }
    }//GEN-LAST:event_DificultadActionPerformed

     private class Hilo extends Thread {
        private volatile boolean detenerGiro = false;

        @Override
        public void run() {
            spinning = true;

            while (!detenerGiro) {
                actualizarImagenes();
                try {
                    Thread.sleep(difficulty);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            spinning = false;
            checkWin();
            Rodar.setEnabled(true);
        }

       private void actualizarImagenes() {
    String image1Path = "/ImagenesTM/" + imagenes[random.nextInt(imagenes.length)];
    String image2Path = "/ImagenesTM/" + imagenes[random.nextInt(imagenes.length)];
    String image3Path = "/ImagenesTM/" + imagenes[random.nextInt(imagenes.length)];
    String image4Path = "/ImagenesTM/" + imagenes[random.nextInt(imagenes.length)];

    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            jLabel2.setIcon(new ImageIcon(getClass().getResource(image1Path)));
            jLabel4.setIcon(new ImageIcon(getClass().getResource(image2Path)));
            jLabel5.setIcon(new ImageIcon(getClass().getResource(image3Path)));
            jLabel6.setIcon(new ImageIcon(getClass().getResource(image4Path)));
        }
    });
}

        public void detenerGiro() {
            detenerGiro = true;
        }

        private void checkWin() {
    if (originalImages[0].toString().equals(jLabel2.getIcon().toString()) &&
        originalImages[1].toString().equals(jLabel4.getIcon().toString()) &&
        originalImages[2].toString().equals(jLabel5.getIcon().toString()) &&
        originalImages[3].toString().equals(jLabel6.getIcon().toString())) {
        int multiplier = 2 + difficulty / 100;
        coins += betAmount * multiplier;
        updateCoinsLabel();
        JOptionPane.showMessageDialog(Principal.this, "¡Ganaste " + multiplier + " veces tu apuesta!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Detener;
    private javax.swing.JComboBox<String> Dificultad;
    private javax.swing.JLabel Monedas;
    private javax.swing.JButton Rodar;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
