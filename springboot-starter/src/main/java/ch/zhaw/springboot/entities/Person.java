package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String eMailaddress;

	// Setter
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void seteMailaddress(String eMailaddress) {
		this.eMailaddress = eMailaddress;
	}

	// Getter
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String geteMailaddress() {
		return eMailaddress;
	}

}
