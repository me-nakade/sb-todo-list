package com.example.menakade;

public class Todo {
	private Long id;
	private String title;
	private String deadline;
	private String notes;
	
	public Todo(Long id, String title, String deadline, String notes) {
		this.id = id;
		this.title = title;
		this.deadline = deadline;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
