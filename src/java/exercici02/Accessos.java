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
@WebServlet(name = "Exercici02", urlPatterns = {"/Accessos"})
public class Accessos extends HttpServlet {
    
    private String dataCarrega;
    private int visites = 0;
    
    private static final String TITOL = "Exercici02: Accessos";

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
            
            StringBuilder contingut = new StringBuilder();
            String sortida;
            novaVisita();
            StringBuilder carregaServlet = new StringBuilder()
                    .append("Càrrega del servlet: ").append(getDataCarrega())
                    .append("<br/>");
            StringBuilder carregaPagina = new StringBuilder()
                    .append("Càrrega de la pàgina: ").append(getDataActual())
                    .append("<br/>");
            StringBuilder carregaVisites = new StringBuilder()
                    .append("Nombre de visites: ").append(getVisites())
                    .append("<br/>");
            
            contingut.append(carregaServlet).append(carregaPagina).append(carregaVisites);
            sortida = ServletUtilitats.construirPagina(TITOL, contingut.toString());
            
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
    
    public void novaVisita() {
        setVisites(getVisites() + 1);
    }
    
}

    
    

