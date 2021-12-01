package com.code;

import org.testng.annotations.Test;

public class CodePractice {
	
	@Test
	public void reverseSentence() {
		
		//Reverse this sentence without reversing the words
		String sentence1 = "Let's reverse this sentence";
		String[] sentence2 = sentence1.split(" ");
		String sentence3 = "";
		
		for(int i = (sentence2.length - 1); i >= 0; i--) {
						
			sentence3 += sentence2[i] + " ";
			
		}
		System.out.println(sentence3);
	}
	
	@Test
	public void deleteLetters() {
		
		String sentence1 = "Let's reverse this sentence";
		String[] sentence2 = sentence1.split(" ");
		String[] word1 = {};
		String sentence3 = "";
		String[] word3 = {};
		String counter = "";
		
		for(int i = 0; i < sentence2.length; i++) {
			counter = "";
			word3 = sentence2[i].split("");
			for(int z = 0; z < word3.length; z++) {
				if(word3[z].equals("e")) {
					counter += (z + 1);
				}
			}
			word1 = sentence2[i].split("e");
			String word2 = "";
			for(int j = 0; j < word1.length; j++) {
				word2 += word1[j];
			}
			sentence3 += word2 + " ";
			System.out.println(counter);
		}
		System.out.println(sentence3);
	}
	
	@Test
	public void findNumberPosition() {
		int[] array1 = {2,5,1,9,2};
		
	}
	
}
