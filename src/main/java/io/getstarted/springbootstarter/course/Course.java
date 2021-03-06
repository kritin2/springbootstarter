package io.getstarted.springbootstarter.course;

import io.getstarted.springbootstarter.topic.Topic;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Course {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column
    private String courseName;
    @Column
    private String courseDescription;



    @ManyToOne(fetch = FetchType.EAGER)
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    protected Course(){}

    public Course(String courseName, String courseDescription) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @Override
    public String toString(){
        return String.format("[id: %d, courseName: '%s', courseDescription: '%s']", id, courseName, courseDescription);
    }

}
