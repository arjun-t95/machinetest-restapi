package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IRankingRepo;
import com.app.entity.Ranking;
import com.app.entity.Student;

public class RankingServiceImplementation implements IRankingService {
	
	@Autowired
	private IRankingRepo rankingRepo;

	@Override
	public List<Ranking> getRanking() {
		return (List<Ranking>) rankingRepo.findAll();
	}

	@Override
	public void saveRanking(Ranking ranking) {
		rankingRepo.save(ranking);

	}

	@Override
	public Optional<Ranking> getRanking(int id) {
		return rankingRepo.findById(id);
	}
	
	@Override
	public void deleteRanking(int id) {
		rankingRepo.deleteById(id);
		
	}

	@Override
	public List<Ranking> listActiveRankings() {
		return (List<Ranking>) rankingRepo.listActiveRankings();
	}

	@Override
	public void disableRanking(int id) {
		// TODO Auto-generated method stub
		
	}


	
}
