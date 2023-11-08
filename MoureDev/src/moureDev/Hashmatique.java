package moureDev;

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	public static void main(String[] args) {
		//Generá la base del llamado de las canciones 
		HashMap<String, String> song = new HashMap<String, String>();
		
		//Cargar canciones
		song.put("song1", "Lala\n");
		song.put("song2", "Me cortaron mal el pelo\n");
		song.put("song3", "Tangananica-Tangananá\n");
		song.put("song4", "Diente blanco, no te vayas\n");
		song.put("song5", "Mi muñeca me habló\n");
		
		//Extraer Canción por su titulo
		System.out.println(song.get("song1"));
		
		
		Set<String> claves = song.keySet();
		
		//Mostrar todas los nombres de las pistas y las letras
		for(String clave : claves) {
			System.out.println("titulo = " + clave);
			System.out.println("Nombre de la canción = " + song.get(clave));
		}

	}

}
