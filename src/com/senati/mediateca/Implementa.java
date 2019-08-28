package com.senati.mediateca;

import java.util.HashSet;
import java.util.Set; //Java Colecciones: matrices, listas, arrays

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Añadir nuevos socios
		//Clase objeto=new Clase()
		
		//SOCIO
		Socio socio1=new Socio();
		socio1.id=100;
		socio1.nombre="Milene Allye";
		socio1.apellido="Pillman Haro";
		socio1.distrito="Comas";
		
		Socio socio2=new Socio();
		socio2.id=102;
		socio2.nombre="Karla Camila";
		socio2.apellido="Cabello Estrabao";
		socio2.distrito="Los Olivos";
		
		System.out.println(socio1.toString());
		System.out.println(socio2.toString());
		
		Socio socio3=new Socio(103,"Alicia","Gomez Avalos","Independencia");
		System.out.println(socio3.toString());
		
		//LIBRO
		Libro libro1=new Libro(125,"Carrie","Stephen King",40f, 500,123);
		System.out.println(libro1.toString());
		
		Libro libro2=new Libro(126,"Cien años de Soledad","Gabriel García Márquez",48f,600,124);
		System.out.println(libro2.toString());
		
		//AUDIO
				Cintaaudio cintaaudio1=new Cintaaudio(148,"Impossible","Shontelle",40f,"USA",3);
				System.out.println(cintaaudio1.toString());
				
				Cintaaudio cintaaudio2=new Cintaaudio(149,"Torn","Natalie Imbruglia",46f,"USA",3);
				System.out.println(cintaaudio2.toString());
				
		//VIDEO
				Cintavideo cintavideo1=new Cintavideo(198,"Fragmentado","M. Night Shyamalan",412f,"USA",1);
				System.out.println(cintaaudio1.toString());
				
				Cintavideo cintavideo2=new Cintavideo(199,"El sexto Sentido","M. Night Shyamalan",409f,"USA",1);
				System.out.println(cintaaudio2.toString());
		
		//Lista Socio
		System.out.println("Lista de socios");
		
		Socio soc1 = new Socio(104,"Jorge","Luque","Comas");
		Socio soc2 = new Socio(105,"Maria","Luna","Independencia");
		Socio soc3 = new Socio(106,"Gerardo","Luque","Los Olivos");
		Socio soc4 = new Socio(107,"Alberto","Perez","San Miguel");
		Socio soc5 = new Socio(108,"Alex","Lopez","San Borja");
		Set <Socio> sociosinscritos = new HashSet<Socio>();
		
		sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.distrito);
		}
		
		//Lista Libro
				System.out.println("Lista de libros");
				
				Libro lib1 = new Libro(127,"Alicia en el país de las Maravillas","Lewis Carroll",33f,300,125);
				Libro lib2 = new Libro(128,"It","Stephen King",37f,400,126);
				Libro lib3 = new Libro(129,"Asfixia","Alex Mírez",35f,500,127);
				Libro lib4 = new Libro(130,"La última Ola","Edgardo Mackay",30f,200,128);
				Libro lib5 = new Libro(131,"La Divina Comedia","Dante Alighieri",45f,600,129);
				Set <Libro> librosprestados = new HashSet<Libro>();
				
				librosprestados.add(lib1);
				librosprestados.add(lib2);
				librosprestados.add(lib3);
				librosprestados.add(lib4);
				librosprestados.add(lib5);
				
				byte contador=0;
				float preciototal=0f;	
				for (Libro libro : librosprestados) {
					System.out.println(libro.id + " " + libro.titulo + " " + libro.autor + " " + libro.precio + libro.nropag + libro.nroisbn);
					contador++;
					preciototal=preciototal+libro.precio;
				}
				System.out.println("Libros prestados: "+contador);
				System.out.println("Monto acumulado: "+preciototal);
				
		//Lista Cintaaudio
				System.out.println("Lista de audios");
				
				Cintaaudio aud1 = new Cintaaudio(150,"Karma Police","RadioHead",35f,"USA",3);
				Cintaaudio aud2 = new Cintaaudio(151,"Without me","Halsey",38f,"USA",4);
				Cintaaudio aud3 = new Cintaaudio(152,"Señorita","Camila Cabello, Shawn Mendes",39f,"USA",3);
				Cintaaudio aud4 = new Cintaaudio(153,"De música ligera","Soda Stereo",40f,"Argentina",4);
				Cintaaudio aud5 = new Cintaaudio(154,"Fireworks","Katy Perry",25f,"USA",3);
				Set <Cintaaudio> audiosregistrados = new HashSet<Cintaaudio>();
				
				audiosregistrados.add(aud1);
				audiosregistrados.add(aud2);
				audiosregistrados.add(aud3);
				audiosregistrados.add(aud4);
				audiosregistrados.add(aud5);
				
				for (Cintaaudio audio : audiosregistrados) {
					System.out.println(audio.id + " " + audio.titulo + " " + audio.autor + " " + audio.precio + audio.lugar + " " + audio.duracion);
				}
				
		//Lista Cintavideo
				System.out.println("Lista de videos");
				
				Cintavideo vid1 = new Cintavideo(200,"El laberinto del Fauno","Guillermo del Toro",50f,"Ivana Baquero, Doug Jones, Sergi López",1);
				Cintavideo vid2 = new Cintavideo(201,"Ted Bundy","Matthew Bright",59f,"Zack Efron, Lily Collins",2);
				Cintavideo vid3 = new Cintavideo(202,"Dora y la ciudad perdida","James Bobin",56f,"Isabela Moner, Eva Longoria, Eugenio Derbez",1);
				Cintavideo vid4 = new Cintavideo(203,"It: Chapter Two","Andrés Muschietti",54f,"Jessica Chastain, James McAvoy",1);
				Cintavideo vid5 = new Cintavideo(204,"Glass","M. Night, Shyamalan",80f,"James McAvoy, Anya Taylor-Joy",1);
				Set <Cintavideo> videosregistrados = new HashSet<Cintavideo>();
				
				videosregistrados.add(vid1);
				videosregistrados.add(vid2);
				videosregistrados.add(vid3);
				videosregistrados.add(vid4);
				videosregistrados.add(vid5);
				
				for (Cintavideo video : videosregistrados) {
					System.out.println(video.id + " " + video.titulo + " " + video.autor + " " + video.precio + video.actores + " " + video.duracion);
				}
				
				
	}

}
