package com.campusbuddy.services;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.campusbuddy.model.Feedback;
import com.campusbuddy.model.Notice;
import com.campusbuddy.model.Student;
import com.campusbuddy.model.TimeTable;

public interface StudentService {

	public List<Student> getAllStudents();

	public List<TimeTable> getAllTimeTables();

	public List<Notice> getNotices();

	public void createFeedback(@RequestBody Feedback feedback);

	public List<Feedback> getAllFeedbacks();

	public Student createStudent(@RequestBody Student student);

	public List<Student> loginStudent(@RequestBody Student student);

	public ResponseEntity<Student> getStudentById(@PathVariable Long id);

	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails);

	public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id);

}
