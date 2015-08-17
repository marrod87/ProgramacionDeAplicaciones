/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

/**
 *
 * @author gera
 */
public abstract class Usuario {
    private String nickname;
    private String nombre;
    private String mail;
    private String direccion;
    private String imagen; //esto es duda
    

    public Usuario() {
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

    public String getImagen() {
        return imagen;
    }
   
    
   ///asdfjadfñlkjadñflkjañlksdfjñklasdjflñkajsdñflkjasñldkfjalksñdjfñlsadjf 
    
}
