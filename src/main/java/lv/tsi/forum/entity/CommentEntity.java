package lv.tsi.forum.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommentEntity {

    @Id
    @GeneratedValue
    private long id;


    private long postId;
    private String author;
    private String body;

    public CommentEntity() {
    }

    public CommentEntity(long id, long postId, String author, String body) {
        this.id = id;
        this.postId = postId;
        this.author = author;
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
