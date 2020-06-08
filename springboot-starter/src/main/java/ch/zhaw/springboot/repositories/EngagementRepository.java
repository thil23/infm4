package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.zhaw.springboot.entities.Engagement;
@Repository
public interface EngagementRepository extends JpaRepository<Engagement,Long>{

}
