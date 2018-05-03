package com.city.oa.action;

import com.city.oa.model.StudentModel;
import com.city.oa.service.IStudentService;
import com.city.oa.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentController extends ActionSupport{
	StudentModel studentModel = null;
	public StudentModel getStudentModel() {
		return studentModel;
	}
	public void setStudentModel(StudentModel studentModel) {
		this.studentModel = studentModel;
	}

	int[] courses = null;

	public int[] getCourses() {
		return courses;
	}
	public void setCourses(int[] courses) {
		this.courses = courses;
	}
	
	@Override
	public String execute() throws Exception {
		IStudentService studentService = new StudentServiceImpl();
		studentService.add(studentModel);
		studentService.addCourses(studentModel.getSsid(), courses);
		return "success";
	}

}
