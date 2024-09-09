package self.bord;

public class Post {
   private String headLine;
    private String body;
    private int id;
    private String currentDateTime;
    private int hit;

    public Post(String headLine, String body, int id, String currentDateTime, int hit) {
        this.headLine = headLine;
        this.body = body;
        this.id = id;
        this.currentDateTime = currentDateTime;
        this.hit = hit;
    }

    public void incHit(){
        this.hit++;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
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
}