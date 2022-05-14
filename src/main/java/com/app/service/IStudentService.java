package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dao.IStudentRepo;
import com.app.entity.Student;

@Service
public interface IStudentService {
		
		//List
		public List<Student>getStudent();
		
		//Insert/Update
		public void saveStudent(Student student);
		
		//Search By Id
	    public Optional <Student> getStudent(int id);
	    
	    //list active Student
	    public List<Student>listActiveStudents();
	    
	    //Disable
	    public void deleteStudent(int id);
	    
	    //Disable
	    public void disableStudent(int id);
	    

}
