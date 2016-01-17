package prova;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 *
 * @author mor
 * 110116
 */
@WebServlet("/NouServlet")
public class NouServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        // ejemplo de uso de una clase de utilidad
        out.println("EL centre és " + Escola.CENTRE + ".");
        
    }
    

}
