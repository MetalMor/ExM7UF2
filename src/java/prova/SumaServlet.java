package prova;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Element;

import util.ServletUtilitats;

/**
 *
 * @author mor
 * 140116
 */
@WebServlet(name = "SumaServlet", urlPatterns = {"/SumaServlet"})
public class SumaServlet extends HttpServlet {

    public static final String TITOL = "Suma";
    public static final String CONTENT_TYPE = "text/html";
    private static String contingut;
    public static String[] CAMPS; 
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        contingut = ServletUtilitats.escriuFormulari(CAMPS);
        
        try(PrintWriter out = resp.getWriter()) {
            
            resp.setContentType(CONTENT_TYPE);

            out.println(ServletUtilitats.construirPagina(
                    TITOL, 
                    contingut
                )
            );
            
        }
        
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int n1 = Integer.parseInt(req.getParameter(CAMPS[0])); // coge un parametro
        int n2 = Integer.parseInt(req.getParameter(CAMPS[1]));
        
        int res = n1 + n2;
        
        contingut = "La suma és <b>"+ res + "</b>";
        
        try (PrintWriter out = resp.getWriter()) {
            
            resp.setContentType(CONTENT_TYPE);
            out.println(ServletUtilitats.construirPagina(
                    TITOL, 
                    contingut
                )
            );
            
        }
        
    }
    
}
