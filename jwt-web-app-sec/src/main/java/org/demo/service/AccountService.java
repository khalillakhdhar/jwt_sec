package org.demo.service;

import org.demo.entities.AppRole;
import org.demo.entities.AppUser;

public interface AccountService {
   
	public AppUser saveUser(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser findUserByUsername(String username);
}
