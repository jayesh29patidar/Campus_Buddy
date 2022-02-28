package com.campusbuddy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campusbuddy.model.Admin;
import com.campusbuddy.repository.AdminRepository;
import com.campusbuddy.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
	}

}
