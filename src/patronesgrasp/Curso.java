/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronesgrasp;

import java.util.ArrayList;

/**
 *
 * @author B106 PC-11
 */
public class Curso {
    private String nombre;
    private int creditos;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
