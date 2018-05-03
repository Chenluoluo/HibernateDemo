package com.city.erp.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.erp.model.ProductCategoryModel;
import com.city.erp.service.IProductCategoryService;
import com.city.erp.service.impl.ProductCategoryServiceImpl;

/**
 * Servlet implementation class ProductCategoryAddController
 */
@WebServlet("/productcategory/add.do")
public class ProductCategoryAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCategoryAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pccode = request.getParameter("pccode");
		String pcname = request.getParameter("pcname");
		ProductCategoryModel pcm = new ProductCategoryModel();
		pcm.setPccode(pccode);
		pcm.setPcname(pcname);
		
		IProductCategoryService pc=new ProductCategoryServiceImpl();
		try {
			pc.add(pcm);
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
