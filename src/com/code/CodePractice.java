package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		int z = 0;
		
		List<Integer> array2 = new ArrayList<Integer>();
		
		for(int i = 0; i < array1.length; i++) {
			array2.add(array1[i]);
		}
		for(int num2 : array2) {
			if(num2 == num) {
				//array2.remove(z);
				System.out.println("remove " + num2);
			}
			z++; 
		}
		System.out.println(array2);
	}
	
	@Test
	public void countRepeatedNumbers() {
		int[] array1 = {2,5,1,9,2};
		int num = 2;
		
		List<Integer> array2 = new ArrayList<Integer>();
		
		int count;
		for(int i = 0; i < array1.length; i++) {
			count = 0;
			for(int j = i; j < array1.length; j++) {
				if(num == array1[j]) {
					count++;
				}
			}
			if(count < 2) {
				array2.add(array1[i]);
			}
		}
		for(int array3 : array2) {
			count = 0;
			for(int z = 0; z < array1.length; z++) {
				if(array3 == array1[z]) {
					count++;
				}
			}
			System.out.println(array3 + " is repeated " + count + " times");
		}
	}
	
	@Test
	public void aPrintHi() {

		String phrase = "buffalo from Buffalo New York who intimidate other buffalo from Buffalo New York are themselves intimidated by buffalo from Buffalo New York";
        String[] separatedPhrase = phrase.split(" ");
        System.out.printf("Original phrase: %n%s%n", phrase);
        
        //  First convert array into an ArrayList for flexibility
        List<String> phraseAsList = new ArrayList<String>(Arrays.asList(separatedPhrase));
        
        //  Use a stream to get distinct values
        String noDups = phraseAsList
            .stream()
            .distinct()
            .collect(Collectors.joining(" "));
        
        System.out.printf("Phrase without dups: %n%s%n", noDups);
        Integer[] arrDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<Integer> digits = Arrays.asList(arrDigits);
        System.out.println("\n\n\n ========================= \n");
        System.out.printf("Original list of digits: %n%s%n", digits);
        List<Integer> sortedDigits = digits
            .stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.printf("Sorted list of digits: %n%s%n", sortedDigits);
        
	
	}
	
}
