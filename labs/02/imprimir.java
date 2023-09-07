public class imprimir {
  public static void imprimirMatriz(double[][] matriz) {
    int filas = matriz.length;
    int columnas = matriz[0].length;
    System.out.println("Resultado:");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}
