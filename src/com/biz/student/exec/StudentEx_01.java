package com.biz.student.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;
import com.biz.student.service.StudentReadServiceV1;
import com.biz.student.service.StudentViewServiceABS;
import com.biz.student.service.StudentViewServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV1();
		
		String fileName = "src/com/biz/student/학생정보.txt";
		
		Scanner scan = new Scanner(System.in);
		
		try {
			sRead.readStudent(fileName);
			
			List<StudentVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
			
			sView.viewTotal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("====================");
			System.out.println("학생검색");
			System.out.println("====================");
			System.out.println("1.학생이름 2.학생학년 3.학년만 0.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 >> ");
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 0) break;
			
			if(intM == 1) {
				System.out.print("학생이름 >> ");
				String strName = scan.nextLine();
				sView.nameSearch(strName);
			} else if(intM == 2) {
				System.out.print("학생학년 >> ");
				String strGrade = scan.nextLine();
				sView.gradeSearch(Integer.valueOf(strGrade));
			} else if(intM == 3) {
				System.out.print("최저학년 >> ");
				String sGrade = scan.nextLine();
				System.out.print("최대학년 >> ");
				String eGrade = scan.nextLine();
				
				sView.gradeSearchList(Integer.valueOf(sGrade), Integer.valueOf(eGrade));
			}
		}
		System.out.println("종료");
	}

}