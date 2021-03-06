package io.getstarted.springbootstarter.topic;

import javax.persistence.*;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column
    private String topicName;
    @Column
    private String topicDescription;

    protected Topic(){}

    public Topic(String topicName, String topicDescription) {
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    @Override
    public String toString(){
        return String.format("[id: %d, topicName: '%s', topicDescription: '%s']", id, topicName, topicDescription);
    }

}
