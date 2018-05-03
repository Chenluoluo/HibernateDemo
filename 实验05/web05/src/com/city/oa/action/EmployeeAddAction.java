package com.city.oa.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.factory.ServiceFactory;
import com.city.oa.model.EmployeeModel;
import com.city.oa.service.IEmployeeService;
import com.city.oa.service.impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeAddAction
 */
@WebServlet("/employee/add.do")
public class EmployeeAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAddAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eno = request.getParameter("eno");
		int enoInt = Integer.parseInt(eno);
		String ename = request.getParameter("ename");
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String joindate = request.getParameter("joindate");
		String cardid = request.getParameter("cardid");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		EmployeeModel em = new EmployeeModel();
		em.setEno(enoInt);
		em.setEname(ename);
		em.setSex(sex);
		try {
			em.setBirthday(sdf.parse(birthday));
			em.setJoindate(sdf.parse(joindate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		em.setCardid(cardid);
		
		IEmployeeService employeeService = ServiceFactory.createService();
		try {
			employeeService.add(em);
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
