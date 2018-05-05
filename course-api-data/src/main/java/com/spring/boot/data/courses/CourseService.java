package com.spring.boot.data.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo courseRepo;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> topics = new ArrayList<Course>(); 
		courseRepo.findByTopicId(topicId).forEach(topics::add);
		return topics;
	}

	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public void updateCourse(Course course) {
		courseRepo.save(course);
	}

	public void deleteCourse(String id) {
		courseRepo.delete(id);
	}

}
