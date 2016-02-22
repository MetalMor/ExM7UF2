package util;

import java.util.HashMap;
import java.util.Map;

/**
 * Cosiviris varias que me he hecho para, no sé, utilizarlas c:
 * Seguro que ya existe una solucion mejor, pero me aburria y me puse a hacer algo
 * para practicar xD
 * Ahora que hacemos JSPs, ésto se ha quedado un poco en la mierda :/ pero bueno,
 * sirve para hacer paginas sin tener q usar las JSPs
 *
 * @author mor
 * 140116
 */
public class ServletUtilitats {
    
    public static final String C_R = "\n";
    public static final String DOCTYPE = "<!DOCTYPE html>" + C_R;
    public static final String UTF_8 = "UTF-8";
    public static final String M_POST = "POST";
    public static final String M_GET = "GET";
    public static final String M_PUT = "PUT";
    public static final String T_BUTTON = "button";
    public static final String T_TEXT = "text";
    public static final String T_SUBMIT = "submit";
    
    private static final String O_TAG_START = "<";
    private static final String O_TAG_END = ">";
    private static final String C_TAG_START = "</";
    private static final String C_TAG_END = "/>";
    private static final String SPACE = " ";
    private static final String EQUALS = "=";
    
    //<editor-fold defaultstate="collapsed" desc="Caracters d'escapament">
    private static final String ESC_LT = "&lt;";
    private static final String ESC_GT = "&gt;";
    private static final String ESC_QUOT = "&quot;";
    private static final String ESC_AMP = "&amp;";
    //</editor-fold>
    
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
                    filtrada.append(ESC_LT);
                    break;
                case '>':
                    filtrada.append(ESC_GT);
                    break;
                case '"':
                    filtrada.append(ESC_QUOT);
                    break;
                case '&':
                    filtrada.append(ESC_AMP);
                    break;
                default:
                    filtrada.append(c);
            }
        }
        return (filtrada.toString());
    }
    
    private static String creaAtribut(String atrName, String atrValue) {
        return new StringBuilder(SPACE).append(atrName).append(EQUALS)
                .append(ambCometes(atrValue)).append(SPACE).toString();
    }
    
    private static String creaEtiqueta(String tagName, Map<String, String> atrMap) {
        StringBuilder contingut = new StringBuilder().append(O_TAG_START)
                .append(tagName).append(SPACE);
        
        for (Map.Entry<String, String> entry : atrMap.entrySet())
            contingut.append(creaAtribut(entry.getKey(), entry.getValue()));
        
        contingut.append(C_TAG_END).append(C_R);
        
        return contingut.toString();
        
    }
    
    private static String creaElement(String tagName, String contingut) {
        return new StringBuilder(creaEtiqueta(tagName, true))
                .append(contingut).append(creaEtiqueta(tagName, false))
                .toString();
    }
    
    private static String creaEtiqueta(String tagName, boolean pos) {
        if(pos) 
            return new StringBuilder()
                    .append(O_TAG_START).append(tagName).append(O_TAG_END)
                    .toString();
        else
            return new StringBuilder()
                    .append(C_TAG_START).append(tagName).append(O_TAG_END)
                    .append(C_R).toString();
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
        
        String body = creaElement("body", contingut);
        String pagina = new StringBuilder(escriuCapçalera(titol))
                .append(body).toString();
        sortida = DOCTYPE + creaElement("html", pagina);
        
        return sortida;
        
    }
    
    private static String escriuCapçalera(String titol) {
        
        Map<String, String> metaCharsetAtr = new HashMap<>();
        metaCharsetAtr.put("charset", UTF_8);
        
        Map<String, String> metaAuthorAtr = new HashMap<>();
        metaAuthorAtr.put("name", "author");
        metaAuthorAtr.put("content", "mor");
        
        String titolElement = new StringBuilder()
                .append(creaElement("title", titol)).toString();
        String metaCharset = creaEtiqueta("meta", metaCharsetAtr);
        String metaAuthor = creaEtiqueta("meta", metaAuthorAtr);
        String head = new StringBuilder().append(metaAuthor)
                .append(metaCharset).append(titolElement).toString();
        String headElement = creaElement("head", head);
        
        return headElement;
        
    }
    
    // no funciona
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
