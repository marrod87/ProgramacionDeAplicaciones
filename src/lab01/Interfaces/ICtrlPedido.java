/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Interfaces;

import java.util.Map;
import lab01.Clases.DataProducto;

/**
 *
 * @author joaquin
 */
public interface ICtrlPedido {
    
    public abstract void setNickname(String nick);
    public abstract void setCat(String nombre);
    public abstract String getCat();
    public abstract String getNickname();
    public abstract Map devListaDC();
    public abstract Map devListaDR();
    public abstract boolean setMemRestaurante(String nickname);
    public abstract Map retColDCat();
    public abstract DataProducto devListaProductos();
}
