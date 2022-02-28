package com.campusbuddy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campusbuddy.model.Admin;
import com.campusbuddy.model.Student;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	
	List<Admin> findByEmailAndPassword(String email, String password);

}
