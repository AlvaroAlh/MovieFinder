package movieFinder.api.test;

import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import movieFinder.modelo.Actor;
import movieFinder.modelo.AudioVisual;
import movieFinder.modelo.Pelicula;
import movieFinder.modelo.Playlist;
import movieFinder.modelo.Serie;
import movieFinder.modelo.Song;
import movieFinder.modelo.Tipo;


public class MovieFinderTest {
	
	private final AudioVisual av = new AudioVisual();
	
	
	MovieFinderResource movieFinder = new MovieFinderResource();
	
	@Test
	public void testGetAudiovisuales() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll audiovisual");
		AudioVisual[] res = movieFinder.getAudiovisuales();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de audiovisuales no puede ser null", res);

	}
	
	@Test
	public void testGetAudiovisualesId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get audiovisual");
		AudioVisual res = movieFinder.getAudiovisuales("av21");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostAudiovisuales() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post audiovisual");
		AudioVisual av = new AudioVisual();
		List<Actor> l = new ArrayList<>();
		Tipo t = new Tipo();
		Serie s = new Serie();
		Actor a = new Actor();
		Playlist p = new Playlist();
		p.setName("Prueba");
		a.setNombre("Prueba");
		l.add(a);
		s.setCanal("HBO");
		s.setTemporadas(1);
		s.setEstreno("Prueba");
		s.setUltFechaEmision("Prueba");
		t.setSerie(s);
		av.setSoundtrack(p);
		av.setActores(l);
		av.setTipo(t);
		av.setName("PRUEBA");
		
		String res = movieFinder.insertAudioVisual(av);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id del audiovisual no puede ser null", res);

	}
	
	/*@Test
	public void testPutAudiovisuales() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put audiovisual");
		AudioVisual av = new AudioVisual();
		av.setName("PRUEBA2");
		av.setId("av25");
		
		String res = movieFinder.updateAudioVisual(av);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id del audiovisual no puede ser null", res);

	}
	
	@Test
	public void testDeleteAudiovisuales() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete audiovisual");
		String res = movieFinder.deleteAudioVisual("av25");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id del audiovisual no puede ser null", res);

	}*/
	
	@Test
	public void testGetSeries() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll serie");
		Serie[] res = movieFinder.getSeries();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de series no puede ser null", res);

	}
	
	@Test
	public void testGetSerieId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get serie");
		Serie res = movieFinder.getSeries("s18");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostSerie() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post serie");
		Serie s = new Serie();
		s.setCanal("HBO");
		s.setTemporadas(1);
		s.setEstreno("Prueba");
		s.setUltFechaEmision("Prueba");
		
		String res = movieFinder.insertSerie(s);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la serie no puede ser null", res);

	}
	
	/*@Test
	public void testPutSerie() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put serie");
		Serie s = new Serie();
		s.setCanal("Prueba");
		s.setId("s31");
		
		String res = movieFinder.updateSerie(s);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la serie no puede ser null", res);

	}
	
	@Test
	public void testDeleteSerie() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete serie");
		String res = movieFinder.deleteSerie("s31");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la serie no puede ser null", res);

	}*/
	
	@Test
	public void testGetPeliculas() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll pelicula");
		Pelicula[] res = movieFinder.getPeliculas();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de peliculas no puede ser null", res);

	}
	
	@Test
	public void testGetPeliculaId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get pelicula");
		Pelicula res = movieFinder.getPeliculas("pe17");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostPelicula() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post pelicula");
		Pelicula p = new Pelicula();
		p.setDirector("Christopher Nolan");
		p.setFechaEstreno("12-09-1999");
		
		String res = movieFinder.insertPelicula(p);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la pelicula no puede ser null", res);

	}
	
	/*@Test
	public void testPutPelicula() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put pelicula");
		Pelicula p = new Pelicula();
		p.setDirector("Christopher Nolan");
		p.setId("p35");
		
		String res = movieFinder.updatePelicula(p);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la pelicula no puede ser null", res);

	}
	
	@Test
	public void testDeletePelicula() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete pelicula");
		String res = movieFinder.deletePelicula("pe35");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La id de la pelicula no puede ser null", res);

	}*/
	
	@Test
	public void testGetActores() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll actor");
		Actor[] res = movieFinder.getActores();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de actores no puede ser null", res);

	}
	
	@Test
	public void testGetActoresId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get actor");
		Actor res = movieFinder.getActores("a14");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostActor() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post actor");
		Actor a = new Actor();
		a.setNombre("Alvaro");
		a.setFechaNacimiento("12-09-1999");
		a.setNacionalidad("Española");
		
		String res = movieFinder.insertActor(a);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de actor no puede ser null", res);

	}
	
	/*@Test
	public void testPutActor() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put actor");
		Actor a = new Actor();
		a.setNombre("Prueba");
		a.setId("a42");
		
		String res = movieFinder.updateActor(a);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de actor no puede ser null", res);

	}
	
	@Test
	public void testDeleteActor() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete actor");
		String res = movieFinder.deleteActor("a41");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de actor no puede ser null", res);

	}*/
	
	@Test
	public void testGetSongs() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll song");
		Song[] res = movieFinder.getSongs();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de songs no puede ser null", res);

	}
	
	@Test
	public void testGetSongsId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get song");
		Song res = movieFinder.getSongs("so11");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostSong() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post song");
		Song s = new Song();
		s.setTitle("La vida moderna");
		s.setArtist("Ser");
		s.setYear("2015");
		
		String res = movieFinder.insertSong(s);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de song no puede ser null", res);

	}
	
	/*@Test
	public void testPutSong() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put song");
		Song s = new Song();
		s.setTitle("Prueba");
		s.setId("so45");
		
		String res = movieFinder.updateSong(s);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de song no puede ser null", res);

	}
	
	@Test
	public void testDeleteSong() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete song");
		String res = movieFinder.deleteSong("so45");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de song no puede ser null", res);

	}*/
	
	@Test
	public void testGetPlaylists() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando getAll playlist");
		Playlist[] res = movieFinder.getPlaylists();

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La lista de playlists no puede ser null", res);

	}
	
	@Test
	public void testGetPlaylistsId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get playlist");
		Playlist res = movieFinder.getPlaylists("p12");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostPlaylist() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post playlist");
		Playlist p = new Playlist();
		p.setName("La resistencia");
		p.setDescription("Es lo que hago mientras veo esto");
		
		String res = movieFinder.insertPlaylist(p);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de playlist no puede ser null", res);

	}
	
	/*@Test
	public void testPutPlaylist() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando put playlist");
		Playlist p = new Playlist();
		p.setId("p46");
		p.setName("LaVidaModerna");
		
		String res = movieFinder.updatePlaylist(p);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de playlist no puede ser null", res);

	}
	
	@Test
	public void testDeletePlaylist() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando delete playlist");
		String res = movieFinder.deletePlaylist("p46");
		
		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de playlist no puede ser null", res);

	}*/
	
	@Test
	public void testGetTipoId() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando get tipo");
		Tipo res = movieFinder.getTipo("t20");

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("La respuesta no puede ser null", res);

	}
	
	@Test
	public void testPostTipo() throws UnsupportedEncodingException {
		System.out.println("Test MovieFinder: Probando post tipo");
		Tipo t = new Tipo();
		Pelicula p = new Pelicula();
		Serie s = new Serie();
		p.setDirector("Angelillo");
		s.setCanal("Fuerza Ecijana");
		s.setEstreno("26-5-19");
		t.setPelicula(p);
		t.setSerie(s);
		
		String res = movieFinder.insertTipo(t);
		

		if (res.equals(null)) {
			res = null;
		}
		if (res != null) {
			System.out.println("Encontrado Correctamente");
		}

		assertNotNull("El id de tipo no puede ser null", res);

	}

}
