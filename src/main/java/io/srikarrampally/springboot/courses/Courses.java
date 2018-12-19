package io.srikarrampally.springboot.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.srikarrampally.springboot.topic.Topic;

@Entity
public class Courses {

	@Id
	private String id;
	private String name;
	private String desc;
	
	@ManyToOne
	private Topic topic;
	
	public Courses()
	{
		
		
	}
	
	public Courses(String id, String name, String desc, String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.topic = new Topic(topicid, "" , "");
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
