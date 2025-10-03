package com.bikkadit.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bikkadit.model.Genders;

public interface GendersRepository extends JpaRepository<Genders, Integer> {
	
	@Query("select genderName from Genders")
	public List<Genders> getGenderName();

}
