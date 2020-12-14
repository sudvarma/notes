package com.tesco.notes.model;

import java.util.List;
import java.util.ArrayList;

public class CenterAlign  implements Formatter{
	
    class IntPair {
        //The cost or badness
        final int x;

        //The index of word at the beginning of a line
        final int y;
        IntPair(int x, int y) {this.x=x;this.y=y;}
        
        public String toString() {
            return " Badness " + x + " :: Index " + y; 
        }
    }
     
    public List<String> format(String words, int maxWidth) {
    	//TODO provision to provide a different delimiter
    	return format(words.split(" "), maxWidth);
    }
     
    public List<String> format(String[] words, int maxWidth) {
        IntPair[] memo = new IntPair[words.length + 1];

        //Base case
        memo[words.length] = new IntPair(0, 0);
        
        for(int i = words.length - 1; i >= 0; i--) {
            int score = Integer.MAX_VALUE;
            int nextLineIndex = i + 1;
            for(int j = i + 1; j <= words.length; j++) {
                int badness = calcBadness(words, i, j, maxWidth);
                if(badness < 0 || badness == Integer.MAX_VALUE) break;
                int currScore = badness + memo[j].x;
                if(currScore < 0 || currScore == Integer.MAX_VALUE) break;
                if(score > currScore) {
                    score = currScore;
                    nextLineIndex = j;
                }
            }
            memo[i] = new IntPair(score, nextLineIndex);
        }
        
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < words.length) {
            String line = getLine(words, i, memo[i].y);
            result.add(line);
            i = memo[i].y;
        }
        return result;
    }

    private int calcBadness(String[] words, int start, int end, int width) {
        int length = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = start; i < end; i++) {
            sb.append(words[i]);
            length += words[i].length();
            if(length > width) return Integer.MAX_VALUE;
            length++;
        }
        length--;
        int temp = width - length;
        //System.out.println(end + " :: " + sb.toString() + " ===> " + (temp * temp));
        return temp * temp;
    }


    private String getLine(String[] words, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i = start; i < end - 1; i++) {
            sb.append(words[i] + " ");
        }
        sb.append(words[end - 1]);

        return sb.toString();
    }
    
   
  }