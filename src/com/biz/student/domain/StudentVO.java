package com.biz.student.domain;

public class StudentVO {

	private String num;
	private String name;
	private String birth;
	private String tel;
	private String addr;
	private String year;
	private int grade;
	private String dept;
	
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentVO(String num, String name, String birth, String tel,
			String addr, String year, int grade, String dept) {
		super();
		this.num = num;
		this.name = name;
		this.birth = birth;
		this.tel = tel;
		this.addr = addr;
		this.year = year;
		this.grade = grade;
		this.dept = dept;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "StudentVO [num=" + num + ", name=" + name + ", birth=" + birth
				+ ", tel=" + tel + ", addr=" + addr + ", year=" + year
				+ ", grade=" + grade + ", dept=" + dept + "]";
	}
	
}