/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tania
 */
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int semestre;
    private int numCreditos;
    private List<Horario> horarios;

    public Asignatura(int codigo, String nombre, int semestre, int numCreditos, List<Horario> horarios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.numCreditos = numCreditos;
        this.horarios = horarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}


