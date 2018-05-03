package com.city.blog.service;

public interface IMemberService {
	//增加会员
	public void add(String id,String password,String name,int levelNo) throws Exception;
	//删除会员
	public void delete(String MemberId) throws Exception;
	//修改会员密码
	public void changePassword(String id,String password) throws Exception;
	//修改会员的级别
	public void changeLevel(String id,int deptNo) throws Exception;
	//登录验证方法
	public boolean validate(String id,String password) throws Exception;
	//验证指定级别是否有指定的会员，有返回true, 没有返回false.
	public boolean hasMemberInLevel(int levelNo,String id) throws Exception;
	//激活指定的会员
	public void activeMember(String id) throws Exception;


}
