package edu.handong.analysis.datamodel;

import java.io.BufferedReader;

public class Course {

	private String studentId;
	private String yearMonthGraduated;
	private String firstMajor;
	private String secondMajor;
	private String courseCode;
	private String courseName;
	private String courseCredit;
	private int yearTaken;
	private int semesterCourseTaken;

	 Course(String line){
		 
		 char comma;
		 comma = hw5data.indexof(",");
		 
		 studentId = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 yearMonthGraduated = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 firstMajor = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 secondMajor = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 courseCode = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 courseName = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 courseCredit = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 yearTaken = Integer.parseInt(hw5data.substr(0, comma));
		 
		 hw5data = hw5data.substring(comma+1, hw5data.length()-1);
		 semesterCourseTaken = Integer.parseInt(hw5data.substr(0, comma));
		 
	 }

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getYearMonthGraduated() {
		return yearMonthGraduated;
	}

	public void setYearMonthGraduated(String yearMonthGraduated) {
		this.yearMonthGraduated = yearMonthGraduated;
	}

	public String getFirstMajor() {
		return firstMajor;
	}

	public void setFirstMajor(String firstMajor) {
		this.firstMajor = firstMajor;
	}

	public String getSecondMajor() {
		return secondMajor;
	}

	public void setSecondMajor(String secondMajor) {
		this.secondMajor = secondMajor;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(String courseCredit) {
		this.courseCredit = courseCredit;
	}

	public int getYearTaken() {
		return yearTaken;
	}

	public void setYearTaken(int yearTaken) {
		this.yearTaken = yearTaken;
	}

	public int getSemesterCourseTaken() {
		return semesterCourseTaken;
	}

	public void setSemesterCourseTaken(int semesterCourseTaken) {
		this.semesterCourseTaken = semesterCourseTaken;
	}
	 
	 
}
