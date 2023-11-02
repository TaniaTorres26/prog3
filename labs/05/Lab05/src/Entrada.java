import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Intoxicacion> intoxicaciones;

    public Entrada() {
        intoxicaciones = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("intoxicaciones.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosIntoxicaciones = scanner.nextLine().split(",");
                Intoxicacion temp = new Intoxicacion(Integer.parseInt(datosIntoxicaciones[4]), Integer.parseInt(datosIntoxicaciones[10]));
                intoxicaciones.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] intoxicacionesPorEstratoTodos(){
        int intoxicacionesEstrato[] = new int [6];
        int i=0;
        while (i<intoxicaciones.size()){
            Intoxicacion temp = intoxicaciones.get(i);
            
            switch (temp.estrato) {
                case 1:
                    intoxicacionesEstrato[0] += 1;
                    break;
                case 2:
                    intoxicacionesEstrato[1] += 1;
                    break;
                case 3:
                    intoxicacionesEstrato[2] += 1;
                    break;
                case 4:
                    intoxicacionesEstrato[3] += 1;
                    break;
                case 5:
                    intoxicacionesEstrato[4] += 1;
                    break;
                case 6:
                    intoxicacionesEstrato[5] += 1;
                    break;
                default:
                    System.out.println("Error: El estrato "+temp.estrato+" no esta dentro de las posibles.");
                    break;
            }
            i++;
        }
        return intoxicacionesEstrato;
    }
    
    public int[] intoxicacionesPorEstratoEdad() {
        int intoxicacionesEstrato[] = new int[12];
        int i = 0;
        while (i < intoxicaciones.size()) {
            Intoxicacion temp = intoxicaciones.get(i);

            if(temp.anio>25){
                switch (temp.estrato) {
                    case 1:
                        intoxicacionesEstrato[0] += 1;
                        break;
                    case 2:
                        intoxicacionesEstrato[1] += 1;
                        break;
                    case 3:
                        intoxicacionesEstrato[2] += 1;
                        break;
                    case 4:
                        intoxicacionesEstrato[3] += 1;
                        break;
                    case 5:
                        intoxicacionesEstrato[4] += 1;
                        break;
                    case 6:
                        intoxicacionesEstrato[5] += 1;
                        break;
                    default:
                        System.out.println("Error: El estrato " + temp.estrato + " no esta dentro de las posibles.");
                        break;
                }
            }
            i++;
        }
        return intoxicacionesEstrato;
    }
    
    
}
