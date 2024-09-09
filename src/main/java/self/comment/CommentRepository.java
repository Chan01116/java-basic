package self.comment;

import self.bord.Post;

import java.util.ArrayList;

public class CommentRepository {
    private ArrayList<Comment> comments = new ArrayList<>();

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }
    public ArrayList<Comment> getComments(){
        return comments;
    }
    public void deleteComments(Comment comment){
        comments.remove(comment);
    }




}
