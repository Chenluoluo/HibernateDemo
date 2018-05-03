package com.city.erp.service;

import com.city.erp.model.OrderModel;

public interface IOrderService {
	public void add(OrderModel ov) throws Exception;
	public void delete(OrderModel ov) throws Exception;
}
