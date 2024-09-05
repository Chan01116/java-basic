package quest;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
   private String ID;
    private String Password;
    private String Nickname;
    private int usernum;



    public int getUsernum() {
        return usernum;
    }

    public void setUsernum(int usernum) {
        this.usernum = usernum;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }
}
