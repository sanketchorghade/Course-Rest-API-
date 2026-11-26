package com.spring.rest_api.api.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest_api.api.entity.course;


@Service
public class CourseServiceImpl implements CourseService {
	
	List <course> list;
	
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new course(145,"java full Stack ","this cousre contain a full technologys which is used in java "));
		list.add(new course(751," java course","this course is contains a basic of java"));
	}

	@Override
	public List<course> getCourses()
	{
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public course getcourse(long courseId)
	{
		course c=null;
		for (course course:list) {
			if (course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public course addcourse(course course)
	{
		list.add(course);
		return course;
	}

	@Override
	public course updatecourse(course course) {
	    for (course c : list) {

	        if (c.getId() == course.getId()) {

	            c.setTitle(course.getTitle());

	            c.setDescription(course.getDescription());

	            return c;
	        }
	    }


		return null;
	}

	@Override
	public void deletecourse(long courseId) {
	    for (int i = 0; i < list.size(); i++) {

	        if (list.get(i).getId() == courseId) {

	            list.remove(i);

	            break;
	        }
	    }
		
	}

		}