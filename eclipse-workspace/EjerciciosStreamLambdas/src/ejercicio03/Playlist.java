package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Playlist {
	
	private List<Cancion> canciones;
	
    public Playlist() {
        canciones = new ArrayList<>();
        inicializarDatos();
    }
    
    private void inicializarDatos() {
    	canciones.add(new Cancion("cancion1", "autorazo", 10.40, "Rock"));
    	canciones.add(new Cancion("cancion2", "autorito", 12.10, "Pop"));
    	canciones.add(new Cancion("cancion3", "autorazo", 3.50, "Metal"));
    	canciones.add(new Cancion("cancion4", "autoreando", 4.00, "Clasica"));
    	canciones.add(new Cancion("cancion5", "autorito", 6.40, "Lenta"));
    }
	
    public List<Cancion> obtenerPorNombre(String buscado) {
        return canciones.stream()
        		.filter(nombre -> nombre.getNombre().toUpperCase().equals(buscado))
        		.collect(Collectors.toList());
    }
    
    public List<Cancion> obtenerPorAutor(String buscAutor) {
    	return canciones.stream()
    			.filter(autor -> autor.getAutor().toUpperCase().equals(buscAutor))
    			.collect(Collectors.toList());
    }
    
    public List<Cancion> obtenerPorDuracion(double buscDuracion) {
    	return canciones.stream()
    			.filter(duracion -> duracion.getDuracion() == buscDuracion)
    			.collect(Collectors.toList()); 
    }
    
    public List<Cancion> obtenerGenero(String buscGenero) {
    	return canciones.stream()
    			.filter(genero -> genero.getGenero().toUpperCase().equals(buscGenero))
    			.collect(Collectors.toList()); 
    }
    
    public List<Cancion> obtenerDuracionMinima(int duracionDada) {
        return canciones.stream()
                .filter(duracion -> duracion.getDuracion() > duracionDada)
                .collect(Collectors.toList());
    }
    
    public List<Cancion> obtenerAutorDistinto() {
        return canciones.stream()
                .distinct()
                .collect(Collectors.toList());
    }
    
}
