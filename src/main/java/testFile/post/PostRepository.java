package testFile.post;

import java.util.ArrayList;

public class PostRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    public void savePost(Post post){
        posts.add(post);
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
    public void deletePost(Post post){
        posts.remove(post);
    }
}
