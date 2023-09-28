
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

}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 if (!funcionando) {
 timer = new Timer();
 timertask = new TimerTask() {
 int i = 5;
 @Override
 public void run() {
 jLabel1.setLocation(i, 19); 
 i++; 
 }
 };
 timer.scheduleAtFixedRate(timertask, 0, 100);
 funcionando = true;
 jButton1.setText("Detener");
 } else {
 timer.cancel(); 
 funcionando = false;
 jButton1.setText("Iniciar");
 }
 }
public static void main(String args[]) {
}
private javax.swing.JButton jButton1;
 private javax.swing.JLabel jLabel1;
}
