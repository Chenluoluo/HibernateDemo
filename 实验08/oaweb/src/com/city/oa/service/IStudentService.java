package com.city.oa.service;

import java.util.List;

import com.city.oa.model.CourseModel;
import com.city.oa.model.StudentModel;

public interface IStudentService {
	public void add(StudentModel sm) throws Exception;
	public void addCourse(String id,int courseNo) throws Exception;
	public void addCourses(String id,int[] courses) throws Exception;
	public List<CourseModel> getCoursesByStudent(String studentId) throws Exception;
}
