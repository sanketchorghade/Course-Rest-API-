package com.spring.rest_api.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest_api.api.entity.course;
import com.spring.rest_api.api.service.CourseService;


@RestController
public class Mycontroller {
	
	@Autowired
	private CourseService  CourseService;

	@GetMapping("/courses")
	public List<course> getcourses(){
		return this.CourseService.getCourses();
		
	}
	
	@GetMapping("/course/{courseId}")
	public course getcourse(@PathVariable String courseId)
	{
		return this.CourseService.getcourse(Long.parseLong(courseId));
	}
	
	
	@PostMapping("/courses")
	public course addcourse(@RequestBody course course)
	{
		return this.CourseService.addcourse(course);
		
	}
	
	@PutMapping("/courses")
	public course updatecourse(@RequestBody course course) {
	    return this.CourseService.updatecourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public void deletecourse(@PathVariable Long courseId) {
	    this.CourseService.deletecourse(courseId);
	}

}
