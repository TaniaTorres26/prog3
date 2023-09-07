//*Tania Sofia Torres Romero lab 2*//
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

                    if (columnas != filas2) {
                    System.out.println("D: No se puede realizar el producto de matrices, las dimensiones no son compatibles.");
                    continue;
                    }

                    double[][] resultadoProducto = multiplicarMatrices(matriz, matrizProducto);
                    imprimirMatriz(resultadoProducto);
                    break;
                case 3:
                    System.out.print("Ingrese el escalar: ");
                    double escalar = scanner.nextDouble();
                    double[][] resultadoEscalar = multiplicarEscalar(matriz, escalar);
                    imprimirMatriz(resultadoEscalar);
                    break;
                case 4:
                    double[][] traspuesta = obtenerTraspuesta(matriz);
                    imprimirMatriz(traspuesta);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

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

    public static double[][] sumarMatrices(double[][] matriz1, double[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        double[][] resultado = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static double[][] multiplicarMatrices(double[][] matriz1, double[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;
        double[][] resultado = new double[filas1][columnas2];
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

    public static double[][] multiplicarEscalar(double[][] matriz, double escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] resultado = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    public static double[][] obtenerTraspuesta(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] traspuesta = new double[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

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
