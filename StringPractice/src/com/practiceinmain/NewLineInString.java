/*Java String Program to Print a New Line in String*/
package com.practiceinmain;

public class NewLineInString {
	public static void main(String[] args) {
		String str = "Welcome to java";
		String str1=str.concat(System.lineSeparator()+"hello");
		System.out.println(str1);
	}

}
