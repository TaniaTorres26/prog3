/**
 *
 * @author Tania Sofia Torres y Camilo Tibaduiza
 */
import java.util.TimerTask;

class Temporizador extends TimerTask {
    private final String nombre; 

    public Temporizador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Temporizador '" + nombre + "' ha terminado.");
    }
}

