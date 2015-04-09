/**
 * 
 */
package com.chahyadis.test.model;

/**
 * Greeting.
 * 
 * @author SXCHAH
 * @since April 07th, 2015
 * @version 1.0
 */
public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

}
