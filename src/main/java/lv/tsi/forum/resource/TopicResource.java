package lv.tsi.forum.resource;


import lv.tsi.forum.entity.ForumRepository;
import lv.tsi.forum.entity.TopicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/forum")
public class TopicResource {

    @Autowired
    private ForumRepository forumRepository;

    @GetMapping("/getAll")
    public List<TopicEntity> getAllTopics() {
        return forumRepository.findAll();
    }


}
