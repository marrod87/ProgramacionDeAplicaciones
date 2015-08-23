/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import java.util.HashMap;

/**
 *
 * @author gera
 */
public class HCategorias {
    private static HCategorias instancia=null;
    
    
    public static HCategorias getinstance(){
        if (instancia==null)
            instancia = new HCategorias();
        return instancia;
    }
}    