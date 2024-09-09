package self.bord;

import self.comment.Comment;
import self.comment.CommentRepository;
import self.user.User;
import self.user.UserRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostController {
    private BordRepository bordRepository = new BordRepository();
    private Scanner sc = new Scanner(System.in);
    private BordView bordView = new BordView();
    private CommentRepository commentRepository = new CommentRepository();
    private UserRepository userRepository = new UserRepository();
    private User loggedIn = null;
    private int lastest = 4;
    private int idCode = 0;


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
        Post post = findPostById(detail);
        if(post == null){
            System.out.println("없는 게시물 번호입니다.");
            return;
        }post.incHit();
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getHeadLine());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("작성일 : %s\n" , post.getCurrentDateTime());
        System.out.printf("조회수 : %d\n" ,post.getHit());
        System.out.println("====== 댓글 ======");
        for(Comment comment : commentRepository.getComments()){
            System.out.printf("댓글내용 : %s\n", comment.getContent());
        }
        System.out.println("==================");
        System.out.println("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
        while (true){
            String detailtarget = sc.nextLine();
            if(detailtarget.equals("1")){
                System.out.printf("댓글내용 : ");
                String reply = sc.nextLine();
                Comment comment = new Comment(reply,currentDateTime());
                commentRepository.addComments(comment);
                System.out.println("댓글이 성공적으로 등록 되었습니다.");
            } else if (detailtarget.equals("2")) {
                System.out.println("[추천기능]");

            } else if (detailtarget.equals("3")) {
                if(loggedIn != null && loggedIn.equals(userRepository.getUser())){
                    System.out.print("제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.println("내용 : ");
                    String newBody = sc.nextLine();
                    post.setHeadLine(newTitle);
                    post.setBody(newBody);
                    Post newpost = new Post(newTitle, newBody, lastest, currentDateTime(),0);
                    bordRepository.save(newpost);
                }else {
                System.out.println("자신의 게시물만 수정/삭제 할 수있습니다.");}

            } else if (detailtarget.equals("4")) {
                System.out.println("[삭제기능]");

            } else if (detailtarget.equals("5")) {
                break;
            }else System.out.println("없는 기능입니다.");
            continue;
        }

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
       bordView.printPostList(bordRepository.getPosts());
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
    public void signup(){
        System.out.println("===회원 가입을 진행합니다===");
        System.out.println("아이디를 입력해주세요 : ");
        String newId = sc.nextLine();
        System.out.println("비빌번호를 입력해주세요 : ");
        String newPassword = sc.nextLine();
        System.out.println("닉네임을 입력해주세요 : ");
        String newNickname = sc.nextLine();
        User user = new User(newId,newPassword,newNickname,idCode);
        userRepository.addUser(user);
        idCode++;
    }
    public void login(){
        System.out.print("아이디 : ");
        String logId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String logPass = sc.nextLine();
        boolean login = false;
        for(User user : userRepository.getUsers()){
            if(logId.equals(user.getID()) && logPass.equals(user.getPassword())){
                System.out.println(user.getNickname() + "님 환영합니다.");
                loggedIn = user;
                login = true;
                return;
            } else if (!logId.equals(user.getID()) || !logPass.equals(user.getPassword())) {
                System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
            }
        }
    }
    public User findUserByIdCode(int idcode){
       for(User user : userRepository.getUsers()){
           if(user.getIdCode() == idcode){
               return user;
           }
       } return null;
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
