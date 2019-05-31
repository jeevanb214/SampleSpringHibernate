package com.jeevan.dao;

import java.util.List;

import com.jeevan.model.Student;

public interface StudentDao
{

	public void addStudent(Student student);
	public int deleteStudent(int id);
	public List<Student> listAllStudents();	
	public Student getStudentObject(int key);
	public void UpdateStudent(Student student);
}
