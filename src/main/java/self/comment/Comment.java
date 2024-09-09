package self.comment;

public class Comment {
    private String content;
    private String author;
    private String timestamp;
    private int commentNum;

    public Comment(String content, String timestamp) {
        this.content = content;
        this.author = author;
        this.timestamp = timestamp;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
