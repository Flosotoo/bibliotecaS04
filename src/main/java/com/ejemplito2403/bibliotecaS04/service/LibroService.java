package com.ejemplito2403.bibliotecaS04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplito2403.bibliotecaS04.model.Libro;
import com.ejemplito2403.bibliotecaS04.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> readAll(){
        return libroRepository.obtenerLibros();
    }

    public Libro create(Libro libro) {
        return libroRepository.guardarLibro(libro);
    }

}
