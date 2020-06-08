package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
	
	@Query
	("select super.name "
			+ "FROM Person super, Artisan a, Engagement e "
			+ "WHERE super.id = a.id "
			+ "AND e.artisan = a.id "
			+ "AND e.duration = ?1")
	
	public List<String> getPersonsByArtisanByEngagement(
			 long duration );
	
//	public List<Person> getPersonsByArtisanByEngagement(
//			long artisanId, long duration );
}
