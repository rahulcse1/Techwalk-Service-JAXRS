package com.techwalk.rs.Techwalk_Service_JAXRS.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author techwalk
 *
 */

@XmlRootElement
public class Message {
	private Long id;
	private String message;
	private Date created;
	private Author author;

	public Message() {
	}

	public Message(Long id, String message, Author author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}