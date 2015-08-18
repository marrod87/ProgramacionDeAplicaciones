/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab01.Interfaces;

import java.util.Date;
import lab01.Clases.Cliente;

/**
 *
 * @author admin123
 */
public interface ICtrlUsuario {
    public abstract void ingresarDatos(String nickname, String email, String nombre, String apellido, String direccion);
    public abstract void datosAdicionales(String apellido);
    public abstract String verClientes();
    public abstract Cliente getUsuarioByNickname(String nickname);
}