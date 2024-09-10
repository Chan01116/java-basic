package testFile.post;

import java.util.ArrayList;

public class PostView {
    public void postList(ArrayList<Post> postList) {
        System.out.println("==========");
        for (Post post : postList) {
            System.out.printf("번호 : %d\n",post.getId());
            System.out.printf("제목 : %s\n",post.getTitle());
            System.out.println("==========");
        }
    }
    public void postDetail(Post post){
        System.out.printf("번호 : %d\n",post.getId());
        System.out.printf("제목 : %s\n",post.getTitle());
        System.out.printf("내용 : %s\n",post.getBody());
    }
}
