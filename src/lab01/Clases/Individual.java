/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author gera
 */
public class Individual extends Producto {

//    public Individual() {
//        super();
//        // crear con los campos de los tb
//    }
    public Individual(String nombre, String descripcion, double precio) {
       
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        
        
    }
    
    public Individual(String nombre, String descripcion, double precio, String img) {
        
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setImagen(img);
        
    }
    
    public DataIndividual getDataIndividual(){
        DataIndividual dIndividual = new DataIndividual(this.getDescripcion(), this.getNombre(), this.getPrecio(), this.getImagen());
        return dIndividual;
    }
    
}
