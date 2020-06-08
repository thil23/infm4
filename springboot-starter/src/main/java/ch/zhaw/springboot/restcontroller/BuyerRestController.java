package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Buyer;
import ch.zhaw.springboot.repositories.BuyerRepository;

@RestController
public class BuyerRestController {
	@Autowired
	private BuyerRepository repository;

	@RequestMapping(value = "buyer", method = RequestMethod.GET)
	public ResponseEntity<List<Buyer>> getBuyer() {
		List<Buyer> result = this.repository.findAll();

		if (!result.isEmpty()) {
			return new ResponseEntity<List<Buyer>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Buyer>>(HttpStatus.NOT_FOUND);
		}
	}
}


