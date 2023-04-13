package com.example.studentapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentapi.models.Student;
import com.example.studentapi.repository.StudentRepository;


@RestController
@RequestMapping("/api/v2")
public class StudentControllerV2 {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/test")
	public String testEndpoint() {
		return "This was sent to version2";
	}
 
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(@RequestParam(value="enjoysClass", required=false) boolean enjoysClass) {
		return new ResponseEntity<> ((List<Student>) studentRepository.findAll(), HttpStatus.OK);
	}
	@GetMapping("/students/{id}")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable(value="id") Long id) {
		Optional<Student> student = studentRepository.getStudentById(id);
		if(!student.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(studentRepository.getStudentById(id), HttpStatus.OK);
	}
	@PostMapping("/students")
	public ResponseEntity<Void> createStudent(@RequestBody Student student, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		studentRepository.save(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
