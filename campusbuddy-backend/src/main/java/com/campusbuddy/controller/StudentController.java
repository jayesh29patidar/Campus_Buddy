package com.campusbuddy.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.campusbuddy.services.StudentService;
import com.campusbuddy.model.Feedback;
import com.campusbuddy.model.Notice;
import com.campusbuddy.model.Student;
import com.campusbuddy.model.TimeTable;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//get all students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();	
	}

	@GetMapping("/timetable")
	public List<TimeTable> getAllTimeTables(){
		return studentService.getAllTimeTables();
	}

//	get notice
	@GetMapping("/students/notice")
	public List<Notice> getNotices(){
		return studentService.getNotices();
	}
	
//	create feedback 
	@PostMapping("/students/feedback")
	public void createFeedback(@RequestBody Feedback feedback) {
		
	}

//	get all feedback
	@GetMapping("/students/feedback")
	public List<Feedback> getAllFeedbacks(){
		return studentService.getAllFeedbacks();
	}

//	 create add student
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PostMapping("/students/login")
	public List<Student> loginStudent(@RequestBody Student student) {
		System.out.println("login called");
		return studentService.loginStudent(student);
	}

//	get Student by Id
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
			
		return studentService.getStudentById(id);
	}

//update Student 
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails){
		
	return studentService.updateStudent(id, studentDetails);
	}
	
//	delete student 
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id){
		return studentService.deleteStudent(id);
	}
}
