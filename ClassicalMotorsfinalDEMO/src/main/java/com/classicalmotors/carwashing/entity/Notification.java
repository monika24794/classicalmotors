package com.classicalmotors.carwashing.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = " notification_table")
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String title;

	private String message;
	private Date createdAt;

	private boolean isRead;

	@ManyToOne
	@JoinColumn(name = "id_user")
	private Users users;

	public Notification() {
		super();
	}

	public Notification(int id, String title, String message, Date createdAt, boolean isRead, Users users) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
		this.createdAt = createdAt;
		this.isRead = isRead;
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", title=" + title + ", message=" + message + ", createdAt=" + createdAt
				+ ", isRead=" + isRead + ", users=" + users + "]";
	}

}
