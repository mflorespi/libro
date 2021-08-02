/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tris;

import java.util.Scanner;


public class LibroServicio {
    
    public void cargarlibro(Libro libro){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese título");
        libro.setTitulo(scan.nextLine()); 
        System.out.println("Ingrese autor");
        libro.setAutor(scan.nextLine());
        System.out.println("Ingrese ISBN");
        libro.setISBN(scan.nextInt());
        System.out.println("Ingrese número de páginas");
        libro.setNumeropaginas(scan.nextInt());
    }
    
    
    public void imprimir(Libro libro){
        
        System.out.println("Titulo: "+ libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getISBN() + " y el numéro de páginas es: " + libro.getNumeropaginas());
    }
    
    
    public static void ejemplo(int num){
        System.out.println("Número " + num);
        
    }
    
}
