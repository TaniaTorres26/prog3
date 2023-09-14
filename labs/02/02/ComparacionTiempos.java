//*Tania Sofia Torres Romero*//
import java.util.Arrays;

public class ComparacionTiempos {
    public static void main(String[] args) {
        int[] tamañosArreglos = { 100, 500, 1000, 5000, 10000 };

        System.out.println("Tabla Comparativa de Tiempos (en nanosegundos):");
        System.out.println("Tamaño del Arreglo\tBurbuja\tInserción\tSelección\tMerge Sort");

        for (int tamaño : tamañosArreglos) {
            double[] arr = GeneradorDatos.generarDatosAleatorios(tamaño);
            double[] copiaArr1 = Arrays.copyOf(arr, arr.length);
            double[] copiaArr2 = Arrays.copyOf(arr, arr.length);
            double[] copiaArr3 = Arrays.copyOf(arr, arr.length);

            long tiempoInicio = System.nanoTime();
            AlgoritmosOrdenamiento.burbuja(copiaArr1);
            long tiempoFin = System.nanoTime();
            long tiempoBurbuja = tiempoFin - tiempoInicio;

            tiempoInicio = System.nanoTime();
            AlgoritmosOrdenamiento.insercion(copiaArr2);
            tiempoFin = System.nanoTime();
            long tiempoInsercion = tiempoFin - tiempoInicio;

            tiempoInicio = System.nanoTime();
            AlgoritmosOrdenamiento.seleccion(copiaArr3);
            tiempoFin = System.nanoTime();
            long tiempoSeleccion = tiempoFin - tiempoInicio;

            tiempoInicio = System.nanoTime();
            AlgoritmosOrdenamiento.mergeSort(arr);
            tiempoFin = System.nanoTime();
            long tiempoMerge = tiempoFin - tiempoInicio;

            System.out.println(tamaño + "\t\t\t" + tiempoBurbuja + "\t" + tiempoInsercion + "\t\t" + tiempoSeleccion
                    + "\t\t" + tiempoMerge);
        }
    }
}


