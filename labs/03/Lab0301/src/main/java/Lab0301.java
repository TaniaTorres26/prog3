import java.util.LinkedList;
import java.util.Queue;

public class Lab0301 {
    static Queue<Registro> regis = new LinkedList<>();
    public static void main(String[] args) {
        registro_estudiante();
        registro_asignaturas();
        reporte_registro_final();
    }

    public static void registro_estudiante(){
        String codigo = Entrada.readText("Codigo estudiante");
        String nombre = Entrada.readText("Nombre estudiante");
        String correo= Entrada.readText("Correo estudiante");
        int semestre = Entrada.readInt("Semestre: ");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        // crear registro con el codigo del estudiante (por ahora)
        //luego agregaremos las asignaturas
        regis.add(new Registro(estud));
    }
    
    public static void registro_asignaturas(){
        
    }
    
    public static void reporte_registro_final(){
        
    }
}
