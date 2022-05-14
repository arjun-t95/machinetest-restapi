package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Ranking;

@Service
public interface IRankingService {
	
	
	
	//List
	public List<Ranking>getRanking();
	
	//Insert/Update
	public void saveRanking(Ranking ranking);
	
	//Search By Id
    public Optional <Ranking> getRanking(int id);
    
    //list active 
    public List<Ranking>listActiveRankings();
    
    //Disable
    public void deleteRanking(int id);
    
    //Disable
    public void disableRanking(int id);

}
