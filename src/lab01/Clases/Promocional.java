/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import java.util.Map;

/**
 *
 * @author gera
 */
public class Promocional extends Producto {
    private boolean activa;
    private double descuento; //ver como se hace JoacoP(me imagino yo que seria un entero % y lo q se hace despues es a precio_total calcularsele ese descuento)
    private Map ColCantIndividual;
    
    public Promocional(String nombre, String descripcion, double precio, boolean activa, double descuento, Map ColCantIndividual) {
        super(nombre, descripcion, precio,1);
        this.activa = activa;
        this.descuento = descuento;
        this.ColCantIndividual = ColCantIndividual;
    }//ver como se hace

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public DataPromocional getDataPromo(Map ColDatIndividual){
        DataPromocional dPromo = new DataPromocional(this.isActiva(), this.getDescuento(), this.getDescripcion(), this.getNombre(), this.getPrecio(), this.getImagen(), ColDatIndividual);
        return dPromo;
    }

}
