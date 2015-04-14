/**
 * 
 */
package com.chahyadis.restfull.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.chahyadis.restfull.model.MAddress;

/**
 * @author Surya Chahyadi
 * @since April, 13rd, 2015
 * @version 1.0
 */
@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface MAddressRepository extends MongoRepository<MAddress, String> {
	List<MAddress> findByAddressLike(@Param("address") String address);
}
