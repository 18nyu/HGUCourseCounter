package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	private String studentId;
	private ArrayList<Course> coursesTaken; // List of courses student has taken
	private HashMap<String,Integer> semestersByYearAndSemester; 
	                                                         // key: Yearprivate Semester
	                                                         // e.g., 2003private 1, 

	public Student(String studentId) {
		// constructor
	}
	public void addCourse(Course newRecord) {
		// 라인을 읽고 있는 상황인가봄
		/*
		 *  뭔지 모르겠지만 여기서 하는 일은
		 * newRecord 라고 입력 받으면 이걸 ArrayList<Course> coursesTaken 에 넣는거
		 * 
		 * coursesTaken.add(newRecord);
		 */
		
	}
	public HashMap<String,Integer> getSemestersByYearAndSemester(){
		return semestersByYearAndSemester;
		
	}
	public int getNumCourseInNthSementer(int semester) {
		/*
		 *  TODO
		 *  입력으로 semester라는 정수를 받으면 이 정수값을 키로 하는 맵 semesterByYearAndSemester에서 데이터를 받아서
		 *  이 때 키는 아마도 1~10 의 정수가 될 것이고, 데이터는 "2002-1" 과 같은 연도와 학기가 표현된 스트링일 것이다.
		 *  이 데이터를 바탕으로 coursesTaken에 해당하는 데이터들의 수를 총 카운트한다.
		 *  스트링을 각 코스의 year와 semeseter를 비교하여 일치할 경우 카운트 한다.
		 *  "2002-1" 일 때, year 는 2002, semester는 1이다.
		 *  course가 가진 정보를 보려면, course,getYearTaken(), course,getSemesterTaken()
		 *  카운트 결과를 리턴.
		 */
		
		return 0;
		
	}
}
