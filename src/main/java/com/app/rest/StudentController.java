package com.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.IStudentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {

	
	@Autowired
	private IStudentService studentService;
	
	//Get all 
	@GetMapping("/students/all")
	public List<Student> getAllStudent() {
		
		return studentService.getStudent();
	}
	
	//Get by id
	@GetMapping("/studentd/{id}")
	public Optional<Student> getStudent(@PathVariable int id){
		
		return studentService.getStudent(id);
	}
			
			
	//Add 	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		 
		studentService.saveStudent(student);
	}
			
			
	//Update 
	@PutMapping("/students")
	public void updateStudent(@RequestBody Student student) {
		
		studentService.saveStudent(student);
	}
		
		
	//Delete patient
	@DeleteMapping("/student/{id}")
	public void deleteStudent( @PathVariable int id) {
		
		studentService.disableStudent(id);   
	}

	
}
