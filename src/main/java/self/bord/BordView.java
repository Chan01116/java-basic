package self.bord;

import java.util.ArrayList;

public class BordView {
    public void printPostList(ArrayList<Post> targetList){
        System.out.println("===========");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getHeadLine());
            System.out.println("===========");

        }
    }
    public void detailPostList(Post post){
        post.incHit();
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getHeadLine());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("작성일 : %s\n" , post.getCurrentDateTime());
        System.out.printf("조회수 : %d\n" ,post.getHit());
        System.out.println("====== 댓글 ======");
    }
}
