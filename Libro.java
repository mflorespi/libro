/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tris;


public class Libro {
     
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeropaginas; 
    
    public Libro(){
        
    }
    public Libro(String titulo, String  autor,int ISBN, int numeropaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.ISBN = ISBN;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getISBN() {
        return this.ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }
    
    
}
