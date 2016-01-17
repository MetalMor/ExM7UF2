package util;

/**
 *
 * @author mor
 * 140116
 */
public class ServletUtilitats {
    
    public static final String DOCTYPE = "<!DOCTYPE html>";
    public static final String C_R = "\n";
    public static final String UTF_8 = "\"UTF-8\"";
    
    public static String escriuCapçalera(String titol) {
        String sortida = DOCTYPE + C_R + 
                "<html>" + C_R +
                "<head>" + C_R +
                "<meta charset=" + UTF_8 + " />"+ C_R +
                "<title>" + titol + "</title>" + C_R +
                "</head>" + C_R;
        
        return sortida;
        
    }
    
}
