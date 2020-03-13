/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ConductorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Conductor;

/**
 *
 * @author usuario
 */
public class conductorControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet conductorControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet conductorControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");*/
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        //Recibir los datos de form
        int id = Integer.parseInt(request.getParameter("txtid"));
        String nombre = request.getParameter("txtnombre");
        String idTipoLicencia = request.getParameter("txttipolicencia");
        String idVehiculo = request.getParameter("txtidvehiculo");
        int idTipoConductor =  Integer.parseInt(request.getParameter("txttipoconductor"));
        
        //Instanciar modelo
        Conductor conductor = new Conductor();
        conductor.setId(id);
        conductor.setNombre(nombre);
        conductor.setIdTipoLicencia(idTipoLicencia);
        conductor.setIdVehiculo(idVehiculo);
        conductor.setIdTipoConductor(idTipoConductor);
        
        //insert
        if(ConductorDAO.insertC(conductor)){
            request.setAttribute("mensaje", "Conductor registrado");
        }else{
            request.setAttribute("mensaje", "Conductor NO registrado");
        }
        request.getRequestDispatcher("registrarC.jsp").forward(request, response);
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
