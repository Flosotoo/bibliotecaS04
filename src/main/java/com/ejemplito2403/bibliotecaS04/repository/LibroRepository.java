package com.ejemplito2403.bibliotecaS04.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ejemplito2403.bibliotecaS04.model.Libro;

//Configurar librerias
@Repository
public class LibroRepository {
    //Equipar List
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    public Libro guardarLibro(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }
}
