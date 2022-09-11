package Controller;

import Beans.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import Conexion.DBConnection;
import com.google.gson.Gson;

public class UsuarioController implements IUsuarioController {

@Override
public String login(String username, String contrasena){
     Gson gson= new Gson();
     DBConnection con = new DBConnection();
    
    String sql = "select * from usuario WHERE username = ' " + username + "' and contrasena = '" + contrasena + "'";
    try{
        Statement st = con.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String Nombre = rs.getString("Nombre");
            String Apellido = rs.getString("Apellido");
            int Cedula = rs.getInt("Cedula");
            String correo_electronico = rs.getString("correo_electronico");
            int Telefono = rs.getInt("Telefono");
            String Departamento = rs.getString("Departamento");
            String Ciudad = rs.getString("Ciudad");
            String Direccion = rs.getString("Direccion");
            double cuenta_saldo = rs.getDouble("cuenta_saldo");
            boolean bonos = rs.getBoolean("bonos");
            Usuario usuario = new Usuario(username, contrasena,Nombre,  Apellido,  Cedula,  correo_electronico, Telefono, Departamento, Ciudad, Direccion, cuenta_saldo, bonos);
            return gson.toJson(usuario);
        }
        
     }catch(Exception ex){
        System.out.print(ex.getMessage());
        
    }finally{
        con.desconectar();
    }
    
    return "false";
    
}
    
}
