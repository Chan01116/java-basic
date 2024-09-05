package queast2.post;

import java.util.ArrayList;

public class PostView {
    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==========");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n ", post.getTitle());
            System.out.println("==========");//메서드로 만든다
        }

    }
    public void printPostDetail(Post post){
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s", post.getTitle());
        System.out.printf("내용 : %s", post.getBody());
        System.out.printf("등록날짜 : %s", post.getHit());
    }
}
