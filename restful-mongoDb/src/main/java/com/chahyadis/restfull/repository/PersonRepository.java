/**
 * 
 */
package com.chahyadis.restfull.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chahyadis.restfull.model.Person;

/**
 * PersonRepository.
 * 
 * @author Chahyadis
 * @since april 9th, 2015
 * @version 1.0
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {
	List<Person> findByLastName(@Param("name") String name);

	List<Person> findByLastNameIgnoreCase(@Param("name") String name);

	Long countByFirstNameLike(@Param("name") String name);
}
