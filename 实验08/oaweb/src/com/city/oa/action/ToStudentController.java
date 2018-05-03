package com.city.oa.action;

import java.util.List;

import com.city.oa.model.CourseModel;
import com.city.oa.service.ICourseService;
import com.city.oa.service.impl.CourseServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ToStudentController extends ActionSupport{
	List<CourseModel>  courseModels = null;
	public List<CourseModel> getCourseModels() {
		return courseModels;
	}
	public void setCourseModels(List<CourseModel> courseModels) {
		this.courseModels = courseModels;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ICourseService courseService = new CourseServiceImpl();
		courseModels = courseService.getListByAll();
		return "success";
	}
}
