package com.sageisinc.model.services;

import com.sageisinc.model.common.exceptions.InstanceNotFoundException;
import com.sageisinc.model.entities.AppUser;

/**
 * The Interface PermissionChecker.
 */
public interface PermissionChecker {
	
	/**
	 * Check user exists.
	 *
	 * @param userId the user id
	 * @throws InstanceNotFoundException the instance not found exception
	 */
	public void checkUserExists(Long userId) throws InstanceNotFoundException;
	
	/**
	 * Check user.
	 *
	 * @param userId the user id
	 * @return the user
	 * @throws InstanceNotFoundException the instance not found exception
	 */
	public AppUser checkUser(Long userId) throws InstanceNotFoundException;
	
}
