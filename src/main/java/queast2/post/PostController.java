package queast2.post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    int lastestId = 4;
    PostRepository postRepository = new PostRepository();
    ArrayList<Post> posts = postRepository.getPosts();
    ArrayList<Post> searchedPostList = new ArrayList<>();
    PostView postView = new PostView();
    Scanner sc = new Scanner(System.in);

    public PostController() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java공부중입니다.", "냉무", currentDateTime(), 0);
        Post p2 = new Post(2, "java 질문", "냉무", currentDateTime(), 0);
        Post p3 = new Post(3, "정처기", "냉무", currentDateTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }
    // command : list
    public void list() {
        postView.printPostList(posts);
    }
    // command : search
    public void search() {
        System.out.println("검색 키워드 : ");
        String keyword = sc.nextLine();
        postView.printPostList(searchedPostList);
    }
    // command : detail
    public void detail() {
        System.out.println("상세보기 할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId); // 창고에서 꺼내서

        // ====요리를 한다음
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        post.increaseHit();
        postView.printPostDetail(post);
        // ===

    }
    // command : delete
    public void delete() {
        System.out.println("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        postRepository.delete(post);
        if (post == null) {
            System.out.println("없는 게시물 입니다.");
            return;

        }
        System.out.println("삭제가 완료되었습니다.");
    }
    // command : update
    public void update() {
        System.out.println("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        System.out.println("수정할 제목 : ");
        String newTitle = sc.nextLine();
        System.out.println("수정할 내용 : ");
        String newBody = sc.nextLine();
        post.setTitle(newTitle);
        post.setBody(newBody);// 더확작성 있음
        System.out.println("수정이 완료되었습니다.");

    }
    // command : add
    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        // 1부터 1씩 증가 -> 고유값 유지하는데 편리
        Post post = new Post(lastestId, title, body, currentDateTime(), 0);

        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++; // 다음 게시물의 id를 부여하기 위해 1증가

    }


    // 편의상 여기에 원래는 여기가 아님
    public String currentDateTime() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }
}
