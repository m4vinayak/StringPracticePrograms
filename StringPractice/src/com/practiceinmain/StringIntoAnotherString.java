/*Java String Program to Insert a string into another string*/
package com.practiceinmain;

public class StringIntoAnotherString {
	
	public static void main(String[] args) {
//		String str = new String("welcome ");
//		System.out.println(str.concat("java"));
//		String str1 = "Hello ";
//		System.out.println(str1.concat("java"));
//		System.out.println(str.concat(str1));
		
		String str = "welcome ";
		String str1 = "java";
		for(int i = 0; i<=str1.length()-1;i++) {
			char ch = str1.charAt(i);
			str = str+ch;
		}
	
		System.out.println(str);
		
	}

}
