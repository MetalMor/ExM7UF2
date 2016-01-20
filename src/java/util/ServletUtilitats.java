package util;

/**
 * Cosiviris varias que me he hecho para, no sé, utilizarlas
 * Seguro que ya existe una solucion mejor, pero me aburria y me puse a hacer algo
 * para practicar xD
 *
 * @author mor
 * 140116
 */
public class ServletUtilitats {
    
    public static final String DOCTYPE = "<!DOCTYPE html>";
    public static final String C_R = "\n";
    public static final String UTF_8 = "UTF-8";
    public static final String M_POST = "POST";
    public static final String M_GET = "GET";
    public static final String M_PUT = "PUT";
    public static final String T_BUTTON = "button";
    public static final String T_TEXT = "text";
    public static final String T_SUBMIT = "submit";
    
    private static String metode = M_POST;
    private static String sortida;
    private static String type = T_TEXT;
    private static String value = "Envia";
    
    public static String filtre(String input) {
        if (!teCaractersEspecials(input)) {
            return (input);
        }
        StringBuilder filtrada = new StringBuilder(input.length());
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            switch (c) {
                case '<':
                    filtrada.append("&lt;");
                    break;
                case '>':
                    filtrada.append("&gt;");
                    break;
                case '"':
                    filtrada.append("&quot;");
                    break;
                case '&':
                    filtrada.append("&amp;");
                    break;
                default:
                    filtrada.append(c);
            }
        }
        return (filtrada.toString());
    }
    
    private static boolean teCaractersEspecials(String input) {
        boolean flag = false;
        if ((input != null) && (input.length() > 0)) {
            char c;
            for (int i = 0; i < input.length(); i++) {
                c = input.charAt(i);
                switch (c) {
                    case '<':
                        flag = true;
                        break;
                    case '>':
                        flag = true;
                        break;
                    case '"':
                        flag = true;
                        break;
                    case '&':
                        flag = true;
                        break;
                }
            }
        }
        return (flag);
    }
    
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
    
    public static String escriuFormulari(int camps) {
        
        int i = 0;
        String camp;
        setType(T_TEXT);
        
        sortida = "<form method=" + ambCometes(metode) + " >" + C_R;
        while (i < camps) {
            
            camp = "field" + camps;
            sortida += "Nombre: <input type=" + ambCometes(type) + " name=" + 
                    camp + " /><br/>" + C_R;
            i++;
            
        }
        setType(T_SUBMIT);
        sortida += "<input type=" + ambCometes(type) + " value=" + ambCometes(value) + " />" + C_R + 
                "</form>";
        
        return sortida;
        
    }
    
    private static String ambCometes(String s) {
        return '\"' + s + '\"';
    }
    
    /*
     * ***** GETTERS/SETTERS *****
     */
    
    public static void setMetode(String m) {
        metode = m;
    }
    
    public static void setType(String t) {
        type = t;
    }
    
    public static void setValue(String v) {
        value = v;
    }
    
}
