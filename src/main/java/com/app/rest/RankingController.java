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

import com.app.dto.StudentRankingDTO;
import com.app.entity.Ranking;
import com.app.service.IRankingService;




@CrossOrigin
@RestController
@RequestMapping("/api")
public class RankingController {
	
	@Autowired
	private IRankingService rankingService;
	
	//Get all 
	@GetMapping("/rankings/all")
	public List<Ranking> getAllRanking() {
		
		return rankingService.getRanking();
	}

	//Get by id
	@GetMapping("/rankings/{id}")
	public Optional<Ranking> getRanking(@PathVariable int id){
		
		return rankingService.getRanking(id);
	}
			
			
	//Add 	
	@PostMapping("/rankings")
	public void addRanking(@RequestBody Ranking ranking) {
		 
		rankingService.saveRanking(ranking);
	}
			
			
	//Update 
	@PutMapping("/rankings")
	public void updateAppointmentRanking(@RequestBody Ranking ranking) {
		
		rankingService.saveRanking(ranking);
	}
		
		
	//Delete patient
	@DeleteMapping("/appointments/{id}")
	public void deleteAppointment( @PathVariable int id) {
		
		rankingService.disableRanking(id);   
	}

	
}
