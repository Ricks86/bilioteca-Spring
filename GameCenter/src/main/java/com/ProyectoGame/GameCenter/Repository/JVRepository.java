package com.ProyectoGame.GameCenter.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProyectoGame.GameCenter.Modelo.Videojuego;

@Repository
public class JVRepository {
    private List<Videojuego> ListaJuegos = new ArrayList<>();

    public JVRepository() {
        ListaJuegos.add(new Videojuego("CODMW", "Call of Duty: Modern Warfare", "PS4", 2019, 59.99));
        ListaJuegos.add(new Videojuego("FIFA22", "FIFA 22", "Xbox One", 2021, 49.99));
        ListaJuegos.add(new Videojuego("MARIOKART8", "Mario Kart 8 Deluxe", "Nintendo Switch", 2017, 59.99));
        ListaJuegos.add(new Videojuego("GOW", "God of War", "PS4", 2018, 39.99));
        ListaJuegos.add(new Videojuego("HALO5", "Halo 5: Guardians", "Xbox One", 2015, 29.99));  
        ListaJuegos.add(new Videojuego("ZELDA", "The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 2017, 59.99)); 
        ListaJuegos.add(new Videojuego("RDR2", "Red Dead Redemption 2", "PS4", 2018, 59.99));    
        ListaJuegos.add(new Videojuego("FORZA7", "Forza Motorsport 7", "Xbox One", 2017, 49.99));
        ListaJuegos.add(new Videojuego("ANIMALCROSSING", "Animal Crossing: New Horizons", "Nintendo Switch", 2020, 59.99));
        ListaJuegos.add(new Videojuego("SPIDERMAN", "Marvel's Spider-Man", "PS4", 2018, 39.99));
    }

    public List<Videojuego> obtenerListaJuegos() {
        return ListaJuegos;
    }
    
    public Videojuego obtenerJuegoPorId(int id) {
        for (Videojuego juego : ListaJuegos) {  
            if (juego.getId() == id) { 
                return juego;
            }
        }
        return null; 
    }
    
    public void guardarJuego(Videojuego juego) {
        ListaJuegos.add(juego);
    }

    public void eliminarJuego(int id) {
        Videojuego juego = obtenerJuegoPorId(id); 
        if (juego != null) { 
            ListaJuegos.remove(juego);
        }
    }

    public void actualizarJuego(Videojuego juegoActualizado) {
        int idjuego = 0;
        int idPosicion = 0;

        for (int i = 0; i < ListaJuegos.size(); i++) { 
            if (ListaJuegos.get(i).getId() == juegoActualizado.getId()) { 
                idjuego = ListaJuegos.get(i).getId(); 
                idPosicion = i;
                break; 
            }
        }

        Videojuego juegoCambio = new Videojuego();
        juegoCambio.setId(idjuego);
        juegoCambio.setCodigo(juegoActualizado.getCodigo()); 
        juegoCambio.setTitulo(juegoActualizado.getTitulo()); 
        juegoCambio.setConsola(juegoActualizado.getConsola()); 
        juegoCambio.setAnioLanzamiento(juegoActualizado.getAnioLanzamiento()); 
        juegoCambio.setPrecio(juegoActualizado.getPrecio());
    }

}
