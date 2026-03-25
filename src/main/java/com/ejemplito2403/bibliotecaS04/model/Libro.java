package com.ejemplito2403.bibliotecaS04.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int id;
    private String isbn;
    private String libro;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
