package io.getstarted.springbootstarter.course;

import io.getstarted.springbootstarter.topic.Topic;
import io.getstarted.springbootstarter.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TopicService topicService;

    public List<Course> getAllCourses(long id){
        return (List<Course>) courseRepository.findCoursesByTopicId(id);
    }


    public Course getCourse(long id){
        return  courseRepository.findById(id).get();
    }

    public Course addCourse(Course t, long id){
        Topic tPrime =  topicService.getTopic(id);
        t.setTopic(tPrime);
        return courseRepository.save(t);
    }

    public Course updateCourse(Course t, long id){
        Topic tPrime =  topicService.getTopic(id);
        t.setTopic(tPrime);
        return courseRepository.save(t);
    }

    public void deleteCourse(long id){
        courseRepository.deleteById(id);
    }





}
