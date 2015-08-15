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
public class Promocional {
    private boolean activa;
    private double descuento; //ver como se hace

    public Promocional(boolean activa, double descuento) {
        super();
        //agregar los campos de los tb
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

    

    
    
}
