package io.getstarted.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        return (List<Topic>) topicRepository.findAll();
    }


    // It should be optional here because findbyId can return null

    public Topic getTopic(long id){
        return  topicRepository.findById(id).get();
    }

    public Topic addTopic(Topic t){
        return topicRepository.save(t);
    }

    public Topic updateTopic(Topic t){
        return topicRepository.save(t);
    }

    public void deleteTopic(long id){
        topicRepository.deleteById(id);
    }





}
