package com.city.mis.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.mis.model.ClassModel;
import com.city.mis.model.StudentModel;
import com.city.mis.service.IStudentService;
import com.city.mis.service.impl.StudentsSrviceImpl;

/**
 * Servlet implementation class StudentAddServlet
 */
@WebServlet("/student/add.do")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ssid = request.getParameter("ssid");
		String sname = request.getParameter("sname");
		String birthday = request.getParameter("birthday");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String cno = request.getParameter("cno");
		StudentModel student = new StudentModel();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		student.setSsid(ssid);
		student.setSname(sname);
		try {
			student.setBirthday(sdf.parse(birthday));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setAge(Integer.parseInt(age));
		student.setSex(sex);
		ClassModel classModel = new ClassModel();
		classModel.setCno(Integer.parseInt(cno));
		student.setCm(classModel);
		IStudentService ss = new StudentsSrviceImpl();
		try {
			ss.add(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
