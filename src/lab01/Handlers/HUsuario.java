/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Handlers;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import lab01.Clases.Usuario;
import lab01.Clases.Cliente;
import java.util.Iterator;
import lab01.Clases.DataUsuario;
/**
 *
 * @author Pablo
 */
public class HUsuario {
    //Clase que conserva la colección global de los Usuarios del Sistema
    private Map Colusuarios;
    private static HUsuario instancia=null;
    
    private HUsuario(){
       Colusuarios =new HashMap();
    }
    
    public static HUsuario getinstance(){
        if (instancia==null)
            instancia = new HUsuario();
        return instancia;
    }
    
    public void addUsuario(Cliente usu){
        String nickname = usu.getNickname();
        Colusuarios.put(nickname,usu);
    }
    
    public Cliente obtenerUsuario(String nickname){
        return ((Cliente) Colusuarios.get(nickname));
    }
    public String listarUsuarios(){
    Iterator it = Colusuarios.entrySet().iterator();
    String key;
    Map.Entry w = (Map.Entry) it.next(); 

    String str= (String)w.getValue();
    return str;
}
}
    