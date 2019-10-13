package com.biz.student.service;

import java.util.List;

import com.biz.student.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {
	
	List<StudentVO> stdList;
	
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	

	@Override
	public void listTitle() {
		System.out.println("==============================================================");
		System.out.println("학생정보");
		System.out.println("==============================================================");
		System.out.println("학번\t이름\t생년월일\t전화번호\t주소\t입학년도\t학년\t전공과목");
		System.out.println("--------------------------------------------------------------");
	}

	@Override
	public void body(StudentVO studentVO) {
		System.out.print(studentVO.getNum() + "\t");
		System.out.print(studentVO.getName() + "\t");
		System.out.print(studentVO.getBirth() + "\t");
		System.out.print(studentVO.getTel() + "\t");
		System.out.print(studentVO.getAddr() + "\t");
		System.out.print(studentVO.getYear() + "\t");
		System.out.print(studentVO.getGrade() + "\t");
		System.out.print(studentVO.getDept() + "\n");
	}

	@Override
	public void viewTotal() {
		this.listTitle();
		for(StudentVO studentVO : stdList) {
			this.body(studentVO);
		}
		System.out.println("==============================================================");
	}

	@Override
	public void nameSearch(String strName) {
		this.listTitle();
		for(StudentVO studentVO : stdList) {
			if(studentVO.getName().contains(strName.trim())) {
				this.body(studentVO);
			}
		}
		System.out.println("==============================================================");
	}

	@Override
	public void gradeSearch(int intGrade) {
		this.listTitle();
		for(StudentVO studentVO : stdList) {
			int grade = studentVO.getGrade();
			if(grade == intGrade) {
				this.body(studentVO);
			}
		}
		System.out.println("==============================================================");
	}

	@Override
	public void gradeSearchList(int grGrade, int lessGrade) {
		this.listTitle();
		for(StudentVO studentVO : stdList) {
			int grade = studentVO.getGrade();
			if(grade >= grGrade && grade <= lessGrade) {
				this.body(studentVO);
			}
		}
		System.out.println("==============================================================");
	}
	
}