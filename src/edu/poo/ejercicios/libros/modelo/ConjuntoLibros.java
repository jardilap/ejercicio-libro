/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poo.ejercicios.libros.modelo;
import edu.poo.ejercicios.libros.modelo.Libro;


public class ConjuntoLibros {
    private Libro libros[];
    
    public ConjuntoLibros(){
        libros = new Libro[10];
    }
    
    public boolean anadirLibro(String autor, String titulo, int paginas, double clasificacion){
        for(int i = 0; i<10; i++){
            if(libros[i]==null){
                Libro l1 = new Libro(titulo, autor, paginas, clasificacion);
                return true;
            }
        }
        return false;
    }
}
