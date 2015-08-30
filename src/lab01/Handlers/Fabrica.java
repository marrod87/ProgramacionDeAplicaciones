/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01.Handlers;

import lab01.Interfaces.ICtrlUsuario;
import lab01.Interfaces.ICtrlProducto;

/**
 *
 * @author admin123
 */
public class Fabrica {

private static Fabrica instancia;
private Fabrica(){};

    public static Fabrica getInstance(){
    if (instancia == null){
        instancia = new Fabrica();
    }
    return instancia;
}
    
public ICtrlUsuario getICtrlUsuario() {
    ICtrlUsuario IG = new CtrlUsuario();
    return IG;
}

public ICtrlProducto getICtrlProducto(){
    ICtrlProducto CP = new CtrlProducto();
    return CP;
}
    
}