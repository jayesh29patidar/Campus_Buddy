package com.campusbuddy.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.campusbuddy.exception.ResourceNotFoundException;
import com.campusbuddy.model.Feedback;
import com.campusbuddy.model.Notice;
import com.campusbuddy.model.Student;
import com.campusbuddy.model.TimeTable;
import com.campusbuddy.repository.FeedbackRepository;
import com.campusbuddy.repository.NoticeRepository;
import com.campusbuddy.repository.StudentRepository;
import com.campusbuddy.repository.TimeTableRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TimeTableRepository timeTableRepository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Autowired
	private NoticeRepository noticeRepository;

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public List<TimeTable> getAllTimeTables() {

		return timeTableRepository.findAll();
	}

	@Override
	public List<Notice> getNotices() {
		// TODO Auto-generated method stub
		return noticeRepository.findAll();
	}

	@Override
	public void createFeedback(Feedback feedback) {
		feedbackRepository.save(feedback);

	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return feedbackRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> loginStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.findByEmailIdAndPassword(student.getEmailId(), student.getPassword());
	}

	@Override
	public ResponseEntity<Student> getStudentById(Long id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exitst with id:" + id));

		return ResponseEntity.ok(student);
	}

	@Override
	public ResponseEntity<Student> updateStudent(Long id, Student studentDetails) {
		// TODO Auto-generated method stub
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exitst with id:" + id));

		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		student.setEmailId(studentDetails.getEmailId());

		Student updtedStudent = studentRepository.save(student);
		return ResponseEntity.ok(updtedStudent);
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteStudent(Long id) {
		// TODO Auto-generated method stub
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student not exitst with id:" + id));

		studentRepository.delete(student);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
