/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author martin
 */
public class DataUser {
    private String nickname;
    private String nombre;
    private String direccion;
    private String mail;
    private String imagen;
    
    public DataUser(){
       //Constructor por defecto
    }
    public DataUser(String nickname, String nombre, String direccion, String mail, String imagen){
        //Constructor por parámetros
        this.nickname = nickname;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
        this.imagen = imagen;
        
    }
    
    } 
    public String getNickname(){
        return this.nickname;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getMail(){
        return this.mail;
    }
    public String getImagen(){
        return this.imagen;
    }
    public void setNickname(String nickname){
        this.nickname =  nickname;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public void setImagen(String imagen){
        this.imagen = imagen;
    }
}
