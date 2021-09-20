package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.entity.Course;

public class IServiceImpl implements ICouseService     {

	@Autowired
	ICourseDao iCourseDao;
	
	@Override
	public List<Course> listAllCourse() {
		// TODO Auto-generated method stub
		return iCourseDao.findAll();
	}

	@Override
	public String addCourse(Course course) {

		iCourseDao.save(course);

		return "Course added Successfully";
	}

	@Override
	public Course viewCourseById(int id) {
		// TODO Auto-generated method stub
		return iCourseDao.findById(id).get();
	}

	@Override
	public String updateCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCourseById(int id) {
		// TODO Auto-generated method stub
		iCourseDao.deleteById(id);
		return "deleted";
	}

	@Override
	public void save(Course course) {
		iCourseDao.save(course);
	}

}
