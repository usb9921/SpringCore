package com.bikkadit.repository;

import com.bikkadit.binding.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {



}
