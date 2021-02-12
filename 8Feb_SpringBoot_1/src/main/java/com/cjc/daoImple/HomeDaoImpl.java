package com.cjc.daoImple;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao
{
	@Autowired
	SessionFactory sf;
	
	@Override
	public int saveData(Student s) 
	{
		Session sess=sf.openSession();
//		Transaction tr=sess.beginTransaction();
		int id=(Integer)sess.save(s);
		sess.beginTransaction().commit();
		return id;
	}
	public List<Student> loginCheck(String uname,String pass)
	{
		Session sess=sf.openSession();
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			Query q=sess.createQuery("From Student");
			List<Student>slist=q.getResultList();
			return slist;
		}
		else
			{
				Query q=sess.createQuery("From Student where uname=:uname and pass=:pass");
				q.setParameter("uname", uname);
				q.setParameter("pass", pass);
				
				List<Student> slist=q.getResultList();
				return slist;
			}
	}
	@Override
	public List<Student> deleteRecord(int id)
{
		Session sess=sf.openSession();
		Student stu=sess.get(Student.class, id);
		sess.delete(stu);
		sess.beginTransaction().commit();
		Query q=sess.createQuery("From Student");
		List<Student>slist=q.getResultList();
		return slist;
	}
	@Override
	public Student editRecord(int id) 
	{	
		Session sess=sf.openSession();
		Student stu=sess.get(Student.class, id);
		return stu;
	}
	@Override
	public List<Student> updateRecord(Student s)
	{
		Session sess=sf.openSession();
		sess.update(s);
		sess.beginTransaction().commit();
		Query q=sess.createQuery("From Student");
		List<Student>slist=q.getResultList();
		return slist;
	}

}
