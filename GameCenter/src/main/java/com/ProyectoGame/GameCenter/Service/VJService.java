package com.ProyectoGame.GameCenter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoGame.GameCenter.Modelo.Videojuego;
import com.ProyectoGame.GameCenter.Repository.JVRepository;

@Service
public class VJService {
    @Autowired
    private JVRepository jvRepository;

    public List<Videojuego> obtenerListaJuegos() {
        return jvRepository.obtenerListaJuegos();
    }

    public Videojuego obtenerJuegoPorId(int id) {
        return jvRepository.obtenerJuegoPorId(id);
    }
    public void guardarJuego(Videojuego juego) {
        jvRepository.guardarJuego(juego);
    }
    public void eliminarJuego(int id) {
        jvRepository.eliminarJuego(id);
    }
    public void actualizarJuego(Videojuego juegoActualizado) {
        jvRepository.actualizarJuego(juegoActualizado);
    }
}
