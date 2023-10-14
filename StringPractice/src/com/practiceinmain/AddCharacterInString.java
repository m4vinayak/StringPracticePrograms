/*Java Program to Add Characters to a String*/
package com.practiceinmain;

public class AddCharacterInString {

	public static void main(String[] args) {
		String str = "Hello Welcome to Java my friend";
		System.out.println("Privious String is: " + str);
		char ch = 's';
		str = str + ch;
		System.out.println("String after adding character 's' : " + str);
	}

}
