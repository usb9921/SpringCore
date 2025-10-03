package com.bikkadit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	

}
