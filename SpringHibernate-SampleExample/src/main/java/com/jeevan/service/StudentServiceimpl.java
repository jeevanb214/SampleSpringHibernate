package com.jeevan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jeevan.dao.StudentDao;
import com.jeevan.dao.StudentDaoImpl;
import com.jeevan.model.Student;

public class StudentServiceimpl implements StudentService
{

	@Autowired
	StudentDao studentDao;
	
	public void addStudent(Student student)
	{
		// TODO Auto-generated method stub
		System.out.println("AddStudentServiceimpl");
		
		studentDao.addStudent(student);
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
		
	}

	public List<Student> listAllStudents() {
		// TODO Auto-generated method stub
		System.out.println("DisplayStudentServiceimpl");
		
		List<Student> ls=new ArrayList();
		ls=studentDao.listAllStudents();

		
		return ls ;
	}

	public Student getStudentObject(int key) 
	{
		// TODO Auto-generated method stub
		Student st=studentDao.getStudentObject(key);
		
		return st;
	}

	public void updateStudent(Student student)
	{
		// TODO Auto-generated method stub
	
System.out.println("updateStudentServiceimpl");
		
		studentDao.UpdateStudent(student);
	}
	

	
	

	

	

}
