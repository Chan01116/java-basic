package self.user;

public class User {
    String ID;
    String Password;
    String Nickname;
    int idCode;

    public User(String ID, String password, String nickname,int idCode) {
        this.ID = ID;
        Password = password;
        Nickname = nickname;
    }
    public void incIdCode(){
        this.idCode++;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
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
