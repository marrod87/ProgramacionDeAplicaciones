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
    public Individual(String nombre, String descripcion, double precio, int cantidad) {
        super(nombre,descripcion,precio,cantidad);
        /*this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setCantidad(cantidad); // seteo la cantidad de ese producto en el stock
*/
    }

    /*public Individual(String nombre, String descripcion, double precio, String img) {
        super();
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setImagen(img);
        //this.setCantidad(cantidad);

    }*/

    public DataIndividual getDataIndividual() {
        DataIndividual dIndividual = new DataIndividual(this.getNombre(), this.getDescripcion(), this.getPrecio(), this.getImagen(), this.getCantidad());
        return dIndividual;
    }

}
