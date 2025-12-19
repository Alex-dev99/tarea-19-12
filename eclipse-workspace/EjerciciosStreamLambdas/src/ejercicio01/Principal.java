package ejercicio01;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Secretaria secretaria = new Secretaria();
        int opcion=-1;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    List<Alumno> todosAlumnos = secretaria.obtenerTodosAlumnos();
                    System.out.println("\n=== TODOS LOS ALUMNOS ===");
                    todosAlumnos.forEach(System.out::println);
                    break;
                    
                case 2:
                    System.out.println("\n=== ALUMNOS CON FOR EACH ===");
                    secretaria.mostrarTodosAlumnos();
                    break;
                    
                case 3:
                    System.out.print("Ingrese la letra inicial: ");
                    char letra = scanner.nextLine().charAt(0);
                    System.out.println("\n=== ALUMNOS CON INICIAL '" + letra + "' ===");
                    secretaria.imprimirAlumnosPorLetraInicial(letra);
                    break;
                    
                case 4:
                    long cantidad = secretaria.contarAlumnos();
                    System.out.println("\n=== TOTAL DE ALUMNOS: " + cantidad + " ===");
                    break;
                    
                case 5:
                    System.out.print("Ingrese la nota mínima: ");
                    double notaMinima = scanner.nextDouble();
                    scanner.nextLine();
                    List<Alumno> alumnosNotaAlta = secretaria.obtenerAlumnosNotaMayorA(notaMinima);
                    System.out.println("\n=== ALUMNOS CON NOTA > " + notaMinima + " ===");
                    alumnosNotaAlta.forEach(System.out::println);
                    break;
                    
                case 6:
                    System.out.println("\n=== PRIMEROS 3 ALUMNOS ===");
                    secretaria.imprimirPrimerosTresAlumnos();
                    break;
                    
                case 7:
                    Optional<Alumno> alumnoMenor = secretaria.obtenerAlumnoMenorEdad();
                    if (alumnoMenor.isPresent()) {
                        System.out.println("\n=== ALUMNO DE MENOR EDAD ===");
                        System.out.println(alumnoMenor.get());
                    } else {
                        System.out.println("No hay alumnos en la lista.");
                    }
                    break;
                    
                case 8:
                    Optional<Alumno> primerAlumno = secretaria.obtenerPrimerAlumno();
                    if (primerAlumno.isPresent()) {
                        System.out.println("\n=== PRIMER ALUMNO ===");
                        System.out.println(primerAlumno.get());
                    } else {
                        System.out.println("No hay alumnos en la lista.");
                    }
                    break;
                    
                case 9:
                    System.out.print("Ingrese la longitud mínima del nombre: ");
                    int longitudMinima = scanner.nextInt();
                    scanner.nextLine();
                    List<Alumno> alumnosNombreLargo = secretaria.obtenerAlumnosNombreLongitudMayorA(longitudMinima);
                    System.out.println("\n=== ALUMNOS CON NOMBRE > " + longitudMinima + " letras ===");
                    alumnosNombreLargo.forEach(System.out::println);
                    break;
                    
                case 10:
                    System.out.print("Ingrese la longitud máxima del nombre: ");
                    int longitudMaxima = scanner.nextInt();
                    scanner.nextLine();
                    List<Alumno> alumnosA = secretaria.obtenerAlumnosLetraALongitudMenorIgualA(longitudMaxima);
                    System.out.println("\n=== ALUMNOS QUE EMPIEZAN POR 'A' Y NOMBRE <= " + longitudMaxima + " letras ===");
                    alumnosA.forEach(System.out::println);
                    break;
                    
                case 11:
                    System.out.println("\n=== AGREGAR NUEVO ALUMNO ===");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Nota media: ");
                    double nota = scanner.nextDouble();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    
                    secretaria.agregarAlumno(new Alumno(nombre, apellidos, curso, nota, edad));
                    System.out.println("Alumno agregado correctamente.");
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            
            if (opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n========== MENU SECRETARIA ==========");
        System.out.println("1. Obtener todos los alumnos");
        System.out.println("2. Mostrar todos los alumnos");
        System.out.println("3. Alumnos por letra inicial");
        System.out.println("4. Contar alumnos");
        System.out.println("5. Alumnos con nota mayor a 'X'");
        System.out.println("6. Primeros 3 alumnos");
        System.out.println("7. Alumno menor edad");
        System.out.println("8. Primer alumno");
        System.out.println("9. Alumnos con nombre de longitud mayor a 'X'");
        System.out.println("10. Alumnos que empiezan por 'A' y longitud menor o igual a 'X'");
        System.out.println("11. Agregar nuevo alumno");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
