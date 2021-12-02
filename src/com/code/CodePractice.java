package com.code;

import java.util.ArrayList;
import java.util.List;

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
		int num = 9;
		
		List<Integer> array2 = new ArrayList<Integer>();
		List<Integer> position = new ArrayList<Integer>();
		
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == num) {
				array2.add(array1[i]);
				position.add(i + 1);
			}
		}
		System.out.println("Number " + num + " is displayed in the position(s):" + position);
		System.out.println("Number " + num + " is displayed " + position.size() + " time(s)");
	}
	
	@Test
	public void removeNumber() {
		int[] array1 = {2,5,1,9,2};
		int num = 5;
		int j = 0;
		
		List<Integer> array2 = new ArrayList<Integer>();
		
		for(int i = 0; i < array1.length; i++) {
			array2.add(array1[i]);
		}
		for(int num2 : array2) {
			if(num2 == num) {
				//array2.remove(j);
				System.out.println("remove " + num2);
			}
			j++;
		}
		System.out.println(array2);
	}
	
	
	
}
