package lv.tsi.forum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String author;

    String body;

    Long posts;

    public CommentEntity(Long id, String author, String body, Long posts) {
        this.id = id;
        this.author = author;
        this.body = body;
        this.posts = posts;
    }

    public CommentEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPosts() {
        return posts;
    }

    public void setPosts(Long posts) {
        this.posts = posts;
    }
}
