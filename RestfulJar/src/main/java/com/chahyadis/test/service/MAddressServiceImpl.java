/**
 * 
 */
package com.chahyadis.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chahyadis.test.model.MAddress;
import com.chahyadis.test.repository.MAddressRepository;

/**
 * @author SXCHAH
 *
 */
@Service
public final class MAddressServiceImpl implements MAddressService {
	private MAddressRepository addressRepository;
	
	@Autowired
	public MAddressServiceImpl(MAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	public List<MAddress> findByAddressLike(String address) {
		return addressRepository.findByAddressLike(address);
	}

	public void deleteById(String id) {
		addressRepository.delete(id);
	}

	public MAddress findById(String id) {
		return addressRepository.findOne(id);
	}

	public MAddress save(MAddress address) {
		return addressRepository.save(address);
		
	}

}
