
import java.util.Timer;
import java.util.TimerTask;

public class Ej0403 extends javax.swing.JFrame {
 Timer timer;
 TimerTask timertask;
 Boolean funcionando = false;
 public Ej0403() {
 initComponents();
 }
@SuppressWarnings("unchecked")
private void initComponents() {
//Código generado por Netbeans
}
//Código del botón para iniciar y detener el Timer
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 if (!funcionando) {
 timer = new Timer();
 timertask = new TimerTask() {
 int i = 5;
 @Override
 public void run() {
 jLabel1.setLocation(i, 19); //Ubica el jLabel1 en las
 i++; //coordenadas (i,19)
 }
 };
 timer.scheduleAtFixedRate(timertask, 0, 100);//cada 100ms se 
 funcionando = true;
 jButton1.setText("Detener");
 } else {
 timer.cancel(); //Cancela el Timer
 funcionando = false;
 jButton1.setText("Iniciar");
 }
 }
public static void main(String args[]) {
//Código generado por Netbeans
}
private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
}
