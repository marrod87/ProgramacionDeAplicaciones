/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import java.util.ArrayList;

/**
 *
 * @author gera
 */
public class Restaurante extends Usuario{
    private ArrayList<String> lstImagen; 

    public Restaurante(String nickname, String nombre, String email, String direccion) {
        super(nickname,nombre,email,direccion);
        //this.lstImagen = new ArrayList<String>(); //Esto puede ser cualquera
    }
    
    
    
}
