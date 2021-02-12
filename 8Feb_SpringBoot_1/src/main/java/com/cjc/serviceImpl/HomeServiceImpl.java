package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.dao.HomeDao;
import com.cjc.model.Student;
import com.cjc.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeDao hd;

	@Override
	public int saveData(Student s) 
	{
		
		return hd.saveData(s);
	}

	@Override
	public List<Student> loginCheck(String uname, String pass) {
		
		return hd.loginCheck(uname, pass);
	}

	@Override
	public List<Student> deleteRecord(int id) {
		
		return hd.deleteRecord(id);
	}

	@Override
	public Student editRecord(int id) {
		
		return hd.editRecord(id);
	}

	@Override
	public List<Student> updateRecord(Student s) {
		
		return hd.updateRecord(s);
	}
	

}
