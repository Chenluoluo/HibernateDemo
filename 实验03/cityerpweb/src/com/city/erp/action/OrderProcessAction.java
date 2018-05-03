package com.city.erp.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.erp.model.OrderModel;
import com.city.erp.service.IOrderService;
import com.city.erp.service.impl.OrderServiceImpl;

/**
 * Servlet implementation class OrderProcessAction
 */
@WebServlet("/order/add.do")
public class OrderProcessAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderProcessAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String doit = request.getParameter("do");
		String orderno = request.getParameter("orderno");
		int ordernoInt = Integer.parseInt(orderno);
		String orderid = request.getParameter("orderid");
		String customername = request.getParameter("customername");
		String orderdate = request.getParameter("orderdate");
		String deliverydate = request.getParameter("deliverydate");
		String paydate = request.getParameter("paydate");
		String orderamount = request.getParameter("orderamount");
		Double orderamountDouble = Double.parseDouble(orderamount);
		String deliveryfee = request.getParameter("deliveryfee");
		Double deliveryfeeDouble = Double.parseDouble(deliveryfee);
		OrderModel orderModel = new OrderModel();
		orderModel.setOrderno(ordernoInt);
		orderModel.setOrderid(orderid);
		orderModel.setCustomername(customername);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			orderModel.setOrderdate(sdf.parse(orderdate));
			orderModel.setDeliverydate(sdf.parse(deliverydate));
			orderModel.setPaydate(sdf.parse(paydate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		orderModel.setOrderamount(orderamountDouble);
		orderModel.setDeliveryfee(deliveryfeeDouble);
		
		IOrderService osi = new OrderServiceImpl();
		
		if(doit.equals("增加按钮")) {
			try {
				osi.add(orderModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				osi.delete(orderModel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
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
