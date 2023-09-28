/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej0404;

/**
 *
 * @author Tania
 */
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej0404 extends javax.swing.JFrame {

    Timer temporizador;
    ActionListener al;

    public Ej0404() {
        initComponents();

        al = new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                double x = 50 + 10 * Math.sin(2 * Math.PI / 10 * (double) i);
                jRadioButton1.setLocation((int) x, i);
                i++;
            }
        };

        temporizador = new Timer(100, al); 
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (!temporizador.isRunning()) {
            temporizador.start();
            jButton1.setText("Detener");
        } else {
            temporizador.stop();
            jButton1.setText("Iniciar");
        }
    }

    public static void main(String args[]) {

    }
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
}
