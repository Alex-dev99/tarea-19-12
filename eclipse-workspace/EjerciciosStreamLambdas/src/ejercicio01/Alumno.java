package ejercicio01;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String nombreCurso;
    private double notaMedia;
    private int edad;
    
    public Alumno(String nombre, String apellidos, String nombreCurso, double notaMedia, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.notaMedia = notaMedia;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNombreCurso() {
        return nombreCurso;
    }
    
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return String.format("Alumno: %s %s | Curso: %s | Nota: %.2f | Edad: %d", 
                nombre, apellidos, nombreCurso, notaMedia, edad);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno alumno = (Alumno) obj;
        return Double.compare(alumno.notaMedia, notaMedia) == 0 &&
               edad == alumno.edad &&
               Objects.equals(nombre, alumno.nombre) &&
               Objects.equals(apellidos, alumno.apellidos) &&
               Objects.equals(nombreCurso, alumno.nombreCurso);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, nombreCurso, notaMedia, edad);
    }
}
