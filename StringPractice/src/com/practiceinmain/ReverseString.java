/*Java String Program to Reverse a String*/
package com.practiceinmain;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Welcome java";
		
		String str1 = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			str1 = str1 + ch;
		}
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+str1);
	}
}
