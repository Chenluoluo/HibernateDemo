package com.city.blog.action;

import com.city.blog.service.IMemberService;
import com.city.blog.service.impl.MemberServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		IMemberService memberService = new MemberServiceImpl();
//		测试增加会员
		memberService.add("1", "1", "陈希", 1);
//		测试删除会员
		memberService.delete("1");
		memberService.add("1", "1", "陈希", 1);
//		修改会员密码
		memberService.changePassword("1", "2");
//		修改会员级别
		memberService.changeLevel("1", 2);
//		验证会员是否合法
		if(memberService.validate("1", "1"))
			System.out.println("密码正确");
		else
			System.out.println("密码错误");
//		检查指定级别是否有指定会员
		if(memberService.hasMemberInLevel(1, "1"))
			System.out.println("这个级别有会员");
		else
			System.out.println("这个级别没有会员");
//		激活会员等方法
		memberService.activeMember("1");
		return "success";
	}
}
