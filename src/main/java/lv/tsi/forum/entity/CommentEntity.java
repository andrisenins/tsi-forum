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
    private String body;
    private Long postId;

    public CommentEntity(Long id, String author, String body, Long postId) {
        this.id = id;
        this.author = author;
        this.body = body;
        this.postId = postId;
    }


    public CommentEntity(){

    }


}
