/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Modelo.CConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

/**
 *
 * @author monol
 */
public class ESProyectos extends CConexion{
    
    private int estatus;
    
    public ESProyectos (){
        Conectar();
    }
    
    public int registrarProyecto(Proyecto e) throws SQLException{
   
        
        try{
          
            String q = "insert into prueba2 (id_pro, tit_pro, gru_pro, intr_pro, glo_pro, prop_pro, imp_pro, obj_pro, archivo, id_per, id_est)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
            prepareSt(q);
          
            st.setInt(1, e.getId());
            st.setString(2, e.getTitulo());
            st.setString(3, e.getGrupo());
            st.setString(4, e.getIntro());
            st.setString(5, e.getGlosario());            
            st.setString(6, e.getProposito());
            st.setString(7, e.getImpacto());
            st.setString(8, e.getObjetivos());
            st.setBlob(9, e.getArchivo());
            st.setInt(10, e.getIdPersonal());
            st.setInt(11, e.getIdEstado());
            
            estatus = st.executeUpdate();
            
        }catch(Exception ed){
            System.out.println("Error en el método registrarProyecto");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
            System.out.println("Estatus: " + estatus);
        }finally{
            
            st.close();
        }
        return estatus;
    }
    
    public String leerArchivo(int id) throws SQLException{
   
        String retorno = null;
        try{
          
            String q = "select archivo from prueba2 where id_pro = ?";
           
            prepareSt(q);
          
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                byte[] fileinfo = rs.getBytes("archivo");
                retorno = Base64.getEncoder().encodeToString(fileinfo);
            }
            
        }catch(Exception ed){
            System.out.println("Error en el método leerArchivo");
            System.out.println(ed.getMessage());
            System.out.println(ed.getStackTrace());
            System.out.println("Estatus: " + estatus);
        }finally{
            
            st.close();
        }
        return retorno;
    }
    
}

