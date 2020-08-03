package com.example.orion.albums;

/**
 * Created by Orion on 18/03/2017.
 */

public class Album {
    String titulo;
    String artista;
    Integer anio;
    Integer foto;
    String resumen;

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Album(String titulo, String artista, Integer anio, Integer foto, String resumen){
        this.titulo=titulo;
        this.artista=artista;
        this.anio=anio;
        this.foto=foto;
        this.resumen=resumen;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }

    public Integer getAnio(){
        return anio;
    }

    public Integer getFoto(){
        return foto;
    }
}
