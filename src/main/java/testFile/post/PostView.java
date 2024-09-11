package testFile.post;

import java.util.ArrayList;

public class PostView {
    public void postList(ArrayList<Post> posts){
        System.out.println("==========");
        for(Post post : posts){
            System.out.printf("번호 : %d\n",post.getId());
            System.out.printf("제목 : %s\n",post.getTitle());
            System.out.println("==========");
        }
    }public void detailPost(Post post){
        post.increaseHit();
        System.out.println("==========");
        System.out.printf("번호 : %d\n",post.getId());
        System.out.printf("제목 : %s\n",post.getTitle());
        System.out.printf("내용 : %s\n",post.getBody());
        System.out.printf("작성일 : %s\n",post.getDate());
        System.out.printf("조회수 : %d\n",post.getHits());
        System.out.println("==========");
    }
}
