/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;
import lab01.Clases.Cliente;
import lab01.Clases.Restaurante;
//import static lab01.Handlers.tipoU.cliente;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lab01.Interfaces.ICtrlUsuario;
/**
 *
 * @author gera
 */
//enum tipoU{cliente,restaurante}

public class CtrlUsuario implements ICtrlUsuario {

    private String nickname;
    private String nombre;
    private String email;
    private String direccion;

public CtrlUsuario(){}

    public boolean ingresarDatos(String nickname, String nombre, String email, String direccion)
{
    this.nickname=nickname;
    this.direccion=direccion;
    this.nombre=nombre;
    this.email=email;
    HUsuario HU = HUsuario.getinstance();
    //tipoU cli =(tipoU) cliente;
    //tipoU res =(tipoU) restaurante;
    //if (tipo.equals(cli)){
        //Cliente u =  new Cliente();
        //u.setNickname(nickname);
        //u.setMail(email);
        //u.setNombre(nombre);
        //u.setApellido(apellido);
        //u.setDireccion(direccion);
       // mu.addUsuario(u);
        //JOptionPane.showMessageDialog(null, "El cliente se ha registrado con exito.","Confirmación",JOptionPane.INFORMATION_MESSAGE);
       // }
   /* else{
        if (tipo.equals(res)){
        Restaurante r = new Restaurante();
        r.setNombre(nombre);
        r.setDireccion(direccion);
        r.setNickname(nick);
        r.setMail(email);   
        }
    }*/ //if(nickname.isEmpty() || email.isEmpty() ||   )
    
        return !(HU.find(nickname, email));
}

    public void registrarCliente(String apellido){
    Cliente c = new Cliente(this.nickname, this.nombre, this.email, this.direccion, apellido);
    HUsuario HU = HUsuario.getinstance();
    HU.addUsuario(c);
}

public void registrarRestaurante(){
    Restaurante r = new Restaurante(this.nickname, this.nombre, this.email, this.direccion);
    HUsuario HU = HUsuario.getinstance();
    HU.addUsuario(r);
}
@Override
public void datosAdicionales(String apellido){

HUsuario mu = HUsuario.getinstance();

Cliente c = mu.obtenerUsuario(this.nickname);
c.setApellido(apellido);

}

public String verClientes(){

HUsuario mu = HUsuario.getinstance();
String c = mu.listarUsuarios();
return c;

}

    public Cliente getUsuarioByNickname(String nickname){
        HUsuario mu = HUsuario.getinstance();
        return (mu.obtenerUsuario(nickname));
    }
}
