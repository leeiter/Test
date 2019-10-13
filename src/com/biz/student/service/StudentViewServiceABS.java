package com.biz.student.service;

import com.biz.student.domain.StudentVO;

public abstract class StudentViewServiceABS {

	public abstract void listTitle();
	
	public abstract void body(StudentVO studentVO);
	
	public abstract void viewTotal();
	
	public abstract void nameSearch(String strName);
	
	public abstract void gradeSearch(int intGrade);
	
	public abstract void gradeSearchList(int grGrade, int lessGrade);
		
}