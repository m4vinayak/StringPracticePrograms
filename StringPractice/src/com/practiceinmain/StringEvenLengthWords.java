/*Java String Program to Print even length words*/
package com.practiceinmain;

public class StringEvenLengthWords {

	public static void main(String[] args) {
		
		String str = "welcome java";
		System.out.println("even length words are: ");
		for(int i = 0; i<=str.length()-1;i++) {
			char ch = str.charAt(i);
			if(i%2==0) {
				System.out.println(ch);
			}
		}
	}
	
}
