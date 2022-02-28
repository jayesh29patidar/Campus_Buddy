package com.campusbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusbuddy.model.Admin;
import com.campusbuddy.model.Student;
import com.campusbuddy.repository.AdminRepository;
import com.campusbuddy.repository.StudentRepository;
import com.campusbuddy.services.AdminService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// get all admin
	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {
		return adminService.getAllAdmins();
	}

	// create Admin
	@PostMapping("/admins")
	public Admin createAdmin(@RequestBody Admin admin) {
		System.out.println("Post admin req done");
		return adminService.createAdmin(admin);
	}

	@PostMapping("/admins/login")
	public List<Admin> loginAdmin(@RequestBody Admin admin) {
		System.out.println("admin login called");

		return adminService.loginAdmin(admin);
	}

}
