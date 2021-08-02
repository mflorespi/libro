/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tris;




public class LibreriaApp {

    
    public static void main(String[] args) {
        Libro l1 = new Libro();
        LibroServicio flor = new LibroServicio();
        flor.cargarlibro(l1);
        flor.imprimir(l1);
        
        
        LibroServicio.ejemplo(7);
    }
   
}