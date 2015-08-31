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
 * @author joaquin
 */
public class DataRestaurante {
    private String nickname;
    private String nombre;
    private String email;
    private String direccion;
    private ArrayList<String> lstImagen;
    private Map ColCategoria;

    
    public DataRestaurante(){}
    
    public DataRestaurante(String nickname, String nombre, String mail, String direccion, ArrayList<String>lstImagen){
        this.nickname=nickname;
        this.nombre=nombre;
        this.email=mail;
        this.direccion=direccion;
        this.lstImagen=lstImagen;
    }

    public Usuario dataResAres(){
        Usuario r = new Restaurante(this.nickname, this.nombre, this.email, this.direccion,this.ColCategoria);
        return r;
    }
    
}
