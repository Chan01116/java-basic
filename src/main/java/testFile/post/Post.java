package testFile.post;

public class Post {
    private String title;
    private String body;
    private String date;
    private int id;
    private int hits;

    public Post(String title, String body, String date, int id, int hits) {
        this.title = title;
        this.body = body;
        this.date = date;
        this.id = id;
        this.hits = hits;
    }
    public void increaseHit(){
        this.hits++;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
