package self.user;

public class User {
    private String ID;
    private String Password;
    private String Nickname;
    private int idCode;
    private User loggedInUser = null;

    public User(String ID, String password, String nickname,int idCode) {
        this.ID = ID;
        this.Password = password;
        this.Nickname = nickname;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
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
