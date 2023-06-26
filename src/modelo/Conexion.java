package modelo;
/**
 * @author Grupo 8 NRC: 50394
 * CRUD: Create, Read, Update, Delete -> Crear, Leer o Buscar, Actualizar, Eliminar
 * Objetos de la base de datos
 **/
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Connection getConnection(){
        //String url="jdbc:mysql://db4free.net:3306/usuarios_agcs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String url="jdbc:mysql://db4free.net:3306/usuarios_agcs";
        String usua="g8_agcs_uniminut";
        String pass="xB9zFWXVFPLfmqSQ";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,usua,pass);
        }catch(Exception e){
        }
        return con;
    }
}
