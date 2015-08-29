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
public class DataPedido {
    private int id;
    private int fecha; //ver q historia con eso...
    private double precio_total;
    private estados estado;
    
    public DataPedido(int id, int fecha, double precio_total, estados estado){
        this.id = id;
        this.fecha = fecha;
        this.precio_total = precio_total;
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public estados getEstado() {
        return estado;
    }

    public void setEstado(estados estado) {
        this.estado = estado;
    }
    
}
