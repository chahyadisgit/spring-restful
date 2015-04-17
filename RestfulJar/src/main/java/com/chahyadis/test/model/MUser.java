/**
 * 
 */
package com.chahyadis.test.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Surya Chahyadi
 * @since April, 13rd, 2015
 * @version 1.0
 */
@Document
@CompoundIndexes({
		@CompoundIndex(name = "address_idx", def = "{'firstName':1, 'address':1}"),
		@CompoundIndex(name = "user_idx", def = "{'username':1, 'firstName':1}") })
public class MUser {
	@Id
	private String id;
	@Field("USERNAME")
	@Indexed(unique = true)
	private String username;
	@Field(value = "PASSWORD")
	private String password;
	@Field("FIRST_NAME")
	private String firstName;

	@Field("LAST_NAME")
	private String lastName;
	@DBRef
	private List<MAddress> address;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public List<MAddress> getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(List<MAddress> address) {
		this.address = address;
	}

}
