package com.cjc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Controller
public class HomeController
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/") //--->CALL BACK CONCEPT
	public String firstpage()
	{
		return "login";
		
	}
	
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("uname")String uname,@RequestParam("pass")String pass,Model m)
	{
		List<Student>slist=hs.loginCheck(uname,pass);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/register")
	public String preRegiser()
	{
		return "register";
		
	}
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("stu")Student s)
	{
		System.out.println(s);
		int id=hs.saveData(s);
		if(id>0)
		{
			return"login";
			
		}
		else
		{
			return "register";
		}
	}
	
	@RequestMapping("/delete")
	public String deleteRecord(@RequestParam("id")int id,Model m)	
	{
		List<Student>slist=hs.deleteRecord(id);
		m.addAttribute("data", slist);
		return "success";
	}
	
	@RequestMapping("/add")
	public String addRecord()
	{
		return"register";
	}
	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("id")int id,Model m)
	{
		Student stu=hs.editRecord(id);
		m.addAttribute("s", stu);
		return "update";
	}
	@RequestMapping("/update")
	public String editRecord(@ModelAttribute("stu")Student s,Model m)
	{
		List<Student>slist=hs.updateRecord(s);
		m.addAttribute("data", slist);
		return "success";
	}
	
}
