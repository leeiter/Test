package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;
import com.biz.student.utils.StudentInfo;

public class StudentReadServiceV1 {
	
	List<StudentVO> stdList;
	
	public List<StudentVO> getStdList() {
		return this.stdList;
	}
	
	public void readStudent(String fileName) throws IOException {
		
		stdList = new ArrayList<StudentVO>();
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] stds = reader.split(":");
			
			StudentVO studentVO = new StudentVO();
			studentVO.setNum(stds[StudentInfo.LIST.NUM]);
			studentVO.setName(stds[StudentInfo.LIST.NAME]);
			studentVO.setBirth(stds[StudentInfo.LIST.BIRTH]);
			studentVO.setTel(stds[StudentInfo.LIST.TEL]);
			studentVO.setAddr(stds[StudentInfo.LIST.ADDR]);
			studentVO.setYear(stds[StudentInfo.LIST.YEAR]);
			int grade = Integer.valueOf(stds[StudentInfo.LIST.GRADE]);
			studentVO.setGrade(grade);
			studentVO.setDept(stds[StudentInfo.LIST.DEPT]);
			
			stdList.add(studentVO);
		}
		buffer.close();
		fileReader.close();
		
	}
}