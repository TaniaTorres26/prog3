import java.util.Scanner;

public class leerMatriz {
  public static double[][] leerMatriz(int filas, int columnas) {
    Scanner scanner = new Scanner(System.in);
    double[][] matriz = new double[filas][columnas];
    System.out.println("Ingrese los elementos de la matriz:");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print("Ingrese el elemento en la posición (" + (i + 1) + "," + (j + 1) + "): ");
        matriz[i][j] = scanner.nextDouble();
      }
    }
    return matriz;
  }
}
