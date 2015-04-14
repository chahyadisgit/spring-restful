/**
 * 
 */
package com.chahyadis.restfull.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chahyadis.restfull.model.MUser;

/**
 * @author Surya Chahyadi
 * @since April, 13rd, 2015
 * @version 1.0
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface MUserRepository extends MongoRepository<MUser, String> {
	List<MUser> findByUsernameLike(@Param("username") String username);

	List<MUser> findByFirstNameLike(@Param("firstName") String firstName);
	
	Long deleteByUsername(@Param("username") String username);
}
