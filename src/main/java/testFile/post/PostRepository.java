package testFile.post;

import java.util.ArrayList;

public class PostRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void savePost(Post post) {
        posts.add(post);
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public void delete(Post post) {
        posts.remove(post);
    }
    public ArrayList<Post> searchedPostListByKeyword(String keyword){
        ArrayList<Post> searched = new ArrayList<>();
        for(Post post : posts){
            if(post.getTitle().contains(keyword)){
               searched.add(post);
            }
        }return searched;
    }

}
