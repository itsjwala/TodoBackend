package com.example.demo.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "todoSeq", sequenceName = "todo_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todoSeq")
	private int id;
	private String title;
	@JsonProperty("isCompleted")
	private boolean isCompleted;

	private LocalDateTime createdOn;

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

	
	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", isCompleted=" + isCompleted + ", createdOn=" + createdOn
				+ "]";
	}



}
