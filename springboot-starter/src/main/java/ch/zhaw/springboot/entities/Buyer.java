package ch.zhaw.springboot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.web.client.RestTemplate;

@Entity
public class Buyer extends Person {
	
	private Boolean bonität;
	
	private int numberOfBuys;

	//Konstruktor
	public Buyer(int numberOfBuys) {
		super();
		this.numberOfBuys = numberOfBuys;
		// get Request ... this.getId()
		this.getBonität();
//		this.bonität = getRequest('http://localhost:8080/bonicheck/'+this.getId());
		
	}

	public Buyer() {
		
	}
	

	// Getter
	public int getNumberOfBuys() {
		return this.numberOfBuys;
	}
	
	// Setter
	public void setNumberOfBuys(int numberOfBuys) {
		this.numberOfBuys = numberOfBuys;
	}
	
	//call external Web API
	private void getBonität() {
		final String uri = "http://localhost:8080/bonicheck/"+ this.getId();
		
		RestTemplate restTemplate = new RestTemplate();
		Boolean result = restTemplate.getForObject(uri, Boolean.class);
		
		//Zuweisung
		this.bonität = result;
		
		//output
		System.out.println(result);
	}

}
