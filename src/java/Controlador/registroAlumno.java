/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Alumno;
import Clases.ESAlumnos;
import Clases.ValidacionesBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author monol
 */
public class registroAlumno extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()){
            
            ValidacionesBD bd = new ValidacionesBD();
            ESAlumnos es = new ESAlumnos();
            
            String boleta, contraseña, correo, nombre, appmat, apppat,ids;
            int id;
            boolean bandera = false;
            
            //Validaciones validar = new Validaciones();
            
            ids = request.getParameter("id");
            nombre = request.getParameter("nom");
            apppat = request.getParameter("appat");
            appmat = request.getParameter("apmat");
            correo = request.getParameter("correo");
            boleta = request.getParameter("boleta");
            contraseña = request.getParameter("contra");
            id = Integer.parseInt(ids);
            
            //if(validar.validarNombre(nom) && validar.validarNombre(appat) && validar.validarNombre(apmat) && validar.validarCorreo(correo) && validar.validarUsuario(usuario) && validar.validarContraseña(contra)){
                try {
                    bandera = bd.buscarBoletaExistente(boleta);
                } catch (SQLException ex) {
                    bandera = false;
                    Logger.getLogger(registroAlumno.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(bandera==true){
                    
                    Alumno e = new Alumno();
                    
                    e.setId(id);
                    e.setNombre(nombre);
                    e.setApppat(apppat);
                    e.setAppmat(appmat);
                    e.setCorreo(correo);
                    e.setBoleta(boleta);
                    e.setContraseña(contraseña);
                    
                    int estado = es.registrarUsu(e);

                    System.out.println(estado);
                    
                    if(estado >0){
                        out.print("<div class='input_text'>Usuario Registrado Correctamente</div>");
                        RequestDispatcher rd=request.getRequestDispatcher("registro.jsp");
                        rd.include(request,response);  
                    }else{
                            out.print("<div class='input_text'>Algo salio mal</div>");
                           RequestDispatcher rd=request.getRequestDispatcher("registro.jsp");
                           rd.include(request,response); 
                    }
                }else{
                    out.print("<div class='input_text'>Usuario Registrado Anteriormente</div>");
                    RequestDispatcher rd=request.getRequestDispatcher("registro.jsp");
                    rd.include(request,response);
                }
            //}else{
                out.print("<div class='input_text'>Eso no debia pasar validaciones</div>");
                        RequestDispatcher rd=request.getRequestDispatcher("registro.jsp");
                        rd.include(request,response);   
            //}
        } catch (SQLException ex) {
            Logger.getLogger(registroAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
