/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author joaco
 */
public class DataPromocional {
    private boolean activa;
    private double descuento;
    //deveria tener una lista de DataIndividual los cuales componen la promo...
    
    public DataPromocional(boolean activa, double descuento/*aca podria ir una lista de dataindividual*/){
        this.activa = activa;
        this.descuento = descuento;
        //y pasarsela obviamente
    }
    
    public void setActiva(boolean activa){
        this.activa = activa;
    }
    
    public boolean getActiva(){
        return activa;
    }
    
    public void setDescuento(double descuento){
        this.descuento = descuento;
    }
    
    public double getDescuento(){
        return descuento;
    }
    
    /*aca podriamos agregar uno x uno o pasarle un contenedor con los datos ya cargados
    y tambien devolverlos*/
}
