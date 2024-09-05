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
    private User author;
    private int like;

    public ArrayList<User> getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(ArrayList<User> likedUsers) {
        this.likedUsers = likedUsers;
    }

    private ArrayList<User> likedUsers = new ArrayList<>();

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

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
