package com.tesco.notes.model;

import java.util.List;

public interface Formatter {
	public List<String> format(String words, int maxWidth);
}
