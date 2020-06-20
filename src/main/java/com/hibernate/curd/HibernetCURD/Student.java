package com.hibernate.curd.HibernetCURD;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	@Id
	private int studentid;
	private String studentName;
	private String studentCourse;
	private double studentFee;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", studentCourse=" + studentCourse
				+ ", studentFee=" + studentFee + "]";
	}
	

}
