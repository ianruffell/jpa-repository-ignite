package org.gridgain.demo.springdata.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Integer> {
	
}