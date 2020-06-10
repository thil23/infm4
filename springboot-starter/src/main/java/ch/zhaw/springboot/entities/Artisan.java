package ch.zhaw.springboot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Artisan extends Person {


	private String artisanProfession;
	//Commitcheck


	//Konstruktor
	public Artisan(String artisanProfession) {
		super();
		this.artisanProfession = artisanProfession;
	}

	public Artisan() {
		
	}
	// Setter
	public void setArtisanProfession(String artisanProfession) {
		this.artisanProfession = artisanProfession;
	}
	
	// Getter
	public String getArtisanProfession() {
		return artisanProfession;
	}


	
}
