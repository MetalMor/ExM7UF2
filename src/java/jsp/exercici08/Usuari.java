package jsp.exercici08;

import java.io.Serializable;

/**
 *
 * 220216
 * @author becari
 */
public class Usuari implements Serializable {
    
    private String nick;
    private String password;

    public Usuari() {
    }

    public Usuari(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
