package prova;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int n1 = Integer.parseInt(req.getParameter("n1")); // coge un parametro
        int n2 = Integer.parseInt(req.getParameter("n2"));
        
        int res = n1 + n2;
        
        PrintWriter out = resp.getWriter();
        resp.setContentType(CONTENT_TYPE);
        
        out.println(ServletUtilitats.escriuCapçalera(TITOL));
        out.println("La suma és <b>"+ res + "</b>");
        
    }
    
}
