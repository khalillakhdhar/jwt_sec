package org.demo.dao;

import org.demo.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<AppUser, Long> {
	
	public AppUser findByUsername(String username);

}
