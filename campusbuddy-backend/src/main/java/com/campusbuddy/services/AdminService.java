package com.campusbuddy.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.campusbuddy.model.Admin;

public interface AdminService {

	public List<Admin> getAllAdmins();

	public Admin createAdmin(@RequestBody Admin admin);

	public List<Admin> loginAdmin(@RequestBody Admin admin);
}
