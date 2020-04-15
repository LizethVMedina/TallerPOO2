/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine1;

/**
 *
 * @author Lizeth
 */
public class Pelicula {
    private String nombrePeli, director,reseña;
    private int año;

    public Pelicula(String n, String d, String r, int a) {
        nombrePeli = n;
        director = d;
        reseña = r;
        año = a;
    }
    public String toString()
    {
        return ("Nombre"+nombrePeli+"\n Director"+director+"\nReseña"+reseña+"\nAño"+año);
    }
    
}
