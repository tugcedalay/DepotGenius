package com.depotgenius.dataAccess;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.depotgenius.entities.concretes.Shelf;

public interface ShelfRepository extends JpaRepository<Shelf, UUID>{
      
	List<Shelf> findAll();
	
	@Query("SELECT s FROM Shelf s WHERE s.product.id = :productId and s.count < s.capacity")
	Optional<Shelf> findByProductIdNotFull(UUID productId);
	
	
	List<Shelf> findAllByProductIdAndCountGreaterThan(UUID productId, int count);
	
	@Query("SELECT COALESCE (sum(s.count),0) FROM Shelf s WHERE s.product.id = :productId")
    Integer sumCountByProductId(UUID productId); 
	 
	List<Shelf> findAllByCountAndProductId(int count, UUID productId);
}
