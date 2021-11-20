package com.bridglabz.hashtable;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Operations operate = new Operations();
		System.out.println("\nEnter 1 to find frequency of words in a sentance\nEnter 2 to find frequency"
				+ "of words in a paragraph\nEnter 3 to delete a word from paragraph");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 1:
			operate.frequencyOfWords();
			break;
		case 2:
			operate.frequencyOfWordsInParagraph();
			break;
		case 3:
			operate.removingWord();
			break;
		default:
			sc.close();
			break;
		}
		sc.close();
	}

}
