package quest;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    private String headLines;
    private String contents;
    private int id;
    private String date;
    private int hits = 1;
    private ArrayList<String> reply = new ArrayList<>();

    public ArrayList<String> getReply() {
        return reply;
    }

    public void setReply(ArrayList<String> reply) {
        this.reply = reply;
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
    public String toString(){
        return "번호" + id + "\n제목 : "+ headLines;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
    public int hit(){
        return hits++;
    }


}
