package io.getstarted.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping(value = "/topic")
    public List<Topic> getallTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping(value = "/topic/{id}")
    public Topic getTopic(@PathVariable(name = "id") long id){
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topic")
    public Topic addTopic(@RequestBody Topic t){
        return topicService.addTopic(t);
    }

    @PutMapping(value = "topic/{id}")
    public Topic updatetopic(@RequestBody Topic t, @PathVariable long id){
        t.setId(id);
        return topicService.updateTopic(t);
    }

    @DeleteMapping(value = "/topic/{id}")
    public void deleteTopic(@PathVariable long id){
        topicService.deleteTopic(id);
    }

}
