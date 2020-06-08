package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ch.zhaw.springboot.entities.Buyer;
import ch.zhaw.springboot.entities.Engagement;
@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Long>{
	
//	//complex query inner join
//	@Query("select count(*) from buyer")
//	public long getCountfromBuyer();
//	
//	//native Query
//	public Engagement findByEngangement(@Param ("engagementid") long engagementId);
//	
}
