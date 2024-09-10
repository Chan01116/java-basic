package testFile.post;

public class Post {
    private String title;
    private String body;
    private int id;
    private String date;
    private int hits;

    public Post(String title, String body, int id, String date, int hits) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.date = date;
        this.hits = hits;
    }
    public void incHits(){
        this.hits++;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
