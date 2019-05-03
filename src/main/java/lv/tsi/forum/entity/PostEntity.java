package lv.tsi.forum.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class PostEntity {
    @GeneratedValue
    @Id
    private Long id;
    private String title;
    private String body;
    @OneToMany
    @JoinColumn(name = "postId")
    private List<CommentEntity> commentList;
    private String author;

    public PostEntity(Long id, String title, String body, List<CommentEntity> commentList, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.commentList = commentList;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public PostEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
    }
}
