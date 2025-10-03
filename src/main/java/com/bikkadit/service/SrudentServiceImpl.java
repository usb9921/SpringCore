package com.bikkadit.service;

import java.util.ArrayList;
import java.util.List;

import com.bikkadit.binding.Student;
import com.bikkadit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.model.Course;
import com.bikkadit.model.Genders;
import com.bikkadit.repository.CourseRepository;
import com.bikkadit.repository.GendersRepository;

@Service
public class SrudentServiceImpl {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private GendersRepository genderRepository;
	
	@Autowired
	private CourseRepository courseRepository;


	public Student addStudent(Student stu){
		Student addedStu = studentRepository.save(stu);
		return addedStu;
	}
	
	public List<String> getGender(){
		List<Genders> findall = genderRepository.findAll();
		
		List<String> gdrs =new ArrayList<String>();
		for(Genders g : findall) {
			gdrs.add(g.getGenderName());
		}
		return gdrs;
	}
	
	public List<String> getCourse(){
          List<Course> findall1 = courseRepository.findAll();
          
          List<String> crs=new ArrayList<String>();
          for(Course c : findall1) {
        	  crs.add(c.getCourseName());
          }
          return crs;
	}
	
	/*public List<String> getTimings(){
		List<TimeA> findall2 = timingRepository.findAll();
		
		List<String> tgs=new ArrayList<String>();
		for(TimeA t : findall2) {
			tgs.add(t.getTimingName());
		}
		return tgs;
	}*/
}
