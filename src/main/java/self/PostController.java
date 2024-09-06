package self;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostController {
    private BordRepository bordRepository = new BordRepository();
    private Scanner sc = new Scanner(System.in);
    private int lastest = 4;


   public PostController() {
       Post p1 = new Post("안녕하세요 반갑습니다.java공부중이에요", "냉무", 1, currentDateTime(), 0);
       Post p2 = new Post("java질문 좀할게요", "냉무", 2, currentDateTime(), 0);
       Post p3 = new Post("jck따야하나요", "냉무", 3, currentDateTime(), 0);

       bordRepository.save(p1);
       bordRepository.save(p2);
       bordRepository.save(p3);
   }
    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();
        boolean found = false;
        for (Post post : bordRepository.getPosts()){
            if(post.getHeadLine().contains(keyword) || post.getBody().contains(keyword)){
                System.out.println("=======");
                System.out.printf("번호 : %d\n", post.getId());
                System.out.printf("제목 : %s\n", post.getHeadLine());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록날짜 : %s\n", post.getCurrentDateTime());
                post.incHit();
                System.out.printf("조회수 : %d\n" ,post.getHit());
                found = true;
            }
        }if(!found){
            System.out.println("검색결과를 찾을수 없습니다.");
        }

    } public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int detail = Integer.parseInt(sc.nextLine());
        if (detail <= 0 || detail > bordRepository.getPosts().size()) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        Post post = bordRepository.getPosts().get(detail - 1);
        System.out.println("===========");
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getHeadLine());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCurrentDateTime());
        post.incHit();
        System.out.printf("조회수 : %d\n" ,post.getHit());
        System.out.println("===========");

    }public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int del = Integer.parseInt(sc.nextLine());
        if (del <= 0 || del > bordRepository.getPosts().size()) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }
        bordRepository.getPosts().remove(del - 1);
        System.out.println(del + "번 게시물이 삭제되었습니다.");

    }public void update() {
        System.out.println("수정할 게시물 번호 : ");
        int pix = Integer.parseInt(sc.nextLine());
        if (pix <= 0 || pix > bordRepository.getPosts().size()) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        }

        System.out.println("새로운 게시물 제목 : ");
        String newHeadLine = sc.nextLine();
        System.out.println("세로운 게시물 내용 : ");
        String newBody = sc.nextLine();
        Post post = bordRepository.getPosts().get(pix - 1);

        post.setHeadLine(newHeadLine);
        post.setBody(newBody);
        System.out.println(pix + "번 게시물이 수정되었습니다.");


    }public void list() {
        System.out.println("===========");
        for (Post post : bordRepository.getPosts()) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getHeadLine());
            System.out.println("===========");

        }
   }
    public void add() {
        System.out.println("게시물 제목을 입력해주세요");
        String headLine = sc.nextLine();
        System.out.println("게시물 내용을 입력해주세요");
        String body = sc.nextLine();
        System.out.println("게시물이 등록 되었습니다.");
        Post post = new Post(headLine, body, lastest, currentDateTime(),0);
        post.setBody(body);
        post.setHeadLine(headLine);
        bordRepository.save(post);
        lastest++;
    }
    public Post findPostById(int id){
        for(Post post : bordRepository.getPosts()){
            if(post.getId() == id){
                return post;
            }
        }
        return null;

    }public String currentDateTime() {

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

}
