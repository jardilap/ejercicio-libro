/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poo.ejercicios.libros.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double clasificacion;

    public Libro(String titulo, String autor, int paginas, double clasificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getPaginas() {
        return paginas;
    }


    public double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(double clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    
}
