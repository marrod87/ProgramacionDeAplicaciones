/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lab01.Clases.Cliente;
import lab01.Clases.DataCarrito;
import lab01.Clases.DataCliente;
import lab01.Clases.Restaurante;
import lab01.Clases.DataRestaurante;
import lab01.Interfaces.ICtrlPedido;
import lab01.Clases.DataCategoria;
import lab01.Clases.DataIndividual;
import lab01.Clases.DataProducto;
import lab01.Clases.DataPromocional;
import lab01.Clases.Individual;
import lab01.Clases.Producto_Stock;
import lab01.Clases.Promocional;

/**
 *
 * @author gera
 */
public class CtrlPedido implements ICtrlPedido {
    
    private String nickname;
    private String categoria;
    private Restaurante memRestaurante;
    private double monto;
    private Map ColDataCarrito;
    private ArrayList<Producto_Stock> carrito;
    
    public CtrlPedido(){}
    
    @Override
    public void setNickname(String nick){
        this.nickname=nick;
    }
    public String getNickname(){
        return this.nickname;
    }
    public void setCat(String nombre){
        this.categoria=nombre;
    }
    public String getCat(){
        return this.categoria;
    }
    
    public Map getColDataCarrito(){
        return this.ColDataCarrito;
    }
    
    public void setDataCarrito(DataCarrito dc){
        this.ColDataCarrito.put(dc.getNomProd(), dc);
    }
    
    public void setColDataCarrito(Map ColDataCarrito){
        this.ColDataCarrito = ColDataCarrito;
    }
    
    public ArrayList<Producto_Stock> getCarrito(){
        return this.carrito;
    }
    
    public void addCarrito(Producto_Stock pd){
        this.carrito.add(pd);
    }
    
    public void setCarrito(ArrayList<Producto_Stock> carrito){
        this.carrito = carrito;
    }
    
    public double getMonto(){
        return this.monto;
    }
    
    @Override
    public void setMonto(){
        double suma = 0;
        Iterator<DataCarrito> it = this.getColDataCarrito().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            DataCarrito dc = (DataCarrito)map.getValue();
            suma = suma + dc.getPrecio();
        }
        this.monto = suma;
    }
    
    @Override
    public Map devListaDC(){
        HUsuario mu = HUsuario.getinstance();
        Map ret = new HashMap();
        Map col = mu.obtenerColeccion();
        Iterator it = col.entrySet().iterator(); 
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            if(map.getValue() instanceof Cliente){
                Cliente cli = (Cliente)map.getValue();
                DataCliente dc = cli.ClienteADC();
                ret.put(dc.getNickname(), dc);
            }
        }
    return ret;
    }
    public Map retColDCat(){
        Map col;       
        Map ret = new HashMap();
        HCategoria hc = HCategoria.getinstance();
        col=hc.obtenerColeccion();
        Iterator it = col.entrySet().iterator(); 
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
                DataCategoria dc = (DataCategoria)map.getValue();
                ret.put(dc.getNombre(), dc);
        }
    return (Map)ret;    
    }
    
    @Override
    public Map devListaDR(){
        HUsuario mu = HUsuario.getinstance();
        Map ret = new HashMap();
        Map col = mu.obtenerColeccion();
        Iterator it = col.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            if(map.getValue() instanceof Restaurante){
                Restaurante rest = (Restaurante)map.getValue();
                if(rest.member(this.categoria)){
                    DataRestaurante dr = rest.RestauranteADR();
                    ret.put(dr.getNickname(), dr);
                }
            }
        }
        return ret;
    }

    @Override
    public boolean setMemRestaurante(String nickname){
        HUsuario mu = HUsuario.getinstance();
        if(mu.exists(nickname)){
            this.memRestaurante = mu.obtenerRestaurante(nickname);
            return true;
        }
        return false;
    }
    
    @Override
    public DataProducto devListaProductos(){
        DataProducto dp = new DataProducto();
        Map prods = this.memRestaurante.obtenerListaProductos();
        Iterator it = prods.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry map = (Map.Entry) it.next();
            if(map.getValue() instanceof Individual){
                Individual ind = (Individual)map.getValue();
                DataIndividual di = ind.getDataIndividual();
                dp.setDatIndividual(di);
                
            }
            if(map.getValue() instanceof Promocional){
                Promocional prom = (Promocional)map.getValue();
                DataPromocional dprom = prom.getDataPromo();
                dp.setDatPromocional(dprom);
            }
        }
        return dp;
    }
    
    @Override
    public void selectProductos(String nombre, int cantidad) throws Exception{//esto va en un loop en la interfaz
        DataCarrito dc = this.memRestaurante.agregarProducto(nombre, cantidad);
        this.setDataCarrito(dc);
        Producto_Stock prodStock = this.memRestaurante.getProdCarrito(nombre);
        this.addCarrito(prodStock);
    }
}
