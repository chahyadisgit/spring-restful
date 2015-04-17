package com.chahyadis.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chahyadis.test.model.MAddress;
import com.chahyadis.test.model.MUser;
import com.chahyadis.test.service.MAddressService;
import com.chahyadis.test.service.MUserService;

/**
 * MUserController
 * 
 * @author SXCHAH
 *
 */
@RestController
public class MUserController {
	private final MUserService userService;
	private final MAddressService addressService;

	@Autowired
	public MUserController(MUserService userService,
			MAddressService addressService) {
		this.userService = userService;
		this.addressService = addressService;
	}
	
	@RequestMapping("/user/test")
	public String test() {
		return "Test";
	}
	
	@RequestMapping("/user/cari")
	public List<MUser> findAllUser() {
		return userService.findAll();
	}

	@RequestMapping("/user/findFirstName")
	public List<MUser> findUserByFirstName(
			@RequestParam(value = "firstName", required = false) String firstName) {
		return userService.findByFirstNameLike(null == firstName ? ""
				: firstName);
	}

	@RequestMapping("/user/findUsername")
	public List<MUser> findUserByUsername(
			@RequestParam(value = "username", required = false) String username) {
		return userService.findByUsernameLike(null == username ? "" : username);
	}

	@RequestMapping(value = "/user/deleteUser", method = RequestMethod.DELETE)
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
