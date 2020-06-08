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

import ch.zhaw.springboot.entities.Engagement;
import ch.zhaw.springboot.entities.Person;
import ch.zhaw.springboot.repositories.PersonRepository;

@RestController
public class PersonRestController {
	@Autowired
	private PersonRepository repository;

	@RequestMapping(value = "persons", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> getPersons() {
		List<Person> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Person>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Person>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "persons/{duration}", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getPersonByArtisanByEngagement(@PathVariable("duration") long duration) {
		List<String> result = this.repository.getPersonsByArtisanByEngagement(duration);

		if (!result.isEmpty()) {
			return new ResponseEntity<List<String>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<String>>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "persons/{Id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<Person>> getPersonById(@PathVariable("Id") long Id) {
		Optional<Person> result = this.repository.findById(Id);
		if (result != null) {
			return new ResponseEntity<Optional<Person>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<Optional<Person>>(HttpStatus.NOT_FOUND);
		}
	}
}