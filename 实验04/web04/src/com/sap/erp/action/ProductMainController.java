package com.sap.erp.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sap.erp.model.ProductModel;
import com.sap.erp.service.IProductService;
import com.sap.erp.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class ProductMainController
 */
@WebServlet("/product/do.do")
public class ProductMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductMainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String todo = request.getParameter("do");
		String pno = request.getParameter("pno");
		int pnoInt = Integer.parseInt(pno);
		String pname = request.getParameter("pname");
		String pdate = request.getParameter("pdate");
		String uniprice = request.getParameter("uniprice");
		double unipriceDouble = Double.parseDouble(uniprice);
		String qty = request.getParameter("qty");
		int qtyInt = Integer.parseInt(qty);
		ProductModel productModel = new ProductModel();
		productModel.setPno(pnoInt);
		productModel.setPname(pname);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			productModel.setPdate(sdf.parse(pdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		productModel.setUniprice(unipriceDouble);
		productModel.setQty(qtyInt);
		IProductService productService = new ProductServiceImpl();
		try {
			if(todo.equals("增加按钮")) {
					productService.add(productModel);
			} else {
				productService.modify(productModel);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
