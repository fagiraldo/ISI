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
public class Programa {
    private String nombre;
    private String departamento;
    private ArrayList<Curso> cursos;

    public Programa(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cursos = new ArrayList<Curso>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    public void addCurso(String nombre, int credito){
      Curso curso  = new Curso (nombre, credito);
      this.cursos.add(curso);
    }
    
    
    
}
