package org.demo.dao;

import org.demo.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole,Long>{
	
	public AppRole findByRoleName(String roleName);

}
