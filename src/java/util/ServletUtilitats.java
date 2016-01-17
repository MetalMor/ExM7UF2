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
    private static final String F_POST = "\"POST\"";
    private static final String F_GET = "\"GET\"";
    private static final String F_PUT = "\"PUT\"";
    public static final String POST = "POST";
    public static final String GET = "GET";
    public static final String PUT = "PUT";
    
    public static String metode = GET;
    public static String sortida;
    
    public static String construirPagina(String titol, String contingut) {
        
        sortida = escriuCapçalera(titol) + C_R + 
                "<body>" + C_R +
                contingut + C_R +
                "</html>";
        
        return sortida;
        
    }
    
    private static String escriuCapçalera(String titol) {
        sortida = DOCTYPE + C_R + 
                "<html>" + C_R +
                "<head>" + C_R +
                "<meta charset=" + UTF_8 + " />"+ C_R +
                "<title>" + titol + "</title>" + C_R +
                "</head>" + C_R;
        
        return sortida;
        
    }
    
    public static String escriuFormulari(String[] args) {
        
        sortida = "<form " + method(metode) + " >" + C_R;
        for (String camp: args) {
            sortida += camp + "<input type=\"text\" id =\"" + camp + "\" /><br/>" + C_R;
        }
        sortida += "</form>";
        
        return sortida;
        
    }
    
    private static String method(String met) {
        
        switch(met) {
            case POST:
                met = F_POST;
                break;
            case PUT:
                met = F_PUT;
                break;
            case GET:
                met = F_GET;
                break;
            default:
                break;
        }
        
        return met;
        
    }
    
    /*
     * ***** GETTERS/SETTERS *****
     */
    
    public static void setMetode(String m) {
        metode = m;
    }
    
}
