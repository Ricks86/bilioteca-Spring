package com.ProyectoGame.GameCenter.Modelo;



public class Videojuego {

    private static int contadorId = 0;
    
    private int id;
    private String codigo;
    private String titulo;
    private String consola;
    private int anioLanzamiento;
    private double precio;

    public Videojuego(String codigo, String titulo, String consola, int anioLanzamiento, double precio) {
        this.id = ++contadorId; 
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.anioLanzamiento = anioLanzamiento;
        this.precio = precio;
    }

    public Videojuego() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConsola() {
        return consola;
    }
    public void setConsola(String consola) {
        this.consola = consola;
    }
    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
