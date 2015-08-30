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
import lab01.Clases.DataUsuario;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import lab01.Clases.Categoria;

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
    private Map Cat;
public CtrlUsuario(){}

    public void setCat(Map cate){
    this.Cat=cate;
    JOptionPane.showMessageDialog(null, "Categoria recordada","EXITO",JOptionPane.INFORMATION_MESSAGE);
}


    @Override
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

    @Override
    public void registrarCliente(String apellido, String img){
    Cliente c = new Cliente(this.nickname, this.nombre, this.email, this.direccion, apellido, img);
    HUsuario HU = HUsuario.getinstance();
    HU.addUsuario(c);
}

    @Override
    public void registrarRestaurante(){
    Restaurante r = new Restaurante(this.nickname, this.nombre, this.email, this.direccion, this.Cat);
    HUsuario HU = HUsuario.getinstance();
    HU.addUsuario(r);
}
public void datosAdicionales(String apellido, String img){

HUsuario mu = HUsuario.getinstance();

Cliente c = mu.obtenerUsuario(this.nickname);
c.setApellido(apellido);
c.setImagen(img);

}

    @Override
    public String verClientes(){

HUsuario mu = HUsuario.getinstance();
String c = mu.listarUsuarios();
return c;

}

    @Override
    public Cliente getUsuarioByNickname(String nickname){
    HUsuario mu = HUsuario.getinstance();
    return (mu.obtenerUsuario(nickname));
    }

    @Override
    public Restaurante getRestauranteByNickname(String nickname){
    HUsuario mu = HUsuario.getinstance();
    return (Restaurante)(mu.obtenerRestaurante(nickname));
    }


public Map armoListaU(){
    HUsuario mu = HUsuario.getinstance();
    Map ret = new HashMap();
    Map col = mu.obtenerColeccion();
    Iterator it = col.entrySet().iterator();
    Map.Entry w = (Map.Entry) it.next(); 
    while(it.hasNext()){
        Map.Entry map = (Map.Entry) it.next();
        if(map.getValue().getClass().getSimpleName().equals("Cliente")){
            Cliente cli = (Cliente)map.getValue();
            DataUsuario dt = new DataUsuario(cli.getNickname(), cli.getMail());
            ret.put(cli.getNickname(), dt);
        }
    }
return ret;

}

public void registrarCat(String nombre){

    HCategoria hu = HCategoria.getinstance();
    if(hu.member(nombre))
        JOptionPane.showMessageDialog(null, "La categoria ya existe","ERROR",JOptionPane.ERROR_MESSAGE);
    else{
        Categoria c = new Categoria(nombre);
        hu.addCategoria(c);
        JOptionPane.showMessageDialog(null, "Se ha creado la nueva categoria","EXITO",JOptionPane.INFORMATION_MESSAGE);
    }
}

public Map retColCat(){
           // JOptionPane.showMessageDialog(null, "Se ha creado la nueva categoria","EXITO",JOptionPane.INFORMATION_MESSAGE);
    Map ret  = new HashMap();        
    HCategoria hc = HCategoria.getinstance();
    ret=hc.obtenerColeccion();
    return (Map)ret;
}

    @Override
    public void datosAdicionales(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}