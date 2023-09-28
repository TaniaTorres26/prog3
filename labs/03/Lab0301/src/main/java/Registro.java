/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tania
 */
import java.util.LinkedList;
import java.util.List;

public class Registro {
    private Estudiante estudiante;
    private List<Asignatura> listaAsignaturas;

    public Registro(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.listaAsignaturas = new LinkedList<>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(List<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        listaAsignaturas.add(asignatura);
    }
}


