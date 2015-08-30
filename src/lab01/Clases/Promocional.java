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
public class Promocional extends Producto {
    private boolean activa;
    private double descuento; //ver como se hace JoacoP(me imagino yo que seria un entero % y lo q se hace despues es a precio_total calcularsele ese descuento)

    public Promocional(boolean activa, double descuento) {
        super();
        //agregar los campos de los tb (q carajo son los tb? xD)
        this.activa = activa;
        this.descuento = descuento;
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

    public DataPromocional getDataPromo(){
        DataPromocional dPromo = new DataPromocional(this.isActiva(), this.getDescuento(), this.getDescripcion(), this.getNombre(), this.getPrecio(), this.getImagen()/*lo mismo q en el DataPromo*/);
        return dPromo;
    }

}
