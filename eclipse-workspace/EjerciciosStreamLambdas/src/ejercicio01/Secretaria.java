package ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Secretaria {
    private List<Alumno> alumnos;
    
    public Secretaria() {
        alumnos = new ArrayList<>();
        inicializarDatos();
    }
    
    private void inicializarDatos() {
        alumnos.add(new Alumno("Ana", "Garcia Lopez", "Matemáticas", 8.5, 20));
        alumnos.add(new Alumno("Carlos", "Martinez Ruiz", "Programacion", 9.0, 22));
        alumnos.add(new Alumno("Beatriz", "Sanchez Perez", "Historia", 7.5, 21));
        alumnos.add(new Alumno("Alberto", "Rodriguez Gomez", "Programacion", 8.0, 19));
        alumnos.add(new Alumno("Elena", "Fernandez Díaz", "Matemáticas", 6.5, 23));
        alumnos.add(new Alumno("Antonio", "Jimenez Vega", "Historia", 9.5, 20));
        alumnos.add(new Alumno("Maria", "Lopez Castro", "Programacion", 7.0, 24));
        alumnos.add(new Alumno("Ale", "Torres Navarro", "Matemáticas", 8.8, 18));
    }
    
    public List<Alumno> obtenerTodosAlumnos() {
        return alumnos.stream()
        		.filter(alumno -> true) 
                .collect(Collectors.toList());
    }
    
    public void mostrarTodosAlumnos() {
        alumnos.forEach(System.out::println);
    }
    
    public void imprimirAlumnosPorLetraInicial(char letra) {
        alumnos.stream()
                .filter(alumno -> alumno.getNombre().toUpperCase().charAt(0) == Character.toUpperCase(letra))
                .forEach(System.out::println);
    }
    
    public long contarAlumnos() {
        return alumnos.stream().count();
    }
    
    public List<Alumno> obtenerAlumnosNotaMayorA(double notaMinima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNotaMedia() > notaMinima)
                .collect(Collectors.toList());
    }
    
    public void imprimirPrimerosTresAlumnos() {
        alumnos.stream()
                .limit(3)
                .forEach(System.out::println);
    }
    
    public Optional<Alumno> obtenerAlumnoMenorEdad() {
        return alumnos.stream()
                .min(Comparator.comparingInt(Alumno::getEdad));
    }
    
    public Optional<Alumno> obtenerPrimerAlumno() {
        return alumnos.stream().findFirst();
    }
    
    public List<Alumno> obtenerAlumnosNombreLongitudMayorA(int longitudMinima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNombre().length() > longitudMinima)
                .collect(Collectors.toList());
    }
    
    public List<Alumno> obtenerAlumnosLetraALongitudMenorIgualA(int longitudMaxima) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNombre().toUpperCase().charAt(0) == 'A')
                .filter(alumno -> alumno.getNombre().length() <= longitudMaxima)
                .collect(Collectors.toList());
    }
    
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
