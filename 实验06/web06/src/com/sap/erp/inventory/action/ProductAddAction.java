package com.sap.erp.inventory.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sap.erp.inventory.factory.ServiceFactory;
import com.sap.erp.inventory.model.ProductModel;

/**
 * Servlet implementation class ProductAddAction
 */
@WebServlet("/product/add.do")
public class ProductAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAddAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pcode = request.getParameter("pcode");
		String pname = request.getParameter("pname");
		String pdate = request.getParameter("pdate");
		String unitprice = request.getParameter("unitprice");
		double unitpriceDouble = Double.parseDouble(unitprice);
		String qtyinstock = request.getParameter("qtyinstock");
		double qtyinstockDouble = Double.parseDouble(qtyinstock);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		ProductModel pm = new ProductModel();
		pm.setPcode(pcode);
		pm.setPname(pname);
		try {
			pm.setPdate(sdf.parse(pdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		pm.setUnitprice(unitpriceDouble);
		pm.setQtyinstock(qtyinstockDouble);
		
		try {
			ServiceFactory.createService().add(pm);
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
