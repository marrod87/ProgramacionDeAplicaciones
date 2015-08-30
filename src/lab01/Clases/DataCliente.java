/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import java.util.Date;

/**
 *
 * @author gonzalo
 */
public class DataCliente {
    
    private String apellido;
    private Date fNac;

    
    public DataCliente(){}
    
    public DataCliente(String apellido, Date fNac) {
        this.apellido = apellido;
        this.fNac = fNac;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getfNac() {
        return fNac;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNac(Date fNac) {
        this.fNac = fNac;
    }
    
    
    
    
    
    
}
