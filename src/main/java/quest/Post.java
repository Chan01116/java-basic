package quest;

import java.time.LocalDateTime;

public class Post {
    private String headLines;
    private String contents;
    private int id;
    private LocalDateTime date;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadLines() {
        return headLines;
    }

    public void setHeadLines(String headLines) {
        this.headLines = headLines;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
