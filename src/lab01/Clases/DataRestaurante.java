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
public class DataRestaurante {


    private String nickname;
    private String nombre;
    private String direccion;
    private String mail;
    private String imagen;
    
    public DataRestaurante(String nickname, String nombre, String direccion, String mail, String imagen) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
        this.imagen = imagen;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getImagen() {
        return imagen;
    }
    
}
