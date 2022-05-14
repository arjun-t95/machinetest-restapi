package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.dto.StudentRankingDTO;
import com.app.entity.Ranking;

public interface IRankingRepo extends CrudRepository<Ranking, Integer> {
	//Custom Methods - JPQL
	@Modifying
	@Query ("SELECT r FROM Ranking r WHERE is_active='y'")
	public List <Ranking> listActiveRankings();
	
	@Query("SELECT new com.app.dto.StudentRankingDTO (r.rank, s.studentId, s.studentName, r.application_code, r.course_name, r.average, r.credits, r.approvedDate) "
				+ "FROM Student s "
				+ "INNER JOIN s.ranking r " )  
		public List <StudentRankingDTO> findAllDTORanking();

}
