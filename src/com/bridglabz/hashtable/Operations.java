package com.bridglabz.hashtable;

import java.util.Scanner;

public class Operations {
	public void frequencyOfWords() {
		System.out.println("Enter a sentance to find frequency of words:");
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

}
 