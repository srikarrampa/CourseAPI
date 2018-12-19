package io.srikarrampally.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRespository topicRepo;
	
	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<Topic>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Object Topic(String id) {

		return topicRepo.findById(id);

	}

	public void addService(Topic topic) {

		topicRepo.save(topic);

	}

	public void updateService(Topic topic, String id) {
		topicRepo.save(topic);

	}

	public void deleteService(String id) {
		topicRepo.deleteById(id);		
	}

}
