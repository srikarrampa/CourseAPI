package io.srikarrampally.springboot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRespository courseRepo;
	
	public List<Courses> getAllCourses(String id) {

		List<Courses> courses = new ArrayList<Courses>();
		courseRepo.findByTopicId(id).forEach(courses::add);
		return courses;
	}

	public Object Course(String id) {

		return courseRepo.findById(id);

	}

	public void addService(Courses course) {

		courseRepo.save(course);

	}

	public void updateService(Courses course) {
		courseRepo.save(course);

	}

	public void deleteService(String id) {
		courseRepo.deleteById(id);		
	}

}
