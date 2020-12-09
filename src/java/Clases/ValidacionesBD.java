/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelo.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author monol
 */
public class ValidacionesBD extends CConexion{
    
    private ResultSet rs;
    
    public ValidacionesBD(){
       Conectar();
    }
    
    public boolean buscarBoletaExistente (String boleta) throws SQLException{
        boolean val;
        boolean bandera = true;
         try{
             
            String sql = "Select * from usuario where num_bol = ?";
            
            prepareSt(sql);
            st.setString(1, boleta);
            
            rs = st.executeQuery();           
            val = rs.next();
            
            if(val==true){
                System.out.println("Se encontraron coincidencias");
                bandera = false;
            }else{
                System.out.println("No se encontraron coincidencias");                
            }
            while(val){
                val=rs.next();
            }
                
        }catch(Exception ed){
            System.out.println("Error en clase buscarBoletaExistente");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
            bandera = false;
            return bandera;
        }finally{
            con.close();
            st.close();
        }
     
      return bandera;
    }
    
}
