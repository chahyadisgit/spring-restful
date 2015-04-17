/**
 * 
 */
package com.chahyadis.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chahyadis.test.model.MUser;

/**
 * @author Surya Chahyadi
 * @since April, 13rd, 2015
 * @version 1.0
 */
public interface MUserRepository extends MongoRepository<MUser, String> {
	List<MUser> findByUsernameLike(String username);

	List<MUser> findByFirstNameLike(String firstName);

	Long deleteByUsername(String username);
}
