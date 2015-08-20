/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;
import java.util.Date;

/**
 *
 * @author gera
 */
public class Cliente extends Usuario{
    private String apellido;
    private Date fNac;
   
    //public Cliente(){}
    public Cliente(String nickname, String nombre, String email, String direccion,String apellido) {
        super(nickname,nombre,email,direccion);
       //setNickname(); poner los valores de los tb
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFecha(Date fecha) {
        this.fNac = fecha;
    }
    public String getMail(){
        return mail;
    }
    public String getNickname() {
        return nickname;
    }
}
