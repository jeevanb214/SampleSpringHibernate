package com.jeevan.service;

import java.util.List;

import com.jeevan.model.Student;

public interface StudentService 
{

	 void addStudent(Student student);
	 void deleteStudent(int id);
	 List<Student> listAllStudents();
	Student getStudentObject(int key);
	void updateStudent(Student student);
	 
}
