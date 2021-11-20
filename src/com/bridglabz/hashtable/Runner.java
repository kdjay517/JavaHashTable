package com.bridglabz.hashtable;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		System.out.println("\nEnter 1 to find frequency of words in a sentance");
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:
			Operations operate = new Operations();
			operate.frequencyOfWords();
			break;
		default:
			sc.close();
			break;
			
		}
		sc.close();
	}

}
