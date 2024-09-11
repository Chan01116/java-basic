package testFile.post;

import java.util.AbstractList;
import java.util.ArrayList;

public class PostDao {
    private ArrayList<Post> posts = new ArrayList<>();

    public void savePost(Post post){
        posts.add(post);
    }
    public void deletePost(Post post){
        posts.remove(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
    public Post findPostById(int id){
        for(Post post : posts){
            if(post.getId() == id){
                return post;
            }
        }return null;
    }

    public ArrayList<Post> getPostByKeyword(String keyword){
        ArrayList<Post> searchedPostList = new ArrayList<>();
        for(Post post : posts){
            if(post.getTitle().contains(keyword)){
                searchedPostList.add(post);
            }
        }return searchedPostList;
    }
}
