package ch.zhaw.springboot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Buyer extends Person {
	
	
	private int numberOfBuys;

	//Konstruktor
	public Buyer(int numberOfBuys) {
		super();
		this.numberOfBuys = numberOfBuys;
	}

	public Buyer() {
		
	}
	

	// Getter
	public int getNumberOfBuys() {
		return this.numberOfBuys;
	}


}
