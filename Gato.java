
package com.mycompany.animales;

/**
 *
 * @author Aaron
 */
public class Gato{
    
    String nombre;
    int edad; 
    String raza;
    public Gato(String nombre, int edad, String raza) {  
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }
    public void maullar ( ){
       System.out.println(this.nombre + "Emepezo a maullar");
       
    }
        
        
}