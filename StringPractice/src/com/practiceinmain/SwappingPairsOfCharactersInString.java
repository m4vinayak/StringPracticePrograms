/*Swapping Pairs of Characters in a String in Java*/
package com.practiceinmain;

public class SwappingPairsOfCharactersInString {
	
	public static void main(String[] args) {
		String str = "Java is Platform independant";
		System.out.println(str);
		char[] crr = str.toCharArray();
		char temp = ' ';
//		for(int i = 0; i<=crr.length-1; i++) {
//			temp = crr[i];
//			crr[i] = crr[crr.length-2];
//			crr[crr.length-2] = temp;
//		}
		
		temp = crr[5];
		crr[5] = crr[crr.length-3];
		crr[crr.length-3] = temp;
		System.out.println(new String(crr));
	}

}
