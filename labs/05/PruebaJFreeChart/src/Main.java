import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Generador de Gráficos");
            System.out.println("1. Gráfico por Edad y Casos por Edad");
            System.out.println("2. Gráfico por Tipo de Seguro de Salud y Estrato");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    PruebaJFreeChart.generarGraficoEdad();
                    break;
                case 2:
                    System.out.print("Ingrese el tipo de Seguro de Salud (TIP_SS): ");
                    scanner.nextLine();  // Consumir la nueva línea pendiente
                    String tipSS = scanner.nextLine();
                    PruebaJFreeChart.generarGraficoSeguroSaludEstrato(tipSS);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}

