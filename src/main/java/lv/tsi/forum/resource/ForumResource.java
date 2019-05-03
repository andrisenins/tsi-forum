package lv.tsi.forum.resource;


import lv.tsi.forum.entity.ForumRepository;
import lv.tsi.forum.entity.TopicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forum")
public class ForumResource {

    @Autowired
    ForumRepository forumRepository;

    @GetMapping("/getAll")
    public List<TopicEntity> getAllTopics(){
        return forumRepository.findAll();
    }
}
