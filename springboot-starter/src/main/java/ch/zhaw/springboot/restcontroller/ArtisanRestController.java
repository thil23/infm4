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

import ch.zhaw.springboot.entities.Artisan;
import ch.zhaw.springboot.repositories.ArtisanRepository;

@RestController
public class ArtisanRestController {
	@Autowired
	private ArtisanRepository repository;

	@RequestMapping(value = "artisan", method = RequestMethod.GET)
	public ResponseEntity<List<Artisan>> getArtisan() {
		List<Artisan> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Artisan>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Artisan>>(HttpStatus.NOT_FOUND);
		}
	} 
	
	@RequestMapping(
			value = "artisan/{Id}",
			method = RequestMethod.GET)
	public ResponseEntity<Optional<Artisan>> getPersonById(
			@PathVariable("Id") long Id) {
				Optional<Artisan> result = this.repository.findById(Id);
				if (result != null) {
					return new ResponseEntity<Optional<Artisan>>(result, HttpStatus.OK);
				} else {
					return new ResponseEntity<Optional<Artisan>>(HttpStatus.NOT_FOUND);
					}
	}	

}
