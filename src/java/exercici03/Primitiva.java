package exercici03;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.runtime.Undefined;
import util.ServletUtilitats;

/**
 *
 * @author mor
 * 10116
 */
@WebServlet(name = "Primitiva", urlPatterns = {"/Primitiva"})
public class Primitiva extends HttpServlet {

    private final String TITOL = "Exercici03 - Primitiva";
    
    private List<Integer> nombres = new ArrayList<>();
    private String contingut = "Bon dia<br/>";
    
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
            
            generaContingut();
            out.println(contingut);
            
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
        processRequest(request, response);
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
    
    private void generaNombres() {
        
        int num = 0;
        while (nombres.size() != 6) {
            num = nombreAleatori();
            if (!nombres.contains(num))
                nombres.add(num);
        }
        
    }
    
    private int nombreAleatori() {
        return (int) (Math.random() * 49 + 1);
    }
    
    private void generaContingut() {
        
        int end = nombres.size() - 1;
        int comptador;
        
        StringBuilder resultat = new StringBuilder().append("<ul>");
        for (Integer nombre : nombres) {
            resultat.append("<li>").append(nombre).append("</li>");
        }
        
        contingut = resultat.toString();
        
    }

    @Override
    public void init() throws ServletException {
        super.init();
        generaNombres();
    }
    
}
