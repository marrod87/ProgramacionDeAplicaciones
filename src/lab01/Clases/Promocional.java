/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gera
 */
public class Promocional extends Producto {
    private boolean activa;
    private double descuento; //ver como se hace JoacoP(me imagino yo que seria un entero % y lo q se hace despues es a precio_total calcularsele ese descuento)
    private ArrayList<Cantidad_Individual> ColCantIndividual;
    
    public Promocional(String nombre, String descripcion, double precio, boolean activa, double descuento, ArrayList<Cantidad_Individual> ColCantIndividual) {
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

    public ArrayList<Cantidad_Individual> getColCantIndividual(){
        return this.ColCantIndividual;
    }
    
    public void setCantIndividual(Cantidad_Individual cantInd){
        this.ColCantIndividual.add(cantInd);
    }
    
    public void setColCantIndividual(ArrayList<Cantidad_Individual> ColCantIndividual){
        this.ColCantIndividual = ColCantIndividual;
    }
    
    public DataPromocional getDataPromo(){
        Map ColDatIndividual = new HashMap();
        for(Cantidad_Individual ci: ColCantIndividual){
            DataIndividual di = ci.getProdIndividual().getDataIndividual();
            ColDatIndividual.put(di.getDataNombre(), di);
        }
        DataPromocional dPromo = new DataPromocional(this.isActiva(), this.getDescuento(), this.getDescripcion(), this.getNombre(), this.getPrecio(), this.getImagen(), ColDatIndividual);
        return dPromo;
    }
    
    @Override
    public DataCarrito getDataCarrito(int cantidad){
        DataCarrito dc = new DataCarrito(this.getNombre(), true, cantidad, this.getPrecio());
        return dc;
    }
    
    @Override
    public boolean prodDisponible(int cantidad){
        for(Cantidad_Individual ci: ColCantIndividual){
            int aux = ci.getProdIndividual().getProdStock().getCantidad() * cantidad;
            if(ci.getProdIndividual().prodDisponible(aux)){
                continue;
            }
            try {
                throw new Exception("Stock Insuficiente...");
            } catch (Exception ex) {
                Logger.getLogger(Promocional.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
    
    @Override
    public void restarStock(int cantidad){
        for(Cantidad_Individual ci: ColCantIndividual){
            int aux = ci.getProdIndividual().getProdStock().getCantidad() * cantidad;
            int aux2 = ci.getProdIndividual().getProdStock().getCantidad() - aux;
            ci.getProdIndividual().getProdStock().setCantidad(aux2);
        }
    }
}
