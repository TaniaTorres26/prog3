/**
 *
 * @author Tania Torres y Camilo Tibaduiza
 */
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.HashMap;

class Temporizador extends TimerTask {
    private String nombre;

}

public class Main {
    private static HashMap<String, Timer> temporizadores = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        while (true) {
            System.out.println("\n=== Gestión de Temporizadores ===");
            System.out.println("1. Crear Temporizador");
            System.out.println("2. Iniciar Temporizador");
            System.out.println("3. Detener Temporizador");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearTemporizador();
                    break;
                case 2:
                    iniciarTemporizador();
                    break;
                case 3:
                    detenerTemporizador();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

