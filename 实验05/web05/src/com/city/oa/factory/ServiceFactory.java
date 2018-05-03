package com.city.oa.factory;

import com.city.oa.service.IEmployeeService;
import com.city.oa.service.impl.EmployeeServiceImpl;

public class ServiceFactory {
	public static IEmployeeService createService() {
		return new EmployeeServiceImpl();
	}
}
