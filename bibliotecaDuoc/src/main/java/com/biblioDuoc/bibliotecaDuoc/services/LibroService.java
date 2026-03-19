package com.biblioDuoc.bibliotecaDuoc.services;


import com.biblioDuoc.bibliotecaDuoc.model.Libro;
import com.biblioDuoc.bibliotecaDuoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id) {
        libroRepository.eliminar(id);
        return "producto eliminado";
    }

    public int totalLibros() {
        return libroRepository.obtenerLibros().size();
    }
}
