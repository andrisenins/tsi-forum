package lv.tsi.forum.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class TopicEntity {
    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String description;

    @OneToMany
    @JoinColumn(name = "topicId")
    private List<PostEntity> postLisr;

    public TopicEntity(Long id, String title, String description, List<PostEntity> postLisr) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.postLisr = postLisr;
    }

    public TopicEntity() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PostEntity> getPostLisr() {
        return postLisr;
    }

    public void setPostLisr(List<PostEntity> postLisr) {
        this.postLisr = postLisr;
    }
}