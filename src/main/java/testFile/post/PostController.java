package testFile.post;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PostController {
    private Scanner sc = new Scanner(System.in);
    private PostDao postDao = new PostDao();
    private int lastestId = 1;
    private PostView postView = new PostView();


    public PostController(){
        Post p1 = new Post("안녕하세요 반갑습니다. java 공부중이에요", "냉무",nowDate(),1,0);
        Post p2 = new Post("java 질문좀 할게요", "냉무",nowDate(),2,0);
        Post p3 = new Post("정처기 따야되나요?", "냉무",nowDate(),3,0);

        postDao.savePost(p1);
        postDao.savePost(p2);
        postDao.savePost(p3);
    }


    public void add() {
        System.out.println("제목");
        String title = sc.nextLine();
        System.out.println("내용");
        String body = sc.nextLine();
        Post post = new Post(title, body, nowDate(), lastestId, 0);
        postDao.savePost(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }

    public void list() {
        if (postDao.getPosts().isEmpty()) {
            System.out.println("게시물이 없습니다.");
            return;
        } else postView.postList(postDao.getPosts());
    }

    public void update() {
        System.out.println("수정할 게시물 번호를 입력해주세요");
        int reviseTarget = Integer.parseInt(sc.nextLine());
        Post post = postDao.findPostById(reviseTarget);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        System.out.println("수정할 제목");
        String newTitle = sc.nextLine();
        System.out.println("수정할 내용");
        String newBody = sc.nextLine();
        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.println("수정되었습니다.");
    }

    public void delete() {
        System.out.println("삭제할 게시물 번호를 입력해주세요");
        int deleteTarget = Integer.parseInt(sc.nextLine());
        if (postDao.findPostById(deleteTarget) == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        postDao.deletePost(postDao.findPostById(deleteTarget));
        System.out.println(deleteTarget + "번 게시물이 삭제되었습니다.");
    }

    public void detail() {
        System.out.println("상세보기할 게시물 번호를 입력해주세요");
        int detailTarget = Integer.parseInt(sc.nextLine());
        if (postDao.findPostById(detailTarget) == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }postView.detailPost(postDao.findPostById(detailTarget));
    }
    public void search(){
        System.out.println("검색키워드를 입력해주세요");
        String keyword = sc.nextLine();
        ArrayList<Post> searchedPostList = postDao.getPostByKeyword(keyword);
        if(searchedPostList.isEmpty()){
            System.out.println("검색결과가 없습니다");
            return;
        }
        postView.postList(searchedPostList);
    }


    public String nowDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        return dateTime;
    }
}
