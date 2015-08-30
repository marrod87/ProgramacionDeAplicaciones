/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;

import javax.swing.JOptionPane;
import lab01.Clases.DataProducto;
import lab01.Clases.Individual;
import lab01.Clases.Producto;
import lab01.Clases.Restaurante;
import lab01.Interfaces.ICtrlProducto;

/**
 *
 * @author gera
 */
public class CtrlProducto implements ICtrlProducto{
    
    public void registrarProducto(DataProducto dp, String nomRest, boolean promocional ){
        
        //primero obtengo el restaurante, si existe
        HUsuario HU = HUsuario.getinstance();
        Restaurante restoran = HU.obtenerRestaurante(nomRest);
        if(restoran == null){
            JOptionPane.showMessageDialog(null, "El restaurante no esta registrado en el sistema", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
        } else {
             if(!promocional){ // si el producto es individual
                 Individual i = new Individual(dp.getNombre(), dp.getDescripcion(), dp.getPrecio());
                 restoran.addProducto(i); //agrego el producto a la coleccion de productos de ese restoran
                
           
             } else {
                 // aca implementar promocional
             }
        }
        
        
    }
    
    public boolean existeRestaurante(String nomRest){
        HUsuario HU = HUsuario.getinstance();
        Restaurante restoran = HU.obtenerRestaurante(nomRest);
        if(restoran == null){
            return false;
       
        }else {
            return true;
        }
        
        
    }
    
}
