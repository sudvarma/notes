package com.tesco.notes.model;

import java.util.List;

public class Note {
	
	private static final int MAX_WIDTH = 15;

	private String id = "";

	private String name = "";

	private String notes = "";

	private Formatter formatter = null;

	public Note(String id, String name, String notes) {
		this.setId(id);
		this.setName(name);
		this.notes = notes;
		this.formatter = new LeftAlign();
	}

	public Note(String id, String name, String notes, Formatter formatter) {
		this.setId(id);
		this.setName(name);
		this.notes = notes;
		this.formatter = formatter;	
	}

	public List<String> format() {
		return formatter.format(notes, MAX_WIDTH);
	}

	
	public List<String> format(int maxWidth) {
		return formatter.format(notes, maxWidth);
	}

	public Formatter getFormatter() {
		return this.formatter;
	}

	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		Note note = new Note("1", "mynote", "Sudheesh Udaya Varma likes to code");
		List<String> formattedNote = note.format();
		for(String line:formattedNote) {
			System.out.println(line);
		}
		
		System.out.println("");
		
		CenterAlign ca =  new CenterAlign();
		note.setFormatter(ca);
		List<String> formattedNoteCenter = note.format();
		for(String line:formattedNoteCenter) {
			System.out.println(line);
		}
	}
}