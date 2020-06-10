package ch.zhaw.springboot.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Engagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long engagementId;
	private long duration;
	private double price;

	// Konstruktor

	public Engagement(long engagementId, long duration, double price, Artisan artisan, Buyer buyer) {
		this.engagementId = engagementId;
		this.duration = duration;
		this.price = price;
		this.artisan = artisan;
		this.buyer = buyer;
	}

	public Engagement() {

	}

	// Getter

	public long getEngagementId() {
		return this.engagementId;
	}

	public long getDuration() {
		return this.duration;
	}

	public double getPrice() {
		return this.price;
	}

	public Artisan getArtisan() {
		return this.artisan;
	}

	public Buyer getBuyer() {
		return this.buyer;
	}

	public Set<Piece> getPieces() {
		return pieces;
	}

	// Setter

	public void setEngagementId(long engagementId) {
		this.engagementId = engagementId;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public void setPieces(Set<Piece> pieces) {
		this.pieces = pieces;
	}

	// Beziehungen
	@ManyToOne
	private Artisan artisan;

	@ManyToOne
	private Buyer buyer;

	@ManyToMany
	private Set<Piece> pieces;
}
