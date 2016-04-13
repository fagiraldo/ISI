package patronesgrasp;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author B106 PC-11
 */
public class Universidad {
    private String nit;
    private String nombre;
    private ArrayList<Programa> programas;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        this.programas = new ArrayList<Programa>();
        this.estudiantes = new ArrayList<Estudiante>();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
   
}
