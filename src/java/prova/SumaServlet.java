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
 * Hola, este servlet no funciona bien, si alguien lo ve le invito a arreglarlo
 * no debe ser dificil, pero me da pereza y tengo mejores cosas que hacer
 * utiliza una clase de utilidad en el paquete util que recomiendo mirarse :D
 * Es algo que hice mientas me aburria
 *
 * @author mor
 * 140116
 */
@WebServlet(name = "SumaServlet", urlPatterns = {"/SumaServlet"})
public class SumaServlet extends HttpServlet {

    public static final String TITOL = "Suma";
    public static final String CONTENT_TYPE = "text/html";
    private static String contingut;
    public static final int CAMPS = 2; 
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        /*ServletUtilitats.setMetode(ServletUtilitats.M_POST);
        contingut = ServletUtilitats.escriuFormulari(CAMPS);
        
        try(PrintWriter out = resp.getWriter()) {
            
            resp.setContentType(CONTENT_TYPE);

            out.println(ServletUtilitats.construirPagina(
                    TITOL, 
                    contingut
                )
            );
            
        }*/
        
        int resultat = 0;
        String tempContingutT = "La suma és <b>"+ resultat + "</b><br/>" + 
                ServletUtilitats.escriuFormulari(CAMPS);
        String tempContingutF = "Introdueix dades.<br/>" + 
                ServletUtilitats.escriuFormulari(CAMPS);
        
        try {
        
            n1 = Integer.parseInt(req.getParameter(CAMPS[0])); // coge un parametro
            n2 = Integer.parseInt(req.getParameter(CAMPS[1]));
            resultat = n1 + n2;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

            ServletUtilitats.setMetode(ServletUtilitats.M_GET);
            
            contingut = sonIguals(resultat,n1+n2) ? 
                    tempContingutT : tempContingutF;

            try (PrintWriter out = resp.getWriter()) {

                resp.setContentType(CONTENT_TYPE);

                String prova = n1 + " " + n2 + " " + resultat + "<br/>";
                out.println(prova);
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
        
        ServletUtilitats.setMetode(ServletUtilitats.M_GET);
        contingut = "La suma és <b>"+ res + "</b><br/>"
                + ServletUtilitats.escriuFormulari(CAMPS);
        
        try (PrintWriter out = resp.getWriter()) {
            
            resp.setContentType(CONTENT_TYPE);
            
            String prova = n1 + " " + n2 + " " + res + "<br/>";
            out.println(prova);
            out.println(ServletUtilitats.construirPagina(
                    TITOL, 
                    contingut
                )
            );
            
        }
        
    }
    
    private boolean sonIguals(int x, int y) {
        
        if (x != y)
            return false;
        
        return true;
        
    }
    
}
