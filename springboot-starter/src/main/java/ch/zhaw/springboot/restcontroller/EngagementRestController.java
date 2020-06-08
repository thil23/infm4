package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Engagement;
import ch.zhaw.springboot.repositories.EngagementRepository;

@RestController
public class EngagementRestController {

	@Autowired
	private EngagementRepository repository;
	

	//Requestmapping
	@RequestMapping(value = "engagement", method = RequestMethod.GET)
	public ResponseEntity<List<Engagement>> getEngagement() {
		List<Engagement> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Engagement>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Engagement>>(HttpStatus.NOT_FOUND);
		} 
	
	}
}
