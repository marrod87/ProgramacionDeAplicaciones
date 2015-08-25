/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author gera
 */
public class HCategoria {
    private static HCategoria instancia=null;
    private Map ColCategoria;
    
    private HCategoria(){
       ColCategoria =new HashMap();
    }
    
    
    public static HCategoria getinstance(){
        if (instancia==null)
            instancia = new HCategoria();
        return instancia;
    }
}    