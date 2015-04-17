package com.chahyadis.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chahyadis.restfull.model.MAddress;
import com.chahyadis.restfull.model.MUser;
import com.chahyadis.restfull.service.MAddressService;
import com.chahyadis.restfull.service.MUserService;

/**
 * MUserController
 * 
 * @author SXCHAH
 *
 */
@RestController
public final class MUserController {
	private final MUserService userService;
	private final MAddressService addressService;

	@Autowired
	public MUserController(MUserService userService,
			MAddressService addressService) {
		this.userService = userService;
		this.addressService = addressService;
	}
	
	@RequestMapping("/mUser/findAll")
	public List<MUser> findAllUser() {
		return userService.findAll();
	}

	@RequestMapping("/mUser/findFirstName")
	public List<MUser> findUserByFirstName(
			@RequestParam(value = "firstName", required = false) String firstName) {
		return userService.findByFirstNameLike(null == firstName ? ""
				: firstName);
	}

	@RequestMapping("/mUser/findUsername")
	public List<MUser> findUserByUsername(
			@RequestParam(value = "username", required = false) String username) {
		return userService.findByUsernameLike(null == username ? "" : username);
	}

	@RequestMapping(value = "/mUser/deleteUser", method = RequestMethod.DELETE)
	public Long deleteUser(@RequestParam("username") String username) {
		List<MUser> users = userService.findByUsernameLike(username);
		// delete address
		for (MUser mUser : users) {
			for (MAddress address : mUser.getAddress()) {
				addressService.deleteById(address.getId());
			}
		}

		return userService.deleteByUsername(username);

	}
}
