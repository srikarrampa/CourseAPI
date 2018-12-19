package io.srikarrampally.springboot.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRespository extends CrudRepository<Courses,String> {
	
	public List<Courses> findByTopicId(String topicid);

}
