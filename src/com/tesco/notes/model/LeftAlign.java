package com.tesco.notes.model;

import java.util.List;
import java.util.LinkedList;

public class LeftAlign implements Formatter {

    public List<String> format(String words, int maxWidth) {
    	//TODO provision to provide a different delimiter
    	return format(words.split(" "), maxWidth);
    }

    public List<String> format(String[] words, int maxWidth) {
        List<String> line = new LinkedList<>();
        List<String> res = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < words.length; i ++) {
            String s = words[i];
            int newCount = 0;
            if (count == 0) {
                newCount = s.length();
            }
            else {
                newCount = count + 1 + s.length();
            }
            if (newCount <= maxWidth) {
                line.add(s);
                count = newCount;
            }
            else {
                String newLine = getLine(line, maxWidth);
                res.add(newLine);
                line.clear();
                count = s.length();
                line.add(s);
            }
        }

        String newLine = getLine(line, maxWidth);
        res.add(newLine);
        return res;
    }
    
    private String getLine(List<String> line, int width) {
        StringBuilder sb = new StringBuilder();
        for (String word:line) {
            sb.append(word + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        while (sb.length() < width) {
            sb.append(" ");
        }
        return sb.toString();
    }

}