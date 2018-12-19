package io.srikarrampally.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Object getTopic(@PathVariable String id)
	{
		return topicService.Topic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void postTopic(@RequestBody Topic topic)
	{
		topicService.addService(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicService.updateService(topic,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteService(id);
	}
	

}