/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.ESProyectos;
import Clases.Proyecto;
import Modelo.CConexion;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author monol
 */

@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class registrarProyecto extends HttpServlet {

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
        
        InputStream inputStream = null;
        ESProyectos xde = new ESProyectos();
        String titulo, grupo,intro, glosario, proposito, impacto, objetivos, ids, data;
        int id, idPersonal = 0, idEstado = 0, estado = 0;
        Part filePart;
        
        ids = request.getParameter("id");
        titulo = request.getParameter("titulo");
        grupo = request.getParameter("grupo");
        intro = request.getParameter("intro");
        glosario = request.getParameter("glosario");
        proposito = request.getParameter("proposito");
        impacto = request.getParameter("impacto");
        objetivos = request.getParameter("objetivos");
        id = Integer.parseInt(ids);
        filePart = request.getPart("archivo");
        
        if (filePart != null) {
            
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            inputStream = filePart.getInputStream();
        }
        
        try{
            
            Proyecto e = new Proyecto();
                    
            e.setId(id);
            e.setTitulo(titulo);
            e.setGrupo(grupo);
            e.setIntro(intro);
            e.setGlosario(glosario);
            e.setProposito(proposito);
            e.setImpacto(impacto);
            e.setObjetivos(objetivos);
            e.setArchivo(inputStream);
            e.setIdPersonal(idPersonal);
            e.setIdEstado(idEstado);
                    
            estado = xde.registrarProyecto(e);
             
            if (estado > 0) {
                
                data = xde.leerArchivo(id);
                request.setAttribute("imgBase", data);
                getServletContext().getRequestDispatcher("/ventana.jsp").forward(request, response);
            }
            
        }catch (SQLException ex){
            System.out.println("Error en Servlet registrar proyecto");
            System.out.println(ex.getMessage());
            System.out.println(ex.getStackTrace());
            System.out.println("Estatus: " + estado);
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
