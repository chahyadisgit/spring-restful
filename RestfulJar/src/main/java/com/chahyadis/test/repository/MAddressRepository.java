/**
 * 
 */
package com.chahyadis.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chahyadis.test.model.MAddress;

/**
 * MAddressRepository
 * @author SXCHAH
 *
 */
public interface MAddressRepository extends MongoRepository<MAddress, String> {
	List<MAddress> findByAddressLike(String address);
}
