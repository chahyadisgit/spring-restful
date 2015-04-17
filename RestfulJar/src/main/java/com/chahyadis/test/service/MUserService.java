/**
 * 
 */
package com.chahyadis.test.service;

import java.util.List;

import com.chahyadis.test.model.MUser;

/**
 * @author SXCHAH
 *
 */
public interface MUserService {
	List<MUser> findAll();
	List<MUser> findByUsernameLike(String username);

	List<MUser> findByFirstNameLike(String firstName);
	
	Long deleteByUsername(String username);
	
	MUser save(MUser user);
}
