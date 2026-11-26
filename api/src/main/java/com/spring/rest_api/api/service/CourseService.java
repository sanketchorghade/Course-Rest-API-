package com.spring.rest_api.api.service;

import java.util.List;

import com.spring.rest_api.api.entity.course;

public interface CourseService {
	public List<course> getCourses();
	
	public course getcourse(long courseId);
	
	public course addcourse(course course);
	
	public course updatecourse(course course);
	
	public void deletecourse(long courseId);

}
