/**
 * 
 */
package com.chahyadis.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chahyadis.test.model.MUser;
import com.chahyadis.test.repository.MUserRepository;

/**
 * MUserServiceImpl.
 * 
 * @author SXCHAH
 *
 */
@Service
public final class MUserServiceImpl implements MUserService {
	private MUserRepository mUserRepository;
	
	@Autowired
	public MUserServiceImpl(MUserRepository mUserRepository) {
		this.mUserRepository = mUserRepository;
	}

	public List<MUser> findByUsernameLike(String username) {
		return mUserRepository.findByUsernameLike(username);
	}

	public List<MUser> findByFirstNameLike(String firstName) {
		return mUserRepository.findByFirstNameLike(firstName);
	}

	public Long deleteByUsername(String username) {
		return mUserRepository.deleteByUsername(username);
	}

	public MUser save(MUser user) {
		return mUserRepository.save(user);
	}

	public List<MUser> findAll() {
		return mUserRepository.findAll();
	}
}
