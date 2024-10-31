package com.learning.springboot.firstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
//@Table(name = "todo")
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String username;

	@Size(min=10 , message ="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean complete;
	
	public Todo() {
		
	}
	
	public Todo(int id, String userName, String description, LocalDate targetDate, boolean complete) {
		super();
		this.id = id;
		this.username = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.complete = complete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", complete=" + complete + "]";
	}
	

}
