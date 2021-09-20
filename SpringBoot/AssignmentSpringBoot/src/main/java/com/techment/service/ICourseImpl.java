package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.repository.CourseRepository;

public class ICourseImpl {

	@Autowired
	private CourseRepository repo;
	public List<Course> listAll() {
	return repo.findAll();
	}
	public void save(Course course) {
	repo.save(course);
	}
	public Course get(int id) {
	return repo.findById(id).get();
	}
	public void delete(Integer id) {
	repo.deleteById(id);
	}

	
	
}
