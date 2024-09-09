package self.bord;

import java.util.ArrayList;

public class BordRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void save(Post post){
        posts.add(post);
    }
    public ArrayList<Post> getPosts(){
        return posts;
    }
    public void delete(Post post){
        posts.remove(post);
    }



}
