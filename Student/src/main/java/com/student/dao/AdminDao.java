package com.student.dao;

import com.student.entity.Marks;
import com.student.entity.StudentInformation;

public interface AdminDao  {
	boolean adminLogin(String email,String password);
	int removeStudent(int id);
	int updateStudent(StudentInformation student);
	int updateStudentMarks(Marks marks);
}
