package com.studendent.manage;

public class student 
{
	private int studentId;
	private String StudentName;
	private String Studentphone;
	private String Studentcity;
	
	public student() 
	{
		super();
	}

	public student(int studentId, String studentName, String studentphone, String studentcity) 
	{
		super();
		this.studentId = studentId;
		StudentName = studentName;
		Studentphone = studentphone;
		Studentcity = studentcity;
	}

	public student(String studentName, String studentphone, String studentcity)
	{
		super();
		StudentName = studentName;
		Studentphone = studentphone;
		Studentcity = studentcity;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentphone() {
		return Studentphone;
	}

	public void setStudentphone(String studentphone) {
		Studentphone = studentphone;
	}

	public String getStudentcity() {
		return Studentcity;
	}

	public void setStudentcity(String studentcity) {
		Studentcity = studentcity;
	}

	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", StudentName=" + StudentName + ", Studentphone=" + Studentphone
				+ ", Studentcity=" + Studentcity + "]";
	}
	
	
	
}
