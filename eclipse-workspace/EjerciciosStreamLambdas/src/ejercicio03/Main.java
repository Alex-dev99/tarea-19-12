package ejercicio03;

import java.util.List;
import java.util.Scanner;

import ejercicio01.Alumno;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Playlist playlist = new Playlist();
		int opcion=-1;
		String nombre;
		do {
			 mostrarMenu();
	         opcion = scanner.nextInt();
	         scanner.nextLine();
	         
			switch (opcion) {
			case 1: {
				nombre =  scanner.next();
				List<Cancion> cancionesNombre = playlist.obtenerPorNombre(nombre);
				cancionesNombre.forEach(System.out::println);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 0);
		
	}
	
	 private static void mostrarMenu() {
	        System.out.println("\n========== MENU PLAYLIST ==========");
	        System.out.println("1. Obtener cancion por nombres");
	        System.out.println("2. Obtener cancion por autor");
	        System.out.println("3. Obtener cancion por duracion");
	        System.out.println("4. Obtener cancion por genero");
	        System.out.println("5. Obtener canciones por duracion minima");
	        System.out.println("6. Obtener autores");
	        System.out.println("0. Salir");
	        System.out.print("Seleccione una opción: ");
	    }
	
}
