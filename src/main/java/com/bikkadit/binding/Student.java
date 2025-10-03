package com.bikkadit.binding;

import com.bikkadit.model.Timings;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_DATA")
public class Student {   //this class bind by front end

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;

	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;

	@Enumerated(EnumType.STRING)
	private Timings timings;   //enum


	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Timings getTimings() {
		return timings;
	}

	public void setTimings(Timings timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "Student{" +
				"stuId=" + stuId +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", phno=" + phno +
				", gender='" + gender + '\'' +
				", course='" + course + '\'' +
				", timings=" + timings +
				'}';
	}
}
