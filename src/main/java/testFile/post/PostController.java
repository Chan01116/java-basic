package testFile.post;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PostController {
    private Scanner sc = new Scanner(System.in);
    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private int lastestId = 4;

    public PostController(){
        Post p1 = new Post("안녕하세요 반갑습니다. java공부중이요","냉무",1,nowDate(),0);
        Post p2 = new Post("java질문좀 할게요","냉무",2,nowDate(),0);
        Post p3 = new Post("정처기 따야되나요?","냉무",3,nowDate(),0);

        postRepository.savePost(p1);
        postRepository.savePost(p2);
        postRepository.savePost(p3);
    }


    public void add() {
        System.out.println("게시물 제목을 입력해주세요");
        String title = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요");
        String body = sc.nextLine();
        Post post = new Post(title, body, lastestId,nowDate(),0);
        lastestId++;
        postRepository.savePost(post);
        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {
        postView.postList(postRepository.getPosts());
    }

    public void update() {
        System.out.println("수정할 게시물 번호 : ");
        int pixTarget = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(pixTarget);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        }
        System.out.println("제목 : ");
        String newTitle = sc.nextLine();
        System.out.println("내용 : ");
        String newBody = sc.nextLine();
        post.setTitle(newTitle);
        post.setBody(newBody);
        System.out.println(pixTarget + "번 게시물이 수정되었습니다.");
    }

    public void delete() {
        System.out.println("삭제할 게시물 번호 : ");
        int delTarget = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(delTarget);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        }
        postRepository.delete(post);
        System.out.println(delTarget + "번 게시물이 삭제되었습니다.");
    }

    public void detail() {
        System.out.println("상세보기할 게시물번호를 입력해 주세요");
        int detailTarget = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(detailTarget);
        System.out.println("===========");
        for (Post posts : postRepository.getPosts()) {
            if (post == null) {
                System.out.println("없는 게시물 번호입니다.");
            }
        }
        postView.detailTarget(post);
    }
    public void search(){
        System.out.println("검색키워드를 입력하세요");
        String keyword = sc.nextLine();
        if(postRepository.searchedPostListByKeyword(keyword).isEmpty()){
            System.out.println("검색결과가 없습니다.");
        }
        postView.postList(postRepository.searchedPostListByKeyword(keyword));
    }

    public String nowDate() {
        Date now = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String formatedNow = formatter.format(now);
        return formatedNow;
    }
}