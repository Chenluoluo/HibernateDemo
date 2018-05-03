package com.city.erp.action;

import java.util.List;
import com.city.erp.model.ProductModel;
import com.city.erp.service.IProductService;
import com.city.erp.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ProductSearchAction extends ActionSupport {
	private double min = 0;
	private double max = 0;
	private int page = 0;

	List<ProductModel> list = null;
	private int count = 0;
	private int pageCount = 0;
	private int rows = 5;

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<ProductModel> getList() {
		return list;
	}

	public void setList(List<ProductModel> list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		IProductService productService = new ProductServiceImpl();
		if(page == 0)
			page = 1;
		list = productService.getListByPriceWithPage(min, max, rows, page);
		count = productService.getCountByPrice(min, max);
		pageCount = productService.getPageCountByPrice(min, max, rows);
		return "success";
	}
}
