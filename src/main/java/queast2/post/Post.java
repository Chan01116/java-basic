package queast2.post;

public class Post {
    private String title;
    private String body;
    private int id;
    private String createDate;
    private int hit;

    public Post(int id, String title, String body, String createDate, int hit) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.createDate = createDate;
        this.hit = hit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
    public void increaseHit(){
        this.hit++;
    }
}
