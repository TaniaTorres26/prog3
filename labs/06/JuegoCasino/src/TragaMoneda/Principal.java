package TragaMoneda;

/**
 *
 * @author Tania Sofia Torres Romero
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    private int coins = 100; // Inicialmente, el jugador tiene 100 monedas
    private final int betAmount = 10; // Cantidad de monedas apostadas por defecto
    private boolean spinning = false; // Bandera para controlar el giro

    private final String[] imagenes = {"imagen1.jpeg", "imagen2.jpeg", "imagen3.jpeg", "imagen4.jpeg", "imagen10.jpeg"};
    private Random random = new Random();
    private Hilo hilo;

    public Principal() {
        initComponents();
        updateCoinsLabel();
    }

    private void updateCoinsLabel() {
        Monedas.setText("Monedas: " + coins);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Monedas = new javax.swing.JLabel();
        SalirButton = new javax.swing.JButton();
        Dificultad = new javax.swing.JComboBox<>();
        Detener = new javax.swing.JButton();
        Rodar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Logo1.jpeg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        Label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen1.jpeg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen2.jpeg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen3.jpeg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTM/Imagen4.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 490, -1));

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
            if (coins >= betAmount) {
                spinning = true;
                coins -= betAmount; // Restar la cantidad apostada
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
            hilo.DetenerTarea();
        }
    }//GEN-LAST:event_DetenerActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void DificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DificultadActionPerformed


public class Hilo extends Thread {
        Timer timer;

        @Override
        public void run() {
            timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Label1.setIcon(new ImageIcon("ImagenesTM/" + imagenes[random.nextInt(imagenes.length)]));
                    jLabel4.setIcon(new ImageIcon("ImagenesTM/" + imagenes[random.nextInt(imagenes.length)]));
                    jLabel5.setIcon(new ImageIcon("ImagenesTM/" + imagenes[random.nextInt(imagenes.length)]));
                    jLabel6.setIcon(new ImageIcon("ImagenesTM/" + imagenes[random.nextInt(imagenes.length)]));


                }
            };
            timer.scheduleAtFixedRate(task, 0, 100);
        }

        public void DetenerTarea() {
            timer.cancel();
            checkWin();
            spinning = false;
            Rodar.setEnabled(true);
            Detener.setEnabled(false);
        }

        private void checkWin() {
            if (Label1.getIcon().toString().equals(jLabel2.getIcon().toString()) &&
                jLabel2.getIcon().toString().equals(jLabel3.getIcon().toString())) {
                coins += betAmount * 10; // El jugador ganó 10 veces su apuesta
                updateCoinsLabel();
                JOptionPane.showMessageDialog(Principal.this, "¡Ganaste!", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel Label1;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
