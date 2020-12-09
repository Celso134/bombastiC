/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelo.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author monol
 */
public class ESAlumnos extends CConexion{
    
    private int estatus = 0;
    
    public ESAlumnos(){
        Conectar();
    }
    
    public int registrarUsu(Alumno e) throws SQLException{
   
        
        try{
          
            String q = "insert into usuario (id_usu, num_bol, con_usu, cor_usu, nom_usu, ap_pat, ap_mat)"
                    + " values (?, ?, ?, ?, ?, ?, ?)";
           
            prepareSt(q);
          
            st.setInt(1, e.getId());
            st.setString(2, e.getBoleta());
            st.setString(3, e.getContraseña());
            st.setString(4, e.getCorreo());
            st.setString(5, e.getNombre());            
            st.setString(6, e.getApppat());
            st.setString(7, e.getAppmat());
            
            estatus = st.executeUpdate();
            
        }catch(Exception ed){
            System.out.println("Error en el método registrarUsu");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
            System.out.println("Estatus: " + estatus);
        }finally{
            con.close();
            st.close();
        }
        return estatus;
    }
    
}
