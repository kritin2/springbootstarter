package io.getstarted.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/topic/{topicId}/course")
    public List<Course> getallCourses(@PathVariable long topicId){
        return courseService.getAllCourses(topicId);
    }

    @GetMapping(value = "topic/{topicId}/course/{id}")
    public Course getCourse(@PathVariable(name = "id") long id){
        return courseService.getCourse(id);
    }

    @PostMapping(value = "topic/{topicId}/course")
    public Course addCourse(@RequestBody Course t, @PathVariable long topicId){
        return courseService.addCourse(t, topicId);
    }

    @PutMapping(value = "topic/{topicId}/course/{id}")
    public Course updatecourse(@RequestBody Course t, @PathVariable long id, @PathVariable long topicId){
        t.setId(id);
        return courseService.updateCourse(t, topicId);
    }

    @DeleteMapping(value = "topic/{topicId}/course/{id}")
    public void deleteCourse(@PathVariable long id){
        courseService.deleteCourse(id);
    }

}
