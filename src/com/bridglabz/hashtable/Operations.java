package com.bridglabz.hashtable;

import java.util.Scanner;

public class Operations {
	public void frequencyOfWords() {
		System.out.println("Write a sentance to find frequency of words:");
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		String[] words = sentance.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0;i < words.length;i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			}else
				value += 1;
			hashMap.put(word, value);	
		}
		System.out.println(hashMap);
	}
	
	public void frequencyOfWordsInParagraph() {
		System.out.println("Write a paragraph to find frequency of words:");
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		String[] words = sentance.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0;i < words.length;i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			}else
				value += 1;
			hashMap.put(word, value);	
		}
		System.out.println(hashMap);	
	}
	
	public void removingWord() {
		System.out.println("Write a paragraph to word:");
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();
		String[] words = sentance.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0;i < words.length;i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			}else
				value += 1;
			hashMap.put(word, value);
			hashMap.remove("not");;	
		}
		System.out.println(hashMap);
	}

}
 