/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author gera
 */
public class Restaurante extends Usuario{
    private ArrayList<String> lstImagen;
    private Map ColCategoria;

    public Restaurante(String nickname, String nombre, String email, String direccion) {
        super(nickname,nombre,email,direccion);
        ColCategoria =new HashMap();
        //this.lstImagen = new ArrayList<String>(); //Esto puede ser cualquera
    }
    
    public void addCategoria(Categoria c){
        ColCategoria.put(c.getNombre(), c);
    }
    public boolean member(String nombre){
        return ColCategoria.containsKey(nombre);
    }

}