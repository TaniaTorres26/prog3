import java.util.Scanner;

public class OperacionesMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        double[][] matriz = new double[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la posición (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        while (true) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma de matrices");
            System.out.println("2. Producto de matrices");
            System.out.println("3. Producto de un escalar con una matriz");
            System.out.println("4. Traspuesta de una matriz");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la segunda matriz para la suma:");
                    double[][] matrizSuma = leerMatriz(filas, columnas);
                    double[][] resultadoSuma = sumarMatrices(matriz, matrizSuma);
                    imprimirMatriz(resultadoSuma);
                    break;
                case 2:
                    System.out.println("Ingrese la segunda matriz para el producto:");
                    int filas2 = columnas;
                    System.out.print("Ingrese el número de columnas de la segunda matriz: ");
                    int columnas2 = scanner.nextInt();
                    double[][] matrizProducto = leerMatriz(filas2, columnas2);
            }
}
   
}
}
