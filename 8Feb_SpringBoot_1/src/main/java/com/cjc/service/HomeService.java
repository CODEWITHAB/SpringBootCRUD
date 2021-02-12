package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface HomeService 
{
	public	int saveData(Student s);

	public List<Student> loginCheck(String uname, String pass);
	
	public List<Student> deleteRecord(int id);
	
	public Student editRecord(int id);
	
	public List<Student>updateRecord(Student s);
	
	
}
