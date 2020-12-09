package Modelo;
import java.sql.*;
/**
 *
 * @author copec
 */
public class CConexion {
    
    protected Connection con;
    protected Statement stat;
    protected PreparedStatement st;
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String databaseName = "revista";
    private String url = "jdbc:mysql://localhost/revista";
    private String userName = "root";
    private String password = "n0m3l0";
    private String errString;
    
    public CConexion(){
        
}
    private String getConnectionUrl(){
        return this.url;
    }
    public Connection Conectar(){
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(getConnectionUrl(),userName,password);
            stat = con.createStatement();
            System.out.println("Conectado a la base de datos correctamente");
        }catch (Exception e){
           System.out.println("No se conecto a la BD");
           System.out.println(e.getMessage());
           System.out.println(e.getStackTrace());
           return null;
        }
        return con;
    }
    
    public void desconectar(){
        try{
            stat.close();
            con.close();
            System.out.println("Desconectado satisfactoriamente");
        }catch(SQLException e){
           System.out.println("No se desconecto de la BD");
           System.out.println(e.getMessage());
           System.out.println(e.getStackTrace());
        }
    }
    
    public Statement getStat(){
        return this.stat;
    }
    public Statement getSt(){
        return this.st;
    }
    public PreparedStatement prepareSt(String sql){
        try{
         this.st = con.prepareStatement(sql);   
        }catch(Exception e){
           System.out.println("Error en el prepared statement");
           System.out.println(e.getMessage());
           System.out.println(e.getStackTrace());
        }
        return this.st;
    }
}