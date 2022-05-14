package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IStudentRepo;
import com.app.entity.Student;
@Service
public class StudentServiceImplementation implements IStudentService {
	
	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public List<Student> getStudent() {
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);

	}

	@Override
	public Optional<Student> getStudent(int id) {
		return studentRepo.findById(id);
	}
	
	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
		
	}

	@Override
	public void disableStudent(int id) {
		studentRepo.disableStudent(id);

	}

	@Override
	public List<Student> listActiveStudents() {
		return (List<Student>) studentRepo.listActiveStudents();
	}

	
}
