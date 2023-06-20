/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import beans.Inscrire;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BANE
 */
public class MonServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    List<Inscrire> tliste = new ArrayList();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String mdp = request.getParameter("mdp");
        String confirmer = request.getParameter("confirmer");
         if (mdp.equals(confirmer)){
           response.sendRedirect(request.getContextPath() + "/inscrire.jsp");
           return;
       }
        Inscrire ins = new Inscrire(nom, prenom, pseudo, email, mdp, confirmer);
        tliste.add(ins);
        request.setAttribute("tliste",tliste);
        request.getRequestDispatcher("Page/accueil.jsp").forward(request, response);
        //response.sendRedirect("Page/accueil.jsp");
        
        
       /* if(mdp != null ? confirmer != null : mdp.equals(confirmer)  ){
            System.out.println("Erreur de confirmation");
        } else{
            
        }*/
      
        
       // tliste.add(ins);
        //request.setAttribute("list", "tliste");
        
        
        
       
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
        processRequest(request, response);
        
        String pseudo = request.getParameter("pseudo");
        HttpSession session = request.getSession();
        session.setAttribute("pseudo", pseudo);
        
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
