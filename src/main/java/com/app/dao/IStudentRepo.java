package com.app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;



@Repository
public interface IStudentRepo extends CrudRepository<Student, Integer> {
	//Custom Methods - JPQL
		@Modifying
		@Query ("SELECT s FROM Student s WHERE is_active='y' ")
		public List <Student> listActiveStudents();
		
		@Transactional
		@Modifying
		@Query ("UPDATE Student SET is_active='n' WHERE student_id=?1")
		public void disableStudent(int id);

}
