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
//enum estados {PREPARACION, ENVIADO, RECIBIDO};

public class Pedido {
    private int id; // ver como hacer el autogenerado
    private int fecha; // ver como hacer la fecha si con el jcalendar esta fecha tiene que ser la del momento en q se crea el objeto(la del sistema)
    private double precio_total;
    private estados estado;

    public Pedido(int id, int fecha, double precio_total, estados estado) {
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
    
    public DataPedido getDataPedido(){
        DataPedido dp = new DataPedido(this.getId(), this.getFecha(), this.getPrecio_total(), this.getEstado());
        return dp;
    }
    
}
