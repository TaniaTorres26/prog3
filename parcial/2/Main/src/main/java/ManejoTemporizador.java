/**
 *
 * @author Tania Sofia Torres Romero y Camilo Tibaduiza
 */
import java.util.Timer;
import java.util.HashMap;

//Esta clase la considero casi la mas importante porque es la que maneja la creacion, iniciacion y detencion de los temporizadores
public class ManejoTemporizador {
    private final HashMap<String, Timer> temporizadores;

    public ManejoTemporizador() {
        temporizadores = new HashMap<>();
    }

    public void crearTemporizador(String nombre, long tiempoEsperaSegundos) {
        Temporizador tarea = new Temporizador(nombre);
        Timer timer = new Timer();
        timer.schedule(tarea, tiempoEsperaSegundos * 1000); // En esta parte se convierte de segundos a milisegundos

        temporizadores.put(nombre, timer);
        System.out.println("Temporizador '" + nombre + "' creado y programado.");
    }

    public void iniciarTemporizador(String nombre) {
        Timer timer = temporizadores.get(nombre);
        if (timer != null) {
            timer.cancel(); // Aqui se cancela el codigo existente
            temporizadores.remove(nombre);
            System.out.println("Temporizador '" + nombre + "' detenido.");
        } else {
            System.out.println("Temporizador '" + nombre + "' no encontrado.");
        }
    }

    public void detenerTemporizador(String nombre) {
        Timer timer = temporizadores.get(nombre);
        if (timer != null) {
            timer.cancel();
            temporizadores.remove(nombre);
            System.out.println("Temporizador '" + nombre + "' detenido.");
        } else {
            System.out.println("Temporizador '" + nombre + "' no encontrado.");
        }
    }
}

