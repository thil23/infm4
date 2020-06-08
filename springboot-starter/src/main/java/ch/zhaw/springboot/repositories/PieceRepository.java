package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.zhaw.springboot.entities.Piece;
@Repository
public interface PieceRepository extends JpaRepository<Piece,Long>{

}
