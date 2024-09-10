package testFile.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    private Scanner sc = new Scanner(System.in);
    private PostView postView = new PostView();
    private int lastestId = 1;
    private PostRepository postRepository = new PostRepository();

    public void add() {
        System.out.println("게시물 제목을 입력해주세요");
        String title = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요");
        String body = sc.nextLine();
        Post post = new Post(title, body, lastestId);
        post.setTitle(title);
        post.setBody(body);
        postRepository.savePost(post);
        lastestId++;
        System.out.println("게시물이 등록되없습니다.");
    }

    public void list() {
        postView.postList(postRepository.getPosts());
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int pixTarget = Integer.parseInt(sc.nextLine());
        Post post = findPostById(pixTarget);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        }
        System.out.println("제목 : ");
        String newTitle = sc.nextLine();
        System.out.println("내용 : ");
        String newBody = sc.nextLine();
        post.setTitle(newTitle);
        post.setBody(newBody);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int delTarget = Integer.parseInt(sc.nextLine());
        Post post = findPostById(delTarget);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        }
        postRepository.deletePost(post);
        System.out.println(delTarget + "번 게시물이 삭제되었습니다.");
    }
    public void detail(){
        System.out.print("상세보기할 게시물 번호를 입력해주세요 : ");
        int detailTarget = Integer.parseInt(sc.nextLine());
        Post post = findPostById(detailTarget);
        if(post == null){
            System.out.println("없는 게시물 번호입니다.");
        }postView.postDetail(post);
    }

    public Post findPostById(int id) {
        for (Post post : postRepository.getPosts()) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
