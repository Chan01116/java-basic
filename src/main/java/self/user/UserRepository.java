package self.user;

import self.comment.Comment;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
    }
    public ArrayList<User> getUser(){
        return users;
    }



}
