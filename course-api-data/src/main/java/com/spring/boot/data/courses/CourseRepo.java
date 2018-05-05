package com.spring.boot.data.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);

}
