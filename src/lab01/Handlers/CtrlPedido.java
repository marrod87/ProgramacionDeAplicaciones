/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lab01.Clases.Cliente;
import lab01.Clases.DataCliente;
import lab01.Interfaces.ICtrlPedido;
import lab01.Clases.DataCategoria;
import lab01.Clases.Categoria;

/**
 *
 * @author gera
 */
public class CtrlPedido implements ICtrlPedido {
    
    private String nickname;
    private String categoria;
    
    
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
}
