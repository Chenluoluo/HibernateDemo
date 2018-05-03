package com.city.erp.service;

import java.util.List;

import com.city.erp.model.ProductModel;

public interface IProductService {
	// 使用Hibernate完成产品的检索。取得低价和高价之间的产品列表,分页方式
	public List<ProductModel> getListByPriceWithPage(double low, double high, int rows, int page) throws Exception;

	// 取得指定产品价格区间的个数
	public int getCountByPrice(double low, double high) throws Exception;

	// 取得指定产品价格区间的总页数
	public int getPageCountByPrice(double low, double high, int rows) throws Exception;

}
