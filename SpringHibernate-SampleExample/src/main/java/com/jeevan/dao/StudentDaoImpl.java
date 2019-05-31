package com.jeevan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.jeevan.model.Student;

public class StudentDaoImpl implements StudentDao
{

	@Autowired
	SessionFactory sessionFactory;
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		System.out.println("addStudentDaoImpl");
		System.out.println("SessionFactory::"+sessionFactory );
		
		Session session = null;
		session = sessionFactory.openSession();
		System.out.println("session::"+session);
		
		
		
		Transaction trnx = session.beginTransaction();
		
		session.save(student);
		
		trnx.commit();
		
		session.close();
		

		
	}

	
	public List<Student> listAllStudents() 
	{
		// TODO Auto-generated method stub
		List<Student> ls=new ArrayList<Student>();
		System.out.println("listallStudentDaoImpl");
		System.out.println("SessionFactory::"+sessionFactory );
		
		
		Session session = null;
		session = sessionFactory.openSession();
		System.out.println("session::"+session);
		//Transaction trnx = session.beginTransaction();
		System.out.println("before Query" );

		Query query=session.createQuery("from Student");
		System.out.println("After Query" );

		
		//session.save(student);
		
		
		
		ls=query.list();
		/*
		 * for(Student stt:ls) { System.out.println(stt.getId());
		 * System.out.println(stt.getName()); System.out.println(stt.getFname()); }
		 */

		
		//trnx.commit();
		
		session.close();
		
		
		return ls;
	}

	public int deleteStudent(int id) {
		// TODO Auto-generated method stub

		

		Session session = null;
		session = sessionFactory.openSession();
		System.out.println("Delete-session::"+session);
		Transaction trnx = session.beginTransaction();
		Student st=(Student) session.get(Student.class, id);
		session.delete(st);
		
		
		/*
		 * session.get(student, id); Query query=session.delete(id);
		 * 
		 * 
		 * session.save(student);
		 */
		  
		  trnx.commit();
		session.close();		
		return 0;
	}


	public Student getStudentObject(int key)
	{
		// TODO Auto-generated method stub
		
			System.out.println("getStudentObject DAO");
		Session session = null;
		session = sessionFactory.openSession();
		Transaction trnx = session.beginTransaction();
		Student st=(Student) session.get(Student.class, key);

		  trnx.commit();
		session.close();	
		
		return st;
	}


	public void UpdateStudent(Student student) 
	{
		// TODO Auto-generated method stub
		System.out.println("UpdateStudentImpl");
		System.out.println("SessionFactory::"+sessionFactory );
		
		Session session = null;
		session = sessionFactory.openSession();
		System.out.println("session::"+session);
		Transaction trnx = session.beginTransaction();
		session.update(student);
		trnx.commit();
		session.close();

		
		
	}
		

	
}
