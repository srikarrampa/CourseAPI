package io.srikarrampally.springboot.courses;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.srikarrampally.springboot.topic.Topic;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Courses> getAllTopics(@PathVariable String id)
	{
		return courseService.getAllCourses(id);
	}
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Object getCourse(@PathVariable String id)
	{
		return courseService.Course(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses")
	public void postCourse(@RequestBody Courses course, @PathVariable String topicid)
	{
		course.setTopic(new Topic(topicid , "",""));
		courseService.addService(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{topicId}/courses/{courseId}")
	public void updateTopic(@RequestBody Courses course, @PathVariable String topicId, @PathVariable String courseId)
	{
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateService(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/topics/{topicid}/courses/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		courseService.deleteService(id);
	}
	

}
