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
        for (Videojuego juego : ListaJuegos) {   //forma de recorrer la lista
            if (juego.getId() == id) { //si la id es igual retorna el juego
                return juego;
            }
        }
        return null; //si no encuentra el juego retorna null
    }
    
    public void guardarJuego(Videojuego juego) {
        ListaJuegos.add(juego);
    }

    public void eliminarJuego(int id) {
        Videojuego juego = obtenerJuegoPorId(id); //busca el juego por id
        if (juego != null) { //si el juego existe lo elimina
            ListaJuegos.remove(juego);
        }
    }

    public void actualizarJuego(Videojuego juegoActualizado) {
        int idjuego = 0;
        int idPosicion = 0;

        for (int i = 0; i < ListaJuegos.size(); i++) { //recorre la lista de juegos
            if (ListaJuegos.get(i).getId() == juegoActualizado.getId()) { //si encuentra el juego por id
                idjuego = ListaJuegos.get(i).getId(); //asigna el id del juego encontrado a la variable idjuego
                idPosicion = i; //asigna la posición del juego encontrado a la variable idPosicion
                break; //sale del ciclo
            }
        }

        Videojuego juegoCambio = new Videojuego();
        juegoCambio.setId(idjuego); //asigna el id del juego encontrado al juego actualizado
        juegoCambio.setCodigo(juegoActualizado.getCodigo()); //asigna el codigo del juego
        juegoCambio.setTitulo(juegoActualizado.getTitulo()); //asigna el titulo del juego
        juegoCambio.setConsola(juegoActualizado.getConsola()); //asigna
        juegoCambio.setAnioLanzamiento(juegoActualizado.getAnioLanzamiento()); //asigna el año de lanzamiento del juego
        juegoCambio.setPrecio(juegoActualizado.getPrecio()); //asigna el precio del juego
    }

}
