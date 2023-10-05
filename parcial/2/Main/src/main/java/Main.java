/**
 *
 * @author Tania Sofia Torres Romero y Camilo Tibaduiza
 */
import java.util.Scanner;

//Aqui se maneja la clase principal que es el main por la cual se va a manejar el menu de la consola
// En este menu se hacen los respcetivos llamados para que funcuone de forma optima
//En este menu se crea el objeto ManejoTemporizador, De acuerdo a los visto en su clase se dividio el menu en tres clases
//La principal que es la clase Main, la clase de Manejo de temporizadores y la clase temporizador
//Este codigo lo hicimos en pareja con Camilo Tibaduiza y Tania Sofia Torres
// Esperamos volverlo a ver pronto profe, recuperese pronto
public class Main {
    public static void main(String[] args) {
        ManejoTemporizador manejoTemporizador = new ManejoTemporizador();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Gestión de Temporizadores :D ===");
            System.out.println("1. Crear Temporizador");
            System.out.println("2. Iniciar Temporizador");
            System.out.println("3. Detener Temporizador");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Ingrese un nombre para el temporizador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el tiempo de espera en segundos: ");
                    long tiempoEspera = scanner.nextLong();
                    manejoTemporizador.crearTemporizador(nombre, tiempoEspera);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del temporizador que desea iniciar: ");
                    nombre = scanner.nextLine();
                    manejoTemporizador.iniciarTemporizador(nombre);
                    break;
                case 3:
                    scanner.nextLine(); 
                    System.out.print("Ingrese el nombre del temporizador que desea detener: ");
                    nombre = scanner.nextLine();
                    manejoTemporizador.detenerTemporizador(nombre);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. >:c");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

