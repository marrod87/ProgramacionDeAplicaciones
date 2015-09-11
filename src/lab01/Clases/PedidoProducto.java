/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author joaquin
 */
public class PedidoProducto {
    private Producto producto;
    private int cantidad;

public PedidoProducto(Producto p, int cant){
    this.producto=p;
    this.cantidad=cant;
}
public String getNombre(){
    return this.producto.getNombre();
}
public Producto getProducto(){
    return this.producto;
}
public int getCantidad(){
    return this.cantidad;
}
}