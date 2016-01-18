package exercici02;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ServletUtilitats;
import static util.ServletUtilitats.C_R;

/**
 *
 * @author mor
 * 180116
 */
@WebServlet(name = "Exercici02", urlPatterns = {"/Exercici02"})
public class Accessos extends HttpServlet {
    
    private String dataCarrega;
    private int visites = 0;
    
    private static final String TITOL = "Exercici02";

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
            
            String contingut;
            String sortida;
            novaVisita();
            String carregaServlet = "Càrrega del servlet: " + getDataCarrega() + "<br/>" + C_R;
            String carregaPagina = "Càrrega de la pàgina: " + getDataActual() + "<br/>" + C_R;
            String carregaVisites = "Nombre de visites: " + getVisites() + "<br/>" + C_R;
            
            contingut = carregaServlet + carregaPagina + carregaVisites;
            sortida = ServletUtilitats.construirPagina(TITOL, contingut);
            
            out.println(sortida);
            
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void init() throws ServletException {
        super.init();
        
        setDataCarrega(getDataActual());
        setVisites(0);
        
    }
    
    private void novaVisita() {
        setVisites(getVisites()+1);
    }
    
    public static String getDataActual() {
        Date d = new Date();
        return d.toString();
    }

    public String getDataCarrega() {
        return dataCarrega;
    }

    public int getVisites() {
        return visites;
    }

    public void setDataCarrega(String dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public void setVisites(int visites) {
        this.visites = visites;
    }
    
}

    
    

