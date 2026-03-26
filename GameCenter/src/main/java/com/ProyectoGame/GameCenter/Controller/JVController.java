package com.ProyectoGame.GameCenter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGame.GameCenter.Modelo.Videojuego;
import com.ProyectoGame.GameCenter.Service.VJService;

@RestController
@RequestMapping("/api/juegos")
public class JVController {
    @Autowired
    private VJService vjService;

    @GetMapping()
    public List<Videojuego> listarJuegos() {
        return vjService.obtenerListaJuegos();
    }

    @PostMapping()
    public void guardarJuego(@RequestBody Videojuego juego) {
        vjService.guardarJuego(juego);
    }

    @GetMapping("/buscar/{id}")
    public Videojuego buscarJuegoPorId(@PathVariable int id) {
        return vjService.obtenerJuegoPorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public Videojuego actualizarVJ(@PathVariable int id, @RequestBody Videojuego juegoActualizado) {
        return vjService.obtenerJuegoPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarJuego(@PathVariable int id) {
        vjService.eliminarJuego(id);
    }
}
