
package test;

import Conexion.DBConnection;


public class OperacionesDB {
    
    public static void main(String[] args) {
        testBD();
    }
   
    public static void actualizarropa_femenina(int id_prenda, String tipo_prenda, String marca, String talla, String color, String estilo, int precio, boolean disponible){ 
       DBConnection con = new DBConnection(); 
//       String sql = "UPDATE ropa_femenina SET genero = '" + genero + "' WHERE id = " + id;//Variable que permite almacenar
//        try {//para que se conecte con sql usamos un try
//        Statement st = con.getConnection().createStatement();
//        st.executeUpdate(sql);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        finally{
//            con.desconectar();
//        }
               
               
               
    } 
   public static void testBD(){
       DBConnection con = new DBConnection(); 
   }
}

