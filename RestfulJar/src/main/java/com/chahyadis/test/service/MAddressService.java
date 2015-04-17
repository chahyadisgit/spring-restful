/**
 * 
 */
package com.chahyadis.test.service;

import java.util.List;

import com.chahyadis.test.model.MAddress;

/**
 * @author SXCHAH
 *
 */
public interface MAddressService {
	MAddress findById(String id);
	List<MAddress> findByAddressLike(String address);
	void deleteById(String id);
	MAddress save(MAddress address);
}
