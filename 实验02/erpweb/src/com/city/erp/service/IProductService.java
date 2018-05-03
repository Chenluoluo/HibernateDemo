package com.city.erp.service;

import com.city.erp.model.ProductModel;

public interface IProductService {
	public void add(ProductModel cm) throws Exception;
	public void modify(ProductModel cm) throws Exception;
}
