package ch.zhaw.springboot.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Buyer;
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
	@RequestMapping(value = "engagement/{Id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Engagement>> getPersonById(@PathVariable("Id") long Id) {
		Optional<Engagement> result = this.repository.findById(Id);
		if (result != null) {
			return new ResponseEntity<Optional<Engagement>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<Optional<Engagement>>(HttpStatus.NOT_FOUND);
		}
	}
}
