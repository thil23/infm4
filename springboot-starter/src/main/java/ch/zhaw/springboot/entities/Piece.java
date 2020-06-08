package ch.zhaw.springboot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String pieceName;
	
	public Piece(long id, String pieceName) {
		this.id = id;
		this.pieceName = pieceName;
	}

	public long getId() {
		return id;
	}

	public String getPieceName() {
		return pieceName;
	}

	
}
