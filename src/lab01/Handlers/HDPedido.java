/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import java.util.HashMap;
import java.util.Map;
import lab01.Clases.DataPedido;

/**
 *
 * @author joaco
 */
public class HDPedido {
    private static HDPedido instancia = null;
    private Map ColDatPedido;
    
    private HDPedido(){
        ColDatPedido = new HashMap();
    }
    
    public static HDPedido getInstance(){
        if(instancia == null)
            instancia = new HDPedido();
        return instancia;
    }
    
    public void addDataPedido(DataPedido dp){
        ColDatPedido.put(dp.getId(), dp);
    }
    
    public boolean member(double id){
        return ColDatPedido.containsKey(id);
    }
    
    public Map obtenerColeccion(){
        return this.ColDatPedido;
    }
}