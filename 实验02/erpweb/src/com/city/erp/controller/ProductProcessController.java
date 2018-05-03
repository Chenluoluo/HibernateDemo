package com.city.erp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.erp.model.ProductModel;
import com.city.erp.service.IProductService;
import com.city.erp.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class ProductProcessController
 */
@WebServlet("/product/todo.do")
public class ProductProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductProcessController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String todo = request.getParameter("do");
		System.out.println(todo);
		
		String pno = request.getParameter("pno");
		int pnoInt = Integer.parseInt(pno);
		String pcode = request.getParameter("pcode");
		String pname = request.getParameter("pname");
		String stockqty = request.getParameter("stockqty");
		int stockqtyInt = Integer.parseInt(stockqty);
		String pdate = request.getParameter("pdate");
		String price = request.getParameter("price");
		double priceDouble = Double.parseDouble(price);
		String pmodel = request.getParameter("pmodel");
		String pdesc = request.getParameter("pdesc");
		
		ProductModel pm = new ProductModel();
		pm.setPno(pnoInt);
		pm.setPcode(pcode);
		pm.setPname(pname);
		pm.setStockqty(stockqtyInt);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			pm.setPdate(sdf.parse(pdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		pm.setPrice(priceDouble);
		pm.setPmodel(pmodel);
		pm.setPdesc(pdesc);
		
		IProductService productService = new ProductServiceImpl();
		
		if(todo.equals("增加按钮")) {
			try {
				productService.add(pm);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				productService.modify(pm);
			} catch (Exception e) {
				e.printStackTrace();
			}
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
