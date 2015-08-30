/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import lab01.Clases.DataProducto;

/**
 *
 * @author gonzalo
 */
public interface ICtrlProducto {
    
    public abstract void registrarProducto(DataProducto dp, String nomRest, boolean promocional);
    public abstract boolean existeRestaurante(String nomRest);
}
